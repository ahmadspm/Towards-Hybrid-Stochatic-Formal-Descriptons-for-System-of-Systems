/*
 * generated by Xtext 2.19.0
 */
package org.xtext.sosModeling.archModeling.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.sosModeling.archModeling.ide.contentassist.antlr.internal.InternalSFDSLParser;
import org.xtext.sosModeling.archModeling.services.SFDSLGrammarAccess;

public class SFDSLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SFDSLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SFDSLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getPortandRoleTypeAccess().getAlternatives(), "rule__PortandRoleType__Alternatives");
			builder.put(grammarAccess.getExponentialRatesAccess().getAlternatives(), "rule__ExponentialRates__Alternatives");
			builder.put(grammarAccess.getCConsDeclAccess().getAlternatives(), "rule__CConsDecl__Alternatives");
			builder.put(grammarAccess.getTypesAccess().getAlternatives(), "rule__Types__Alternatives");
			builder.put(grammarAccess.getInitValsAccess().getAlternatives(), "rule__InitVals__Alternatives");
			builder.put(grammarAccess.getBooleanAccess().getAlternatives(), "rule__Boolean__Alternatives");
			builder.put(grammarAccess.getLogicalExpressionAccess().getOpAlternatives_1_1_0(), "rule__LogicalExpression__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getEqualityExpressionAccess().getOpAlternatives_1_1_0(), "rule__EqualityExpression__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getRelationalExpressionAccess().getOpAlternatives_1_1_0(), "rule__RelationalExpression__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getArithmeticExpressionAccess().getAlternatives_1_0(), "rule__ArithmeticExpression__Alternatives_1_0");
			builder.put(grammarAccess.getTermAccess().getOpAlternatives_1_1_0(), "rule__Term__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getFactorAccess().getAlternatives(), "rule__Factor__Alternatives");
			builder.put(grammarAccess.getAtomicElementAccess().getAlternatives(), "rule__AtomicElement__Alternatives");
			builder.put(grammarAccess.getLiteralElementAccess().getAlternatives(), "rule__LiteralElement__Alternatives");
			builder.put(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_1_0(), "rule__BooleanLiteral__ValueAlternatives_1_0");
			builder.put(grammarAccess.getModelElementsDecarationAccess().getGroup(), "rule__ModelElementsDecaration__Group__0");
			builder.put(grammarAccess.getCSDeclAccess().getGroup(), "rule__CSDecl__Group__0");
			builder.put(grammarAccess.getCSMembersDefintionAccess().getGroup(), "rule__CSMembersDefintion__Group__0");
			builder.put(grammarAccess.getStochsticBehaviorsAccess().getGroup(), "rule__StochsticBehaviors__Group__0");
			builder.put(grammarAccess.getStochsticBehaviorsAccess().getGroup_5(), "rule__StochsticBehaviors__Group_5__0");
			builder.put(grammarAccess.getPublicinterfaeceDefAccess().getGroup(), "rule__PublicinterfaeceDef__Group__0");
			builder.put(grammarAccess.getPublicinterfaeceDefAccess().getGroup_4(), "rule__PublicinterfaeceDef__Group_4__0");
			builder.put(grammarAccess.getFormalParametersAccess().getGroup(), "rule__FormalParameters__Group__0");
			builder.put(grammarAccess.getFormalParameterListAccess().getGroup(), "rule__FormalParameterList__Group__0");
			builder.put(grammarAccess.getFormalParameterAccess().getGroup(), "rule__FormalParameter__Group__0");
			builder.put(grammarAccess.getVariableDeclaratorIdAccess().getGroup(), "rule__VariableDeclaratorId__Group__0");
			builder.put(grammarAccess.getVariableDeclaratorIdAccess().getGroup_1(), "rule__VariableDeclaratorId__Group_1__0");
			builder.put(grammarAccess.getProtDeclarationAccess().getGroup(), "rule__ProtDeclaration__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getAElementsBehaviorRoutinesAccess().getGroup(), "rule__AElementsBehaviorRoutines__Group__0");
			builder.put(grammarAccess.getCColActionsAccess().getGroup(), "rule__CColActions__Group__0");
			builder.put(grammarAccess.getCColActionsAccess().getGroup_4(), "rule__CColActions__Group_4__0");
			builder.put(grammarAccess.getFunctinalityAccess().getGroup(), "rule__Functinality__Group__0");
			builder.put(grammarAccess.getAddAElementsAccess().getGroup(), "rule__AddAElements__Group__0");
			builder.put(grammarAccess.getAttachCSsAccess().getGroup(), "rule__AttachCSs__Group__0");
			builder.put(grammarAccess.getDetachCSsAccess().getGroup(), "rule__DetachCSs__Group__0");
			builder.put(grammarAccess.getBindElementsAccess().getGroup(), "rule__BindElements__Group__0");
			builder.put(grammarAccess.getControlDecisionsAccess().getGroup(), "rule__ControlDecisions__Group__0");
			builder.put(grammarAccess.getControlDecisionsAccess().getGroup_3(), "rule__ControlDecisions__Group_3__0");
			builder.put(grammarAccess.getControlDecisionsAccess().getGroup_6(), "rule__ControlDecisions__Group_6__0");
			builder.put(grammarAccess.getControlDecisionsAccess().getGroup_6_2(), "rule__ControlDecisions__Group_6_2__0");
			builder.put(grammarAccess.getControlDecisionsAccess().getGroup_8(), "rule__ControlDecisions__Group_8__0");
			builder.put(grammarAccess.getExponentialRatesAccess().getGroup_0(), "rule__ExponentialRates__Group_0__0");
			builder.put(grammarAccess.getCConsDeclAccess().getGroup_0(), "rule__CConsDecl__Group_0__0");
			builder.put(grammarAccess.getCConsDeclAccess().getGroup_1(), "rule__CConsDecl__Group_1__0");
			builder.put(grammarAccess.getTelloperatorAccess().getGroup(), "rule__Telloperator__Group__0");
			builder.put(grammarAccess.getTelloperatorAccess().getGroup_1(), "rule__Telloperator__Group_1__0");
			builder.put(grammarAccess.getAskopeatorAccess().getGroup(), "rule__Askopeator__Group__0");
			builder.put(grammarAccess.getAskopeatorAccess().getGroup_1(), "rule__Askopeator__Group_1__0");
			builder.put(grammarAccess.getTraitDeclarationAccess().getGroup(), "rule__TraitDeclaration__Group__0");
			builder.put(grammarAccess.getMedDeclAccess().getGroup(), "rule__MedDecl__Group__0");
			builder.put(grammarAccess.getMedRoleDeclarationAccess().getGroup(), "rule__MedRoleDeclaration__Group__0");
			builder.put(grammarAccess.getDefineMediationRolesAccess().getGroup(), "rule__DefineMediationRoles__Group__0");
			builder.put(grammarAccess.getAbsArchDeclAccess().getGroup(), "rule__AbsArchDecl__Group__0");
			builder.put(grammarAccess.getGlobalPropertiesAccess().getGroup(), "rule__GlobalProperties__Group__0");
			builder.put(grammarAccess.getInitValsAccess().getGroup_0(), "rule__InitVals__Group_0__0");
			builder.put(grammarAccess.getInitValsAccess().getGroup_1(), "rule__InitVals__Group_1__0");
			builder.put(grammarAccess.getInitValsAccess().getGroup_3(), "rule__InitVals__Group_3__0");
			builder.put(grammarAccess.getFLOATAccess().getGroup(), "rule__FLOAT__Group__0");
			builder.put(grammarAccess.getLogicalExpressionAccess().getGroup(), "rule__LogicalExpression__Group__0");
			builder.put(grammarAccess.getLogicalExpressionAccess().getGroup_1(), "rule__LogicalExpression__Group_1__0");
			builder.put(grammarAccess.getEqualityExpressionAccess().getGroup(), "rule__EqualityExpression__Group__0");
			builder.put(grammarAccess.getEqualityExpressionAccess().getGroup_1(), "rule__EqualityExpression__Group_1__0");
			builder.put(grammarAccess.getRelationalExpressionAccess().getGroup(), "rule__RelationalExpression__Group__0");
			builder.put(grammarAccess.getRelationalExpressionAccess().getGroup_1(), "rule__RelationalExpression__Group_1__0");
			builder.put(grammarAccess.getArithmeticExpressionAccess().getGroup(), "rule__ArithmeticExpression__Group__0");
			builder.put(grammarAccess.getArithmeticExpressionAccess().getGroup_1(), "rule__ArithmeticExpression__Group_1__0");
			builder.put(grammarAccess.getArithmeticExpressionAccess().getGroup_1_0_0(), "rule__ArithmeticExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getArithmeticExpressionAccess().getGroup_1_0_1(), "rule__ArithmeticExpression__Group_1_0_1__0");
			builder.put(grammarAccess.getTermAccess().getGroup(), "rule__Term__Group__0");
			builder.put(grammarAccess.getTermAccess().getGroup_1(), "rule__Term__Group_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_0(), "rule__Factor__Group_0__0");
			builder.put(grammarAccess.getUnaryExpressionAccess().getGroup(), "rule__UnaryExpression__Group__0");
			builder.put(grammarAccess.getAtomicElementAccess().getGroup_1(), "rule__AtomicElement__Group_1__0");
			builder.put(grammarAccess.getIntegerLiteralAccess().getGroup(), "rule__IntegerLiteral__Group__0");
			builder.put(grammarAccess.getRealLiteralAccess().getGroup(), "rule__RealLiteral__Group__0");
			builder.put(grammarAccess.getStringLiteralAccess().getGroup(), "rule__StringLiteral__Group__0");
			builder.put(grammarAccess.getBooleanLiteralAccess().getGroup(), "rule__BooleanLiteral__Group__0");
			builder.put(grammarAccess.getStochasticModelingAccess().getStochasticModelElementsAssignment(), "rule__StochasticModeling__StochasticModelElementsAssignment");
			builder.put(grammarAccess.getModelElementsDecarationAccess().getAbstractArchModelAssignment_1(), "rule__ModelElementsDecaration__AbstractArchModelAssignment_1");
			builder.put(grammarAccess.getModelElementsDecarationAccess().getConstiuenetSystemSDesignAssignment_2(), "rule__ModelElementsDecaration__ConstiuenetSystemSDesignAssignment_2");
			builder.put(grammarAccess.getModelElementsDecarationAccess().getMediatorDesignAssignment_3(), "rule__ModelElementsDecaration__MediatorDesignAssignment_3");
			builder.put(grammarAccess.getModelElementsDecarationAccess().getConcurrentConstraintsAssignment_4(), "rule__ModelElementsDecaration__ConcurrentConstraintsAssignment_4");
			builder.put(grammarAccess.getModelElementsDecarationAccess().getArchitecutreElementsBehaviorsAssignment_5(), "rule__ModelElementsDecaration__ArchitecutreElementsBehaviorsAssignment_5");
			builder.put(grammarAccess.getModelElementsDecarationAccess().getNameAssignment_7(), "rule__ModelElementsDecaration__NameAssignment_7");
			builder.put(grammarAccess.getModelElementsDecarationAccess().getInterfceAssignment_8(), "rule__ModelElementsDecaration__InterfceAssignment_8");
			builder.put(grammarAccess.getModelElementsDecarationAccess().getArchTraitsAssignment_9(), "rule__ModelElementsDecaration__ArchTraitsAssignment_9");
			builder.put(grammarAccess.getCSDeclAccess().getNameAssignment_1(), "rule__CSDecl__NameAssignment_1");
			builder.put(grammarAccess.getCSDeclAccess().getCSDesignConsistsAssignment_3(), "rule__CSDecl__CSDesignConsistsAssignment_3");
			builder.put(grammarAccess.getCSMembersDefintionAccess().getPortsAssignment_0(), "rule__CSMembersDefintion__PortsAssignment_0");
			builder.put(grammarAccess.getCSMembersDefintionAccess().getAActionsAssignment_1(), "rule__CSMembersDefintion__AActionsAssignment_1");
			builder.put(grammarAccess.getCSMembersDefintionAccess().getCSConConstraintsAssignment_2(), "rule__CSMembersDefintion__CSConConstraintsAssignment_2");
			builder.put(grammarAccess.getCSMembersDefintionAccess().getCSCoreBehaviorAssignment_3(), "rule__CSMembersDefintion__CSCoreBehaviorAssignment_3");
			builder.put(grammarAccess.getStochsticBehaviorsAccess().getTypeAssignment_2(), "rule__StochsticBehaviors__TypeAssignment_2");
			builder.put(grammarAccess.getStochsticBehaviorsAccess().getNameAssignment_3(), "rule__StochsticBehaviors__NameAssignment_3");
			builder.put(grammarAccess.getStochsticBehaviorsAccess().getParamsDeclAssignment_4(), "rule__StochsticBehaviors__ParamsDeclAssignment_4");
			builder.put(grammarAccess.getStochsticBehaviorsAccess().getFunctionsAssignment_7(), "rule__StochsticBehaviors__FunctionsAssignment_7");
			builder.put(grammarAccess.getPublicinterfaeceDefAccess().getNameAssignment_1(), "rule__PublicinterfaeceDef__NameAssignment_1");
			builder.put(grammarAccess.getPublicinterfaeceDefAccess().getParamsDeclAssignment_3(), "rule__PublicinterfaeceDef__ParamsDeclAssignment_3");
			builder.put(grammarAccess.getFormalParametersAccess().getParamsDeclAssignment_2(), "rule__FormalParameters__ParamsDeclAssignment_2");
			builder.put(grammarAccess.getFormalParameterListAccess().getParamDeclAssignment_0(), "rule__FormalParameterList__ParamDeclAssignment_0");
			builder.put(grammarAccess.getFormalParameterListAccess().getParamsDeclAssignment_2(), "rule__FormalParameterList__ParamsDeclAssignment_2");
			builder.put(grammarAccess.getFormalParameterAccess().getTypeAssignment_0(), "rule__FormalParameter__TypeAssignment_0");
			builder.put(grammarAccess.getFormalParameterAccess().getNameAssignment_1(), "rule__FormalParameter__NameAssignment_1");
			builder.put(grammarAccess.getVariableDeclaratorIdAccess().getNameAssignment_0(), "rule__VariableDeclaratorId__NameAssignment_0");
			builder.put(grammarAccess.getProtDeclarationAccess().getPorttypeAssignment_1(), "rule__ProtDeclaration__PorttypeAssignment_1");
			builder.put(grammarAccess.getProtDeclarationAccess().getPubliicIntractionpointareAssignment_3(), "rule__ProtDeclaration__PubliicIntractionpointareAssignment_3");
			builder.put(grammarAccess.getProtDeclarationAccess().getNameAssignment_4(), "rule__ProtDeclaration__NameAssignment_4");
			builder.put(grammarAccess.getAElementsBehaviorRoutinesAccess().getCollaborativeActionsAssignment_1(), "rule__AElementsBehaviorRoutines__CollaborativeActionsAssignment_1");
			builder.put(grammarAccess.getAElementsBehaviorRoutinesAccess().getCaolitionBindingAssignment_2(), "rule__AElementsBehaviorRoutines__CaolitionBindingAssignment_2");
			builder.put(grammarAccess.getAElementsBehaviorRoutinesAccess().getRemoveElementsAssignment_3(), "rule__AElementsBehaviorRoutines__RemoveElementsAssignment_3");
			builder.put(grammarAccess.getAElementsBehaviorRoutinesAccess().getConnectElenentsAssignment_4(), "rule__AElementsBehaviorRoutines__ConnectElenentsAssignment_4");
			builder.put(grammarAccess.getAElementsBehaviorRoutinesAccess().getControlDecisionsAssignment_5(), "rule__AElementsBehaviorRoutines__ControlDecisionsAssignment_5");
			builder.put(grammarAccess.getAElementsBehaviorRoutinesAccess().getActionReatesAssignment_6(), "rule__AElementsBehaviorRoutines__ActionReatesAssignment_6");
			builder.put(grammarAccess.getAElementsBehaviorRoutinesAccess().getAddElementsAssignment_7(), "rule__AElementsBehaviorRoutines__AddElementsAssignment_7");
			builder.put(grammarAccess.getAElementsBehaviorRoutinesAccess().getHSFtypesAssignment_8(), "rule__AElementsBehaviorRoutines__HSFtypesAssignment_8");
			builder.put(grammarAccess.getCColActionsAccess().getNameAssignment_1(), "rule__CColActions__NameAssignment_1");
			builder.put(grammarAccess.getCColActionsAccess().getTypeAssignment_2(), "rule__CColActions__TypeAssignment_2");
			builder.put(grammarAccess.getCColActionsAccess().getParamsDeclAssignment_3(), "rule__CColActions__ParamsDeclAssignment_3");
			builder.put(grammarAccess.getCColActionsAccess().getMethodBodyAssignment_6(), "rule__CColActions__MethodBodyAssignment_6");
			builder.put(grammarAccess.getFunctinalityAccess().getFunctionsAssignment_1(), "rule__Functinality__FunctionsAssignment_1");
			builder.put(grammarAccess.getFunctinalityAccess().getActionsAssignment_2(), "rule__Functinality__ActionsAssignment_2");
			builder.put(grammarAccess.getFunctinalityAccess().getTargetAssignment_4(), "rule__Functinality__TargetAssignment_4");
			builder.put(grammarAccess.getAddAElementsAccess().getNameAssignment_2(), "rule__AddAElements__NameAssignment_2");
			builder.put(grammarAccess.getAddAElementsAccess().getTypeAssignment_5(), "rule__AddAElements__TypeAssignment_5");
			builder.put(grammarAccess.getAttachCSsAccess().getAttachParam1Assignment_2(), "rule__AttachCSs__AttachParam1Assignment_2");
			builder.put(grammarAccess.getAttachCSsAccess().getAttachParam2Assignment_4(), "rule__AttachCSs__AttachParam2Assignment_4");
			builder.put(grammarAccess.getDetachCSsAccess().getDetachParam1Assignment_3(), "rule__DetachCSs__DetachParam1Assignment_3");
			builder.put(grammarAccess.getDetachCSsAccess().getDetachParam2Assignment_5(), "rule__DetachCSs__DetachParam2Assignment_5");
			builder.put(grammarAccess.getBindElementsAccess().getBindParam1Assignment_3(), "rule__BindElements__BindParam1Assignment_3");
			builder.put(grammarAccess.getBindElementsAccess().getBindParam2Assignment_5(), "rule__BindElements__BindParam2Assignment_5");
			builder.put(grammarAccess.getControlDecisionsAccess().getExpressionDeclAssignment_3_1(), "rule__ControlDecisions__ExpressionDeclAssignment_3_1");
			builder.put(grammarAccess.getControlDecisionsAccess().getStatementDecl1Assignment_4(), "rule__ControlDecisions__StatementDecl1Assignment_4");
			builder.put(grammarAccess.getControlDecisionsAccess().getExpressionOrDeclAssignment_6_2_1(), "rule__ControlDecisions__ExpressionOrDeclAssignment_6_2_1");
			builder.put(grammarAccess.getControlDecisionsAccess().getStatementDecl2Assignment_6_3(), "rule__ControlDecisions__StatementDecl2Assignment_6_3");
			builder.put(grammarAccess.getControlDecisionsAccess().getExpressionOrDeclAssignment_8_2(), "rule__ControlDecisions__ExpressionOrDeclAssignment_8_2");
			builder.put(grammarAccess.getControlDecisionsAccess().getStatementDecl2Assignment_9(), "rule__ControlDecisions__StatementDecl2Assignment_9");
			builder.put(grammarAccess.getExponentialRatesAccess().getDelayValueAssignment_0_2(), "rule__ExponentialRates__DelayValueAssignment_0_2");
			builder.put(grammarAccess.getExponentialRatesAccess().getExponentialRatesAssignment_1(), "rule__ExponentialRates__ExponentialRatesAssignment_1");
			builder.put(grammarAccess.getCConsDeclAccess().getNameAssignment_0_2(), "rule__CConsDecl__NameAssignment_0_2");
			builder.put(grammarAccess.getCConsDeclAccess().getAskconstraintsAssignment_0_4(), "rule__CConsDecl__AskconstraintsAssignment_0_4");
			builder.put(grammarAccess.getCConsDeclAccess().getTellconstraintsAssignment_1_0(), "rule__CConsDecl__TellconstraintsAssignment_1_0");
			builder.put(grammarAccess.getTelloperatorAccess().getConstraintShareDateAssignment_1_2(), "rule__Telloperator__ConstraintShareDateAssignment_1_2");
			builder.put(grammarAccess.getTelloperatorAccess().getRateAssignment_1_4(), "rule__Telloperator__RateAssignment_1_4");
			builder.put(grammarAccess.getAskopeatorAccess().getConstraintDataAssignment_1_2(), "rule__Askopeator__ConstraintDataAssignment_1_2");
			builder.put(grammarAccess.getAskopeatorAccess().getRateAssignment_1_4(), "rule__Askopeator__RateAssignment_1_4");
			builder.put(grammarAccess.getTraitDeclarationAccess().getNameAssignment_1(), "rule__TraitDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getTraitDeclarationAccess().getPortsAssignment_3(), "rule__TraitDeclaration__PortsAssignment_3");
			builder.put(grammarAccess.getTraitDeclarationAccess().getRolesAssignment_4(), "rule__TraitDeclaration__RolesAssignment_4");
			builder.put(grammarAccess.getMedDeclAccess().getNameAssignment_1(), "rule__MedDecl__NameAssignment_1");
			builder.put(grammarAccess.getMedDeclAccess().getMedRolesAssignment_3(), "rule__MedDecl__MedRolesAssignment_3");
			builder.put(grammarAccess.getMedDeclAccess().getAActionsAssignment_4(), "rule__MedDecl__AActionsAssignment_4");
			builder.put(grammarAccess.getMedDeclAccess().getCSConConstraintsAssignment_5(), "rule__MedDecl__CSConConstraintsAssignment_5");
			builder.put(grammarAccess.getMedDeclAccess().getMedCoreBehaviorAssignment_6(), "rule__MedDecl__MedCoreBehaviorAssignment_6");
			builder.put(grammarAccess.getMedRoleDeclarationAccess().getMediationRolesAssignment_0(), "rule__MedRoleDeclaration__MediationRolesAssignment_0");
			builder.put(grammarAccess.getDefineMediationRolesAccess().getTypeAssignment_1(), "rule__DefineMediationRoles__TypeAssignment_1");
			builder.put(grammarAccess.getDefineMediationRolesAccess().getPubliicIntractionpointareAssignment_2(), "rule__DefineMediationRoles__PubliicIntractionpointareAssignment_2");
			builder.put(grammarAccess.getDefineMediationRolesAccess().getNameAssignment_3(), "rule__DefineMediationRoles__NameAssignment_3");
			builder.put(grammarAccess.getAbsArchDeclAccess().getNameAssignment_1(), "rule__AbsArchDecl__NameAssignment_1");
			builder.put(grammarAccess.getAbsArchDeclAccess().getMediatorsAssignment_5(), "rule__AbsArchDecl__MediatorsAssignment_5");
			builder.put(grammarAccess.getAbsArchDeclAccess().getConstitientsAssignment_6(), "rule__AbsArchDecl__ConstitientsAssignment_6");
			builder.put(grammarAccess.getAbsArchDeclAccess().getAbstractCoaltionAssignment_8(), "rule__AbsArchDecl__AbstractCoaltionAssignment_8");
			builder.put(grammarAccess.getAbsArchDeclAccess().getGlobalPropsAssignment_9(), "rule__AbsArchDecl__GlobalPropsAssignment_9");
			builder.put(grammarAccess.getGlobalPropertiesAccess().getPropertyTypeAssignment_2(), "rule__GlobalProperties__PropertyTypeAssignment_2");
			builder.put(grammarAccess.getGlobalPropertiesAccess().getNameAssignment_3(), "rule__GlobalProperties__NameAssignment_3");
			builder.put(grammarAccess.getGlobalPropertiesAccess().getAttrinitAssignment_5(), "rule__GlobalProperties__AttrinitAssignment_5");
			builder.put(grammarAccess.getFLOATAccess().getValueAssignment_0(), "rule__FLOAT__ValueAssignment_0");
			builder.put(grammarAccess.getLogicalExpressionAccess().getOpAssignment_1_1(), "rule__LogicalExpression__OpAssignment_1_1");
			builder.put(grammarAccess.getLogicalExpressionAccess().getRightAssignment_1_2(), "rule__LogicalExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getEqualityExpressionAccess().getOpAssignment_1_1(), "rule__EqualityExpression__OpAssignment_1_1");
			builder.put(grammarAccess.getEqualityExpressionAccess().getRightAssignment_1_2(), "rule__EqualityExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getRelationalExpressionAccess().getOpAssignment_1_1(), "rule__RelationalExpression__OpAssignment_1_1");
			builder.put(grammarAccess.getRelationalExpressionAccess().getRightAssignment_1_2(), "rule__RelationalExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getArithmeticExpressionAccess().getOpAssignment_1_0_0_1(), "rule__ArithmeticExpression__OpAssignment_1_0_0_1");
			builder.put(grammarAccess.getArithmeticExpressionAccess().getOpAssignment_1_0_1_1(), "rule__ArithmeticExpression__OpAssignment_1_0_1_1");
			builder.put(grammarAccess.getArithmeticExpressionAccess().getRightAssignment_1_1(), "rule__ArithmeticExpression__RightAssignment_1_1");
			builder.put(grammarAccess.getTermAccess().getOpAssignment_1_1(), "rule__Term__OpAssignment_1_1");
			builder.put(grammarAccess.getTermAccess().getRightAssignment_1_2(), "rule__Term__RightAssignment_1_2");
			builder.put(grammarAccess.getUnaryExpressionAccess().getExpressionAssignment_2(), "rule__UnaryExpression__ExpressionAssignment_2");
			builder.put(grammarAccess.getAtomicElementAccess().getVariableAssignment_1_1(), "rule__AtomicElement__VariableAssignment_1_1");
			builder.put(grammarAccess.getIntegerLiteralAccess().getValueAssignment_1(), "rule__IntegerLiteral__ValueAssignment_1");
			builder.put(grammarAccess.getRealLiteralAccess().getValueAssignment_1(), "rule__RealLiteral__ValueAssignment_1");
			builder.put(grammarAccess.getStringLiteralAccess().getValueAssignment_1(), "rule__StringLiteral__ValueAssignment_1");
			builder.put(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1(), "rule__BooleanLiteral__ValueAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SFDSLGrammarAccess grammarAccess;

	@Override
	protected InternalSFDSLParser createParser() {
		InternalSFDSLParser result = new InternalSFDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SFDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SFDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}