package antlr;

// Generated from FRIENDLY.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FRIENDLYParser}.
 */
public interface FRIENDLYListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(FRIENDLYParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(FRIENDLYParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(FRIENDLYParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(FRIENDLYParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(FRIENDLYParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(FRIENDLYParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(FRIENDLYParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(FRIENDLYParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(FRIENDLYParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(FRIENDLYParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(FRIENDLYParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(FRIENDLYParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(FRIENDLYParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(FRIENDLYParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(FRIENDLYParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(FRIENDLYParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(FRIENDLYParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(FRIENDLYParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(FRIENDLYParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(FRIENDLYParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(FRIENDLYParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(FRIENDLYParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(FRIENDLYParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(FRIENDLYParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(FRIENDLYParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(FRIENDLYParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(FRIENDLYParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(FRIENDLYParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(FRIENDLYParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(FRIENDLYParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(FRIENDLYParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(FRIENDLYParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(FRIENDLYParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(FRIENDLYParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(FRIENDLYParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(FRIENDLYParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(FRIENDLYParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(FRIENDLYParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(FRIENDLYParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(FRIENDLYParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(FRIENDLYParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(FRIENDLYParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(FRIENDLYParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(FRIENDLYParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(FRIENDLYParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(FRIENDLYParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(FRIENDLYParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(FRIENDLYParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(FRIENDLYParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(FRIENDLYParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(FRIENDLYParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(FRIENDLYParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(FRIENDLYParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(FRIENDLYParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(FRIENDLYParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(FRIENDLYParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(FRIENDLYParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(FRIENDLYParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(FRIENDLYParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(FRIENDLYParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(FRIENDLYParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(FRIENDLYParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(FRIENDLYParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(FRIENDLYParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(FRIENDLYParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(FRIENDLYParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(FRIENDLYParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(FRIENDLYParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(FRIENDLYParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(FRIENDLYParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(FRIENDLYParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(FRIENDLYParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(FRIENDLYParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(FRIENDLYParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(FRIENDLYParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(FRIENDLYParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(FRIENDLYParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(FRIENDLYParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(FRIENDLYParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(FRIENDLYParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(FRIENDLYParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(FRIENDLYParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(FRIENDLYParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(FRIENDLYParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(FRIENDLYParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(FRIENDLYParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(FRIENDLYParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(FRIENDLYParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(FRIENDLYParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(FRIENDLYParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(FRIENDLYParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(FRIENDLYParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(FRIENDLYParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(FRIENDLYParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(FRIENDLYParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(FRIENDLYParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(FRIENDLYParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(FRIENDLYParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(FRIENDLYParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(FRIENDLYParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(FRIENDLYParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(FRIENDLYParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(FRIENDLYParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(FRIENDLYParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(FRIENDLYParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(FRIENDLYParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(FRIENDLYParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(FRIENDLYParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(FRIENDLYParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(FRIENDLYParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(FRIENDLYParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(FRIENDLYParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(FRIENDLYParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(FRIENDLYParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(FRIENDLYParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(FRIENDLYParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(FRIENDLYParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(FRIENDLYParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(FRIENDLYParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(FRIENDLYParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(FRIENDLYParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(FRIENDLYParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(FRIENDLYParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(FRIENDLYParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(FRIENDLYParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(FRIENDLYParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(FRIENDLYParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(FRIENDLYParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(FRIENDLYParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(FRIENDLYParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(FRIENDLYParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(FRIENDLYParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(FRIENDLYParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(FRIENDLYParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(FRIENDLYParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(FRIENDLYParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(FRIENDLYParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(FRIENDLYParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(FRIENDLYParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(FRIENDLYParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#commonErrorStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommonErrorStatement(FRIENDLYParser.CommonErrorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#commonErrorStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommonErrorStatement(FRIENDLYParser.CommonErrorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FRIENDLYParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FRIENDLYParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(FRIENDLYParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(FRIENDLYParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(FRIENDLYParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(FRIENDLYParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(FRIENDLYParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(FRIENDLYParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(FRIENDLYParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(FRIENDLYParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(FRIENDLYParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(FRIENDLYParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(FRIENDLYParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(FRIENDLYParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(FRIENDLYParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(FRIENDLYParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(FRIENDLYParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(FRIENDLYParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(FRIENDLYParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(FRIENDLYParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(FRIENDLYParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(FRIENDLYParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(FRIENDLYParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(FRIENDLYParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(FRIENDLYParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(FRIENDLYParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(FRIENDLYParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(FRIENDLYParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(FRIENDLYParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(FRIENDLYParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(FRIENDLYParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(FRIENDLYParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(FRIENDLYParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(FRIENDLYParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FRIENDLYParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FRIENDLYParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(FRIENDLYParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(FRIENDLYParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(FRIENDLYParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(FRIENDLYParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(FRIENDLYParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(FRIENDLYParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(FRIENDLYParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(FRIENDLYParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(FRIENDLYParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(FRIENDLYParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(FRIENDLYParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(FRIENDLYParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(FRIENDLYParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(FRIENDLYParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(FRIENDLYParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(FRIENDLYParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(FRIENDLYParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(FRIENDLYParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(FRIENDLYParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(FRIENDLYParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(FRIENDLYParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(FRIENDLYParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(FRIENDLYParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(FRIENDLYParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(FRIENDLYParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(FRIENDLYParser.ArgumentsContext ctx);
}