/**
 * generated by Xtext 2.19.0
 */
package org.xtext.sosModeling.archModeling.hSFDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Elements Decaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.ModelElementsDecaration#getAbstractArchModel <em>Abstract Arch Model</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.ModelElementsDecaration#getConstiuenetSystemSDesign <em>Constiuenet System SDesign</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.ModelElementsDecaration#getMediatorDesign <em>Mediator Design</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.ModelElementsDecaration#getConcurrentConstraints <em>Concurrent Constraints</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.ModelElementsDecaration#getArchitecutreElementsBehaviors <em>Architecutre Elements Behaviors</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.ModelElementsDecaration#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.ModelElementsDecaration#getInterfce <em>Interfce</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.ModelElementsDecaration#getArchTraits <em>Arch Traits</em>}</li>
 * </ul>
 *
 * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getModelElementsDecaration()
 * @model
 * @generated
 */
public interface ModelElementsDecaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Abstract Arch Model</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sosModeling.archModeling.hSFDSL.AbsArchDecl}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract Arch Model</em>' containment reference list.
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getModelElementsDecaration_AbstractArchModel()
   * @model containment="true"
   * @generated
   */
  EList<AbsArchDecl> getAbstractArchModel();

  /**
   * Returns the value of the '<em><b>Constiuenet System SDesign</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sosModeling.archModeling.hSFDSL.CSDecl}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constiuenet System SDesign</em>' containment reference list.
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getModelElementsDecaration_ConstiuenetSystemSDesign()
   * @model containment="true"
   * @generated
   */
  EList<CSDecl> getConstiuenetSystemSDesign();

  /**
   * Returns the value of the '<em><b>Mediator Design</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sosModeling.archModeling.hSFDSL.MedDecl}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mediator Design</em>' containment reference list.
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getModelElementsDecaration_MediatorDesign()
   * @model containment="true"
   * @generated
   */
  EList<MedDecl> getMediatorDesign();

  /**
   * Returns the value of the '<em><b>Concurrent Constraints</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sosModeling.archModeling.hSFDSL.CConsDecl}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concurrent Constraints</em>' containment reference list.
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getModelElementsDecaration_ConcurrentConstraints()
   * @model containment="true"
   * @generated
   */
  EList<CConsDecl> getConcurrentConstraints();

  /**
   * Returns the value of the '<em><b>Architecutre Elements Behaviors</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sosModeling.archModeling.hSFDSL.AElementsBehaviorRoutines}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Architecutre Elements Behaviors</em>' containment reference list.
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getModelElementsDecaration_ArchitecutreElementsBehaviors()
   * @model containment="true"
   * @generated
   */
  EList<AElementsBehaviorRoutines> getArchitecutreElementsBehaviors();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getModelElementsDecaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.sosModeling.archModeling.hSFDSL.ModelElementsDecaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Interfce</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sosModeling.archModeling.hSFDSL.publicinterfaeceDef}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interfce</em>' containment reference list.
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getModelElementsDecaration_Interfce()
   * @model containment="true"
   * @generated
   */
  EList<publicinterfaeceDef> getInterfce();

  /**
   * Returns the value of the '<em><b>Arch Traits</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sosModeling.archModeling.hSFDSL.traitDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arch Traits</em>' containment reference list.
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getModelElementsDecaration_ArchTraits()
   * @model containment="true"
   * @generated
   */
  EList<traitDeclaration> getArchTraits();

} // ModelElementsDecaration
