/**
 * generated by Xtext 2.19.0
 */
package org.xtext.sosModeling.archModeling.hSFDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abs Arch Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.AbsArchDecl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.AbsArchDecl#getMediators <em>Mediators</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.AbsArchDecl#getConstitients <em>Constitients</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.AbsArchDecl#getAbstractCoaltion <em>Abstract Coaltion</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.AbsArchDecl#getGlobalProps <em>Global Props</em>}</li>
 * </ul>
 *
 * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getAbsArchDecl()
 * @model
 * @generated
 */
public interface AbsArchDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getAbsArchDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.sosModeling.archModeling.hSFDSL.AbsArchDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Mediators</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sosModeling.archModeling.hSFDSL.MedDecl}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mediators</em>' containment reference list.
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getAbsArchDecl_Mediators()
   * @model containment="true"
   * @generated
   */
  EList<MedDecl> getMediators();

  /**
   * Returns the value of the '<em><b>Constitients</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sosModeling.archModeling.hSFDSL.CSDecl}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constitients</em>' containment reference list.
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getAbsArchDecl_Constitients()
   * @model containment="true"
   * @generated
   */
  EList<CSDecl> getConstitients();

  /**
   * Returns the value of the '<em><b>Abstract Coaltion</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sosModeling.archModeling.hSFDSL.AElementsBehaviorRoutines}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract Coaltion</em>' containment reference list.
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getAbsArchDecl_AbstractCoaltion()
   * @model containment="true"
   * @generated
   */
  EList<AElementsBehaviorRoutines> getAbstractCoaltion();

  /**
   * Returns the value of the '<em><b>Global Props</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sosModeling.archModeling.hSFDSL.GlobalProperties}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Global Props</em>' containment reference list.
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getAbsArchDecl_GlobalProps()
   * @model containment="true"
   * @generated
   */
  EList<GlobalProperties> getGlobalProps();

} // AbsArchDecl
