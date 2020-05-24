// Generated from /home/ksan/IdeaProjects/xml-lang/src/main/antlr4/XmlExpr.g4 by ANTLR 4.8
package xmlcompiler.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XmlExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XmlExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(XmlExprParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(XmlExprParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#create_node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_node(XmlExprParser.Create_nodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#create_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_attribute(XmlExprParser.Create_attributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameObjectNode}
	 * labeled alternative in {@link XmlExprParser#name_object_node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameObjectNode(XmlExprParser.NameObjectNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallNode}
	 * labeled alternative in {@link XmlExprParser#name_object_node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallNode(XmlExprParser.FunctionCallNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idNode}
	 * labeled alternative in {@link XmlExprParser#name_object_node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdNode(XmlExprParser.IdNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameObjectAttribute}
	 * labeled alternative in {@link XmlExprParser#name_object_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameObjectAttribute(XmlExprParser.NameObjectAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallAttribute}
	 * labeled alternative in {@link XmlExprParser#name_object_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallAttribute(XmlExprParser.FunctionCallAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAttribute}
	 * labeled alternative in {@link XmlExprParser#name_object_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAttribute(XmlExprParser.IdAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#connect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnect(XmlExprParser.ConnectContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(XmlExprParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(XmlExprParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(XmlExprParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#push_in_node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush_in_node(XmlExprParser.Push_in_nodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#pull_from_node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPull_from_node(XmlExprParser.Pull_from_nodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pushMore}
	 * labeled alternative in {@link XmlExprParser#push_more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPushMore(XmlExprParser.PushMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pushOne}
	 * labeled alternative in {@link XmlExprParser#push_more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPushOne(XmlExprParser.PushOneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pullMore}
	 * labeled alternative in {@link XmlExprParser#pull_more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPullMore(XmlExprParser.PullMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pullOne}
	 * labeled alternative in {@link XmlExprParser#pull_more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPullOne(XmlExprParser.PullOneContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(XmlExprParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(XmlExprParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(XmlExprParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link XmlExprParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(XmlExprParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contain}
	 * labeled alternative in {@link XmlExprParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContain(XmlExprParser.ContainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkType}
	 * labeled alternative in {@link XmlExprParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckType(XmlExprParser.CheckTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(XmlExprParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#foreach_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_stat(XmlExprParser.Foreach_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forEachAttribute}
	 * labeled alternative in {@link XmlExprParser#condition_for_each}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachAttribute(XmlExprParser.ForEachAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forEachNode}
	 * labeled alternative in {@link XmlExprParser#condition_for_each}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachNode(XmlExprParser.ForEachNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(XmlExprParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concatString}
	 * labeled alternative in {@link XmlExprParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatString(XmlExprParser.ConcatStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printId}
	 * labeled alternative in {@link XmlExprParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintId(XmlExprParser.PrintIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printString}
	 * labeled alternative in {@link XmlExprParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintString(XmlExprParser.PrintStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(XmlExprParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#param_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_call(XmlExprParser.Param_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramCallArg}
	 * labeled alternative in {@link XmlExprParser#arg_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamCallArg(XmlExprParser.ParamCallArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramCallArgs}
	 * labeled alternative in {@link XmlExprParser#arg_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamCallArgs(XmlExprParser.ParamCallArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link XmlExprParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunction(XmlExprParser.VoidFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link XmlExprParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFunction(XmlExprParser.ReturnFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#stat_block_with_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block_with_return(XmlExprParser.Stat_block_with_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#return_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_id(XmlExprParser.Return_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(XmlExprParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramArg}
	 * labeled alternative in {@link XmlExprParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamArg(XmlExprParser.ParamArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramArgs}
	 * labeled alternative in {@link XmlExprParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamArgs(XmlExprParser.ParamArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(XmlExprParser.TypeContext ctx);
}