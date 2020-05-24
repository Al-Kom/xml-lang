// Generated from /home/ksan/IdeaProjects/xml-lang/src/main/antlr4/XmlExpr.g4 by ANTLR 4.8
package xmlcompiler.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XmlExprParser}.
 */
public interface XmlExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(XmlExprParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(XmlExprParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(XmlExprParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(XmlExprParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#create_node}.
	 * @param ctx the parse tree
	 */
	void enterCreate_node(XmlExprParser.Create_nodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#create_node}.
	 * @param ctx the parse tree
	 */
	void exitCreate_node(XmlExprParser.Create_nodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#create_attribute}.
	 * @param ctx the parse tree
	 */
	void enterCreate_attribute(XmlExprParser.Create_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#create_attribute}.
	 * @param ctx the parse tree
	 */
	void exitCreate_attribute(XmlExprParser.Create_attributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameObjectNode}
	 * labeled alternative in {@link XmlExprParser#name_object_node}.
	 * @param ctx the parse tree
	 */
	void enterNameObjectNode(XmlExprParser.NameObjectNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameObjectNode}
	 * labeled alternative in {@link XmlExprParser#name_object_node}.
	 * @param ctx the parse tree
	 */
	void exitNameObjectNode(XmlExprParser.NameObjectNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallNode}
	 * labeled alternative in {@link XmlExprParser#name_object_node}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallNode(XmlExprParser.FunctionCallNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallNode}
	 * labeled alternative in {@link XmlExprParser#name_object_node}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallNode(XmlExprParser.FunctionCallNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idNode}
	 * labeled alternative in {@link XmlExprParser#name_object_node}.
	 * @param ctx the parse tree
	 */
	void enterIdNode(XmlExprParser.IdNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idNode}
	 * labeled alternative in {@link XmlExprParser#name_object_node}.
	 * @param ctx the parse tree
	 */
	void exitIdNode(XmlExprParser.IdNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameObjectAttribute}
	 * labeled alternative in {@link XmlExprParser#name_object_attribute}.
	 * @param ctx the parse tree
	 */
	void enterNameObjectAttribute(XmlExprParser.NameObjectAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameObjectAttribute}
	 * labeled alternative in {@link XmlExprParser#name_object_attribute}.
	 * @param ctx the parse tree
	 */
	void exitNameObjectAttribute(XmlExprParser.NameObjectAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallAttribute}
	 * labeled alternative in {@link XmlExprParser#name_object_attribute}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallAttribute(XmlExprParser.FunctionCallAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallAttribute}
	 * labeled alternative in {@link XmlExprParser#name_object_attribute}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallAttribute(XmlExprParser.FunctionCallAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAttribute}
	 * labeled alternative in {@link XmlExprParser#name_object_attribute}.
	 * @param ctx the parse tree
	 */
	void enterIdAttribute(XmlExprParser.IdAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAttribute}
	 * labeled alternative in {@link XmlExprParser#name_object_attribute}.
	 * @param ctx the parse tree
	 */
	void exitIdAttribute(XmlExprParser.IdAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#connect}.
	 * @param ctx the parse tree
	 */
	void enterConnect(XmlExprParser.ConnectContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#connect}.
	 * @param ctx the parse tree
	 */
	void exitConnect(XmlExprParser.ConnectContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(XmlExprParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(XmlExprParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(XmlExprParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(XmlExprParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(XmlExprParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(XmlExprParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#push_in_node}.
	 * @param ctx the parse tree
	 */
	void enterPush_in_node(XmlExprParser.Push_in_nodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#push_in_node}.
	 * @param ctx the parse tree
	 */
	void exitPush_in_node(XmlExprParser.Push_in_nodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#pull_from_node}.
	 * @param ctx the parse tree
	 */
	void enterPull_from_node(XmlExprParser.Pull_from_nodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#pull_from_node}.
	 * @param ctx the parse tree
	 */
	void exitPull_from_node(XmlExprParser.Pull_from_nodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pushMore}
	 * labeled alternative in {@link XmlExprParser#push_more}.
	 * @param ctx the parse tree
	 */
	void enterPushMore(XmlExprParser.PushMoreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pushMore}
	 * labeled alternative in {@link XmlExprParser#push_more}.
	 * @param ctx the parse tree
	 */
	void exitPushMore(XmlExprParser.PushMoreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pushOne}
	 * labeled alternative in {@link XmlExprParser#push_more}.
	 * @param ctx the parse tree
	 */
	void enterPushOne(XmlExprParser.PushOneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pushOne}
	 * labeled alternative in {@link XmlExprParser#push_more}.
	 * @param ctx the parse tree
	 */
	void exitPushOne(XmlExprParser.PushOneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pullMore}
	 * labeled alternative in {@link XmlExprParser#pull_more}.
	 * @param ctx the parse tree
	 */
	void enterPullMore(XmlExprParser.PullMoreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pullMore}
	 * labeled alternative in {@link XmlExprParser#pull_more}.
	 * @param ctx the parse tree
	 */
	void exitPullMore(XmlExprParser.PullMoreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pullOne}
	 * labeled alternative in {@link XmlExprParser#pull_more}.
	 * @param ctx the parse tree
	 */
	void enterPullOne(XmlExprParser.PullOneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pullOne}
	 * labeled alternative in {@link XmlExprParser#pull_more}.
	 * @param ctx the parse tree
	 */
	void exitPullOne(XmlExprParser.PullOneContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(XmlExprParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(XmlExprParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(XmlExprParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(XmlExprParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(XmlExprParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(XmlExprParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link XmlExprParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(XmlExprParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link XmlExprParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(XmlExprParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code contain}
	 * labeled alternative in {@link XmlExprParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterContain(XmlExprParser.ContainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code contain}
	 * labeled alternative in {@link XmlExprParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitContain(XmlExprParser.ContainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkType}
	 * labeled alternative in {@link XmlExprParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCheckType(XmlExprParser.CheckTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkType}
	 * labeled alternative in {@link XmlExprParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCheckType(XmlExprParser.CheckTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(XmlExprParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(XmlExprParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#foreach_stat}.
	 * @param ctx the parse tree
	 */
	void enterForeach_stat(XmlExprParser.Foreach_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#foreach_stat}.
	 * @param ctx the parse tree
	 */
	void exitForeach_stat(XmlExprParser.Foreach_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forEachVertex}
	 * labeled alternative in {@link XmlExprParser#condition_for_each}.
	 * @param ctx the parse tree
	 */
	void enterForEachVertex(XmlExprParser.ForEachVertexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forEachVertex}
	 * labeled alternative in {@link XmlExprParser#condition_for_each}.
	 * @param ctx the parse tree
	 */
	void exitForEachVertex(XmlExprParser.ForEachVertexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forEachEdge}
	 * labeled alternative in {@link XmlExprParser#condition_for_each}.
	 * @param ctx the parse tree
	 */
	void enterForEachEdge(XmlExprParser.ForEachEdgeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forEachEdge}
	 * labeled alternative in {@link XmlExprParser#condition_for_each}.
	 * @param ctx the parse tree
	 */
	void exitForEachEdge(XmlExprParser.ForEachEdgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(XmlExprParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(XmlExprParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatString}
	 * labeled alternative in {@link XmlExprParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterConcatString(XmlExprParser.ConcatStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatString}
	 * labeled alternative in {@link XmlExprParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitConcatString(XmlExprParser.ConcatStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printId}
	 * labeled alternative in {@link XmlExprParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrintId(XmlExprParser.PrintIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printId}
	 * labeled alternative in {@link XmlExprParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrintId(XmlExprParser.PrintIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printString}
	 * labeled alternative in {@link XmlExprParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrintString(XmlExprParser.PrintStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printString}
	 * labeled alternative in {@link XmlExprParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrintString(XmlExprParser.PrintStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(XmlExprParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(XmlExprParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#param_call}.
	 * @param ctx the parse tree
	 */
	void enterParam_call(XmlExprParser.Param_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#param_call}.
	 * @param ctx the parse tree
	 */
	void exitParam_call(XmlExprParser.Param_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramCallArg}
	 * labeled alternative in {@link XmlExprParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void enterParamCallArg(XmlExprParser.ParamCallArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramCallArg}
	 * labeled alternative in {@link XmlExprParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void exitParamCallArg(XmlExprParser.ParamCallArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramCallArgs}
	 * labeled alternative in {@link XmlExprParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void enterParamCallArgs(XmlExprParser.ParamCallArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramCallArgs}
	 * labeled alternative in {@link XmlExprParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void exitParamCallArgs(XmlExprParser.ParamCallArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link XmlExprParser#function}.
	 * @param ctx the parse tree
	 */
	void enterVoidFunction(XmlExprParser.VoidFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link XmlExprParser#function}.
	 * @param ctx the parse tree
	 */
	void exitVoidFunction(XmlExprParser.VoidFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link XmlExprParser#function}.
	 * @param ctx the parse tree
	 */
	void enterReturnFunction(XmlExprParser.ReturnFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link XmlExprParser#function}.
	 * @param ctx the parse tree
	 */
	void exitReturnFunction(XmlExprParser.ReturnFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#stat_block_with_return}.
	 * @param ctx the parse tree
	 */
	void enterStat_block_with_return(XmlExprParser.Stat_block_with_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#stat_block_with_return}.
	 * @param ctx the parse tree
	 */
	void exitStat_block_with_return(XmlExprParser.Stat_block_with_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#return_id}.
	 * @param ctx the parse tree
	 */
	void enterReturn_id(XmlExprParser.Return_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#return_id}.
	 * @param ctx the parse tree
	 */
	void exitReturn_id(XmlExprParser.Return_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(XmlExprParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(XmlExprParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramArg}
	 * labeled alternative in {@link XmlExprParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterParamArg(XmlExprParser.ParamArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramArg}
	 * labeled alternative in {@link XmlExprParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitParamArg(XmlExprParser.ParamArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramArgs}
	 * labeled alternative in {@link XmlExprParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterParamArgs(XmlExprParser.ParamArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramArgs}
	 * labeled alternative in {@link XmlExprParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitParamArgs(XmlExprParser.ParamArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlExprParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(XmlExprParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlExprParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(XmlExprParser.TypeContext ctx);
}