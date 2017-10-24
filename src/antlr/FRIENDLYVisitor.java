package antlr;

// Generated from FRIENDLY.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FRIENDLYParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FRIENDLYVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(FRIENDLYParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(FRIENDLYParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(FRIENDLYParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(FRIENDLYParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(FRIENDLYParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(FRIENDLYParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(FRIENDLYParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(FRIENDLYParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(FRIENDLYParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(FRIENDLYParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(FRIENDLYParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(FRIENDLYParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(FRIENDLYParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(FRIENDLYParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(FRIENDLYParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(FRIENDLYParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(FRIENDLYParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(FRIENDLYParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(FRIENDLYParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(FRIENDLYParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(FRIENDLYParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(FRIENDLYParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(FRIENDLYParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(FRIENDLYParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(FRIENDLYParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(FRIENDLYParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(FRIENDLYParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(FRIENDLYParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(FRIENDLYParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(FRIENDLYParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(FRIENDLYParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(FRIENDLYParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(FRIENDLYParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(FRIENDLYParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(FRIENDLYParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(FRIENDLYParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(FRIENDLYParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(FRIENDLYParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(FRIENDLYParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(FRIENDLYParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(FRIENDLYParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(FRIENDLYParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(FRIENDLYParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(FRIENDLYParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(FRIENDLYParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(FRIENDLYParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(FRIENDLYParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(FRIENDLYParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(FRIENDLYParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(FRIENDLYParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(FRIENDLYParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(FRIENDLYParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(FRIENDLYParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#annotationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationName(FRIENDLYParser.AnnotationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(FRIENDLYParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(FRIENDLYParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(FRIENDLYParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(FRIENDLYParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(FRIENDLYParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(FRIENDLYParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(FRIENDLYParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(FRIENDLYParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(FRIENDLYParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(FRIENDLYParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(FRIENDLYParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(FRIENDLYParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(FRIENDLYParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(FRIENDLYParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(FRIENDLYParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(FRIENDLYParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#commonErrorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonErrorStatement(FRIENDLYParser.CommonErrorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FRIENDLYParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(FRIENDLYParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(FRIENDLYParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(FRIENDLYParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(FRIENDLYParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(FRIENDLYParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(FRIENDLYParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(FRIENDLYParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(FRIENDLYParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(FRIENDLYParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(FRIENDLYParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(FRIENDLYParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(FRIENDLYParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(FRIENDLYParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(FRIENDLYParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(FRIENDLYParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(FRIENDLYParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FRIENDLYParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(FRIENDLYParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(FRIENDLYParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(FRIENDLYParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(FRIENDLYParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(FRIENDLYParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(FRIENDLYParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(FRIENDLYParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(FRIENDLYParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(FRIENDLYParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(FRIENDLYParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(FRIENDLYParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(FRIENDLYParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(FRIENDLYParser.ArgumentsContext ctx);
}