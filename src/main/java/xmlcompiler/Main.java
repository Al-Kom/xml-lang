package xmlcompiler;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import xmlcompiler.generated.XmlExprLexer;
import xmlcompiler.generated.XmlExprParser;
import xmlcompiler.generated.XmlExprVisitor;
import xmlcompiler.visitor.XmlExprVisitorImpl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import static xmlcompiler.config.Configuration.*;

public class Main {

    public static void main(String[] args) {
        // get file to parse
        String inputFileName = "";
        if (args.length == 1) {
            inputFileName = args[0];
        } else {
            System.out.print("Not valid arg");
            System.exit(-1);
        }
        // parse file
        CharStream charStream = null;
        try {
            charStream = CharStreams.fromFileName(inputFileName);
        } catch (IOException e) {
            System.err.println("Error while reading in " + inputFileName);
            e.printStackTrace();
        }
        if (charStream == null)
            System.err.println("File is not found");

        XmlExprLexer lexer = new XmlExprLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        XmlExprParser parser = new XmlExprParser(commonTokenStream);

        ParseTree tree = parser.parse();
        XmlExprVisitor visitor = new XmlExprVisitorImpl();
        String output = (String) visitor.visit(tree);

        try (PrintWriter printer = new PrintWriter(FILE_PATH + FILENAME)) {
            Runtime.getRuntime().exec("mkdir -p " + FILE_PATH);
            printer.print(output);
        } catch (FileNotFoundException e) {
            System.err.println("Error while writing in " + FILE_PATH + FILENAME);
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Can not create directories: " + FILE_PATH);
            e.printStackTrace();
        }
    }
}
