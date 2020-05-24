package xmlcompiler.visitor;

import org.antlr.v4.runtime.ParserRuleContext;
import xmlcompiler.generated.XmlExprBaseVisitor;
import exceptions.NotDefinedVariable;
import exceptions.NotValidCast;
import xmlcompiler.generated.XmlExprParser;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XmlExprVisitorImpl extends XmlExprBaseVisitor<String> {
    private static final String COMPILED_PACKAGE_NAME = "result";
    private String className;
    private Map<String, Type> globalVariable = new HashMap<>();
    private Map<String, Type> localVariable = new HashMap<>();
    private Map<String, Type> functionNames = new HashMap<>();

    public XmlExprVisitorImpl(String fileName) {
        String fileNameForClass = getStringWithFirstCapital(fileName);
        this.className = replaceDot(fileNameForClass);
    }

    private String getStringWithFirstCapital(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    private String replaceDot(String string) {
        return string.replaceAll("[.]", "_");
    }

    private boolean isGlobal(ParserRuleContext ctx) {
        return ctx.getParent().getParent() instanceof XmlExprParser.ParseContext;
    }

    private void addVariableToList(ParserRuleContext ctx, String name, Type type) {
        if (isGlobal(ctx)) {
            globalVariable.put(name, type);
        } else {
            localVariable.put(name, type);
        }
    }

    private void addToLocalVariableList(String name, Type type) {
        localVariable.put(name, type);
    }

    private void clearLocalVariableList() {
        localVariable.clear();
    }

    private void addToFunctionList(String name, Type type) {
        functionNames.put(name, type);
    }

    private void checkVariable(String name) {
        if (!(globalVariable.containsKey(name) || localVariable.containsKey(name))) {
            try {
                throw new NotDefinedVariable("Variable " + name + " is not defined");
            } catch (NotDefinedVariable notDefinedVariable) {
                notDefinedVariable.printStackTrace();
                System.exit(-1);
            }
        }
    }

    private void checkFunction(String name) {
        if (!(functionNames.containsKey(name))) {
            try {
                throw new NotDefinedVariable("Function " + name + " is not defined");
            } catch (NotDefinedVariable notDefinedVariable) {
                notDefinedVariable.printStackTrace();
                System.exit(-2);
            }
        }
    }

    private void checkCast(String name, Type needType) {
        try {
            if (localVariable.containsKey(name)) {
                if (!(localVariable.get(name).equals(needType))) {
                    throw new NotValidCast("Variable " + name + " need have type " + needType);
                }
            } else {
                if (!(globalVariable.get(name).equals(needType))) {
                    throw new NotValidCast("Variable " + name + " need have type " + needType);
                }
            }
        } catch (NotValidCast notValidCast) {
            notValidCast.printStackTrace();
            System.exit(-3);
        }
    }

    private void checkCastFunction(String name, Type needType) {
        if (!(functionNames.get(name).equals(needType))) {
            try {
                throw new NotValidCast("Function " + name + " need have type " + needType);
            } catch (NotValidCast notValidCast) {
                notValidCast.printStackTrace();
                System.exit(-4);
            }
        }

    }

    private Type getTypeVariable(String name) {
        if (localVariable.containsKey(name)) {
            return localVariable.get(name);
        } else {
            return globalVariable.get(name);
        }
    }

    private boolean notExistLocaleVariable(String name) {
        return !localVariable.containsKey(name);
    }

    // important code
    @Override
    public String visitParse(XmlExprParser.ParseContext ctx) {
        String buffer = "// program " + className + ". Compiled at " + new Date().toString() + "\n";
        buffer += "package " + COMPILED_PACKAGE_NAME + ";\n";
        buffer += "public class " + className + " {\n";

        // write parsed global variables
        List<XmlExprParser.CreateContext> createContextList = ctx.create();
        for (XmlExprParser.CreateContext createContext : createContextList) {
            buffer += "static " + this.visit(createContext);
            buffer += "\n";
        }
        // write functions
        List<XmlExprParser.FunctionContext> functionContextList = ctx.function();
        for (XmlExprParser.FunctionContext functionContext : functionContextList) {
            buffer += this.visit(functionContext);
            buffer += "\n";
        }
        // write main-function
        buffer += this.visit(ctx.main());

        buffer += "}\n";
        return buffer;
    }

    @Override
    public String visitMain(XmlExprParser.MainContext ctx) {
        clearLocalVariableList();
        return "public static void main(String[]args) throws Exception{\n" +
                this.visit(ctx.start()) +
                "}\n";
    }

    @Override
    public String visitStart(XmlExprParser.StartContext ctx) {
        String buffer = "";
        for (int children = 0; children < ctx.getChildCount(); children++) {
            buffer += "";
            buffer += this.visit(ctx.getChild(children));
            buffer += "\n";
        }
        return buffer;
    }

    @Override
    public String visitCreate_node(XmlExprParser.Create_nodeContext ctx) {
        String name = ctx.ID().getText();
        String newVariable = "";
        if (notExistLocaleVariable(name)) {
            addVariableToList(ctx, name, Type.NODE);
            newVariable = Type.NODE.toString() + " ";
        }
        String nameObject = this.visit(ctx.name_object_node());
        return newVariable + name + " = " + nameObject;
    }

    @Override
    public String visitCreate_attribute(XmlExprParser.Create_attributeContext ctx) {
        String name = ctx.ID().getText();
        String newVariable = "";
        if (notExistLocaleVariable(name)) {
            addVariableToList(ctx, name, Type.ATTRIBUTE);
            newVariable = Type.ATTRIBUTE.toString() + " ";
        }
        String nameObject = this.visit(ctx.name_object_attribute());
        return newVariable + name + " = " + nameObject;
    }

    @Override
    public String visitNameObjectNode(XmlExprParser.NameObjectNodeContext ctx) {
        XmlExprParser.Create_nodeContext context = (XmlExprParser.Create_nodeContext) ctx.getParent();
        String idName = context.ID().getText();
        Type type = getTypeVariable(idName);
        return "new " + type + "(" + ctx.STRING().getText() + ");";
    }

    @Override
    public String visitIdNode(XmlExprParser.IdNodeContext ctx) {
        String right = ctx.ID().getText();
        checkVariable(right);
        XmlExprParser.Create_nodeContext context = (XmlExprParser.Create_nodeContext) ctx.getParent();
        String left = context.ID().getText();
        checkCast(right, getTypeVariable(left));
        return right + ";";
    }

    @Override
    public String visitFunctionCallNode(XmlExprParser.FunctionCallNodeContext ctx) {
        XmlExprParser.Function_callContext context = ctx.function_call();
        String funName = context.ID().getText();
        checkFunction(funName);
        XmlExprParser.Create_nodeContext contextP = (XmlExprParser.Create_nodeContext) ctx.getParent();
        String left = contextP.ID().getText();
        checkCastFunction(funName, getTypeVariable(left));
        return funName + this.visit(context.param_call());
    }

    @Override
    public String visitNameObjectAttribute(XmlExprParser.NameObjectAttributeContext ctx) {
        String name = ctx.connect().name.getText();
        String value = ctx.connect().value.getText();
        XmlExprParser.Create_attributeContext context = (XmlExprParser.Create_attributeContext) ctx.getParent();
        String idName = context.ID().getText();
        Type type = getTypeVariable(idName);
        return "new " + type + "(" + name + ", " + value + ");";
    }

    @Override
    public String visitIdAttribute(XmlExprParser.IdAttributeContext ctx) {
        String right = ctx.ID().getText();
        checkVariable(right);
        XmlExprParser.Create_attributeContext context = (XmlExprParser.Create_attributeContext) ctx.getParent();
        String left = context.ID().getText();
        checkCast(right, getTypeVariable(left));
        return right + ";";
    }

    @Override
    public String visitFunctionCallAttribute(XmlExprParser.FunctionCallAttributeContext ctx) {
        XmlExprParser.Function_callContext context = ctx.function_call();
        String funName = context.ID().getText();
        checkFunction(funName);
        XmlExprParser.Create_attributeContext contextP = (XmlExprParser.Create_attributeContext) ctx.getParent();
        String left = contextP.ID().getText();
        checkCastFunction(funName, getTypeVariable(left));
        return funName + this.visit(context.param_call());
    }

    @Override
    public String visitPush_in_node(XmlExprParser.Push_in_nodeContext ctx) {
        String idName = ctx.id.getText();
        checkVariable(idName);
        checkCast(idName, Type.NODE);
        String pushAction = this.visit(ctx.push_more());
        return idName + pushAction;
    }

    @Override
    public String visitPushMore(XmlExprParser.PushMoreContext ctx) {
        String toPush = ctx.ID().getText();
        checkVariable(toPush);
        return ".add(" + toPush + ")" + this.visit(ctx.push_more());
    }

    @Override
    public String visitPushOne(XmlExprParser.PushOneContext ctx) {
        String toPush = ctx.ID().getText();
        checkVariable(toPush);
        return ".add(" + toPush + ");";
    }

    @Override
    public String visitPull_from_node(XmlExprParser.Pull_from_nodeContext ctx) {
        String idName = ctx.id.getText();
        checkVariable(idName);
        String pullAction = this.visit(ctx.pull_more());
        return idName + pullAction;
    }

    @Override
    public String visitPullMore(XmlExprParser.PullMoreContext ctx) {
        String toPull = ctx.ID().getText();
        checkVariable(toPull);
        return ".remove(" + toPull + ")" + this.visit(ctx.pull_more());
    }

    @Override
    public String visitPullOne(XmlExprParser.PullOneContext ctx) {
        String toPull = ctx.ID().getText();
        checkVariable(toPull);
        return ".remove(" + toPull + ");";
    }

    @Override
    public String visitPrint(XmlExprParser.PrintContext ctx) {
        return "System.out.println(" + this.visit(ctx.print_expr()) + ");";
    }

    @Override
    public String visitConcatString(XmlExprParser.ConcatStringContext ctx) {
        String string1 = this.visit(ctx.print_expr(0));
        String string2 = this.visit(ctx.print_expr(1));
        return string1 + " + " + string2;
    }

    @Override
    public String visitPrintId(XmlExprParser.PrintIdContext ctx) {
        String idName = ctx.ID().toString();
        checkVariable(idName);
        return idName;
    }

    @Override
    public String visitPrintString(XmlExprParser.PrintStringContext ctx) {
        return ctx.STRING().getText();
    }

    @Override public String visitStat_block(XmlExprParser.Stat_blockContext ctx) {
        Map<String, Type> beforeStatBlock = new HashMap(localVariable);
        String block = "{\n" + this.visit(ctx.start()) +"}";
        localVariable = beforeStatBlock;
        return block;
    }

    @Override
    public String visitIf_stat(XmlExprParser.If_statContext ctx) {
        String buffer = "";
        List<XmlExprParser.Condition_blockContext> conditions =  ctx.condition_block();
        for(int index = 0; index < conditions.size(); index++) {
            String conditionString = this.visit(conditions.get(index).condition());
            String negation ="";
            if (conditions.get(index).NEGATION() != null){
                negation = "!";
            }
            buffer += "if (" + negation + conditionString + ")";
            buffer += this.visit(conditions.get(index).stat_block());
            if ((index + 1) < conditions.size()){
                buffer += "else ";
            }
        }
        if(ctx.stat_block() != null) {
            buffer += "else" + this.visit(ctx.stat_block());
        }
        return buffer;
    }

    @Override public String visitCondition_block(XmlExprParser.Condition_blockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitEqualityExpr(XmlExprParser.EqualityExprContext ctx) {
        String left = ctx.ID(0).getText();
        checkVariable(left);
        String right = ctx.ID(1).getText();
        checkVariable(right);
        switch (ctx.op.getType()) {
            case XmlExprParser.EQ:
                return left + ".equals("+ right + ")";
            case XmlExprParser.NEQ:
                return "!" + left + ".equals("+ right + ")";
            default:
                throw new RuntimeException("Unknown operator: " + ctx.op.getText());
        }
    }

    @Override public String visitContain(XmlExprParser.ContainContext ctx) {
        String left = ctx.ID(0).getText();
        checkVariable(left);
        checkCast(left, Type.NODE);
        String right = ctx.ID(1).getText();
        checkVariable(right);
        return left + ".contain("+ right + ")";
    }

    @Override public String visitCheckType(XmlExprParser.CheckTypeContext ctx) {
        String left = ctx.ID().getText();
        checkVariable(left);
        String right = ctx.type().getText();
        right = getStringWithFirstCapital(right);
        return left + ".getClass().getSimpleName().equals(\"" + right + "\")";
    }

    @Override
    public String visitWhile_stat(XmlExprParser.While_statContext ctx) {
        return "while (" + this.visit(ctx.condition_block().condition()) + ")" +
                this.visit(ctx.condition_block().stat_block());
    }

    @Override
    public String visitForeach_stat(XmlExprParser.Foreach_statContext ctx) {
//        Map<String, Type> beforeStatBlock = new HashMap(localVariable);
        String forBlock = "for (" + this.visit(ctx.condition_for_each()) + ")" +
                this.visit(ctx.stat_block());
//        localVariable = beforeStatBlock;
        return forBlock;
    }

    @Override
    public String  visitForEachNode(XmlExprParser.ForEachNodeContext ctx) {
        String left = ctx.ID(0).getText();
        addToLocalVariableList(left, Type.NODE);
        String right = ctx.ID(1).getText();
        checkVariable(right);
        checkCast(right, Type.NODE);
        return "Node " + left + " : "+ right + ".getNodes()";
    }

    @Override
    public String visitForEachAttribute(XmlExprParser.ForEachAttributeContext ctx) {
        String left = ctx.ID(0).getText();
        addToLocalVariableList(left, Type.ATTRIBUTE);
        String right = ctx.ID(1).getText();
        checkVariable(right);
        checkCast(right, Type.NODE);
        return "Attribute " + left + " : "+ right + ".getAttributes()";
    }

    @Override
    public String visitReturn_id(XmlExprParser.Return_idContext ctx) {
        String id = ctx.ID().getText();
        checkVariable(id);
        XmlExprParser.ReturnFunctionContext context = (XmlExprParser.ReturnFunctionContext) ctx.getParent().getParent();
        checkCast(id, Type.getTypeByString(getStringWithFirstCapital(context.type().getText())));
        return "return " + id + ";\n";
    }

    @Override
    public String visitFunction_call(XmlExprParser.Function_callContext ctx) {
        String name = ctx.ID().getText();
        checkFunction(name);
        return name + this.visit(ctx.param_call());
    }


    @Override
    public String visitParam_call(XmlExprParser.Param_callContext ctx) {
        String args = "";
        if (ctx.arg_call() != null){
            args = this.visit(ctx.arg_call());
        }
        return "(" + args + ");";
    }

    @Override
    public String visitVoidFunction(XmlExprParser.VoidFunctionContext ctx) {
        clearLocalVariableList();
        String funName = ctx.ID().getText();
        addToFunctionList(funName, Type.VOID);
        return "private static void " + funName + this.visit(ctx.param()) + this.visit(ctx.stat_block());
    }

    @Override
    public String visitReturnFunction(XmlExprParser.ReturnFunctionContext ctx) {
        clearLocalVariableList();
        String funName = ctx.ID().getText();
        String returnType = ctx.type().getText();
        returnType = getStringWithFirstCapital(returnType);
        addToFunctionList(funName, Type.getTypeByString(returnType));
        return "private static " + returnType + " " + funName +
                this.visit(ctx.param()) +
                this.visit(ctx.stat_block_with_return());
    }

    @Override
    public String visitStat_block_with_return(XmlExprParser.Stat_block_with_returnContext ctx) {
        return "{\n" + this.visit(ctx.start()) + this.visit(ctx.return_id()) +"}";
    }

    @Override
    public String visitParamCallArgs(XmlExprParser.ParamCallArgsContext ctx) {
        String param = ctx.ID().getText();
        checkVariable(param);
        return param + ", " + this.visit(ctx.arg_call());
    }

    @Override
    public String visitParamCallArg(XmlExprParser.ParamCallArgContext ctx) {
        String param = ctx.ID().getText();
        checkVariable(param);
        return param;
    }

    @Override
    public String visitParam(XmlExprParser.ParamContext ctx) {
        String args = "";
        if (ctx.arg() != null){
            args = this.visit(ctx.arg());
        }
        return "(" + args + ")";
    }

    @Override
    public String visitParamArgs(XmlExprParser.ParamArgsContext ctx) {
        String type = ctx.type().getText();
        type = getStringWithFirstCapital(type);
        String name = ctx.ID().getText();
        addToLocalVariableList(name, Type.getTypeByString(type));
        return type + " " + name + ", " + this.visit(ctx.arg());
    }

    @Override
    public String visitParamArg(XmlExprParser.ParamArgContext ctx) {
        String type = ctx.type().getText();
        type = getStringWithFirstCapital(type);
        String name = ctx.ID().getText();
        addToLocalVariableList(name, Type.getTypeByString(type));
        return type + " " + name;
    }
}
