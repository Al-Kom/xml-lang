package xmlcompiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import xmlcompiler.generated.XmlExprBaseVisitor;
import xmlcompiler.generated.XmlExprLexer;
import xmlcompiler.generated.XmlExprParser;
import xmlcompiler.generated.XmlExprVisitor;
import xmlcompiler.visitor.XmlExprVisitorImpl;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

    private static final String FILEPATH = "Result.java";

    public static void main(String[] args) {
        // get file to parse
        String fileName = "";
        if (args.length == 1){
            fileName = args[0];
        } else {
            System.out.print("Not valid arg");
            System.exit(-1);
        }
        // parse file
        ANTLRInputStream inputStream = new ANTLRInputStream(
                "main{}");
        XmlExprLexer lexer = new XmlExprLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        XmlExprParser parser = new XmlExprParser(commonTokenStream);

        ParseTree tree = parser.parse();
        XmlExprVisitor visitor = new XmlExprVisitorImpl(fileName);
        String output = (String) visitor.visit(tree);
        System.out.println(output);

        try (PrintWriter printer = new PrintWriter(FILEPATH)) {
            printer.print(output);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
