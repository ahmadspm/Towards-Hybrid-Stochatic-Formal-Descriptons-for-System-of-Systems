/**
 * generated by Xtext 2.19.0
 */
package org.xtext.sosModeling.archModeling.hSFDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stochstic Behaviors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.StochsticBehaviors#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.StochsticBehaviors#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.StochsticBehaviors#getParamsDecl <em>Params Decl</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.StochsticBehaviors#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getStochsticBehaviors()
 * @model
 * @generated
 */
public interface StochsticBehaviors extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getStochsticBehaviors_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.sosModeling.archModeling.hSFDSL.StochsticBehaviors#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getStochsticBehaviors_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.sosModeling.archModeling.hSFDSL.StochsticBehaviors#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params Decl</em>' containment reference.
   * @see #setParamsDecl(formalParameters)
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getStochsticBehaviors_ParamsDecl()
   * @model containment="true"
   * @generated
   */
  formalParameters getParamsDecl();

  /**
   * Sets the value of the '{@link org.xtext.sosModeling.archModeling.hSFDSL.StochsticBehaviors#getParamsDecl <em>Params Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params Decl</em>' containment reference.
   * @see #getParamsDecl()
   * @generated
   */
  void setParamsDecl(formalParameters value);

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sosModeling.archModeling.hSFDSL.AElementsBehaviorRoutines}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getStochsticBehaviors_Functions()
   * @model containment="true"
   * @generated
   */
  EList<AElementsBehaviorRoutines> getFunctions();

} // StochsticBehaviors
