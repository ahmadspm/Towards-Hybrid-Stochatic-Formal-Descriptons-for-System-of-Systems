/**
 * generated by Xtext 2.19.0
 */
package org.xtext.sosModeling.archModeling.hSFDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.GlobalProperties#getPropertyType <em>Property Type</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.GlobalProperties#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.GlobalProperties#getAttrinit <em>Attrinit</em>}</li>
 * </ul>
 *
 * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getGlobalProperties()
 * @model
 * @generated
 */
public interface GlobalProperties extends EObject
{
  /**
   * Returns the value of the '<em><b>Property Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Type</em>' attribute.
   * @see #setPropertyType(String)
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getGlobalProperties_PropertyType()
   * @model
   * @generated
   */
  String getPropertyType();

  /**
   * Sets the value of the '{@link org.xtext.sosModeling.archModeling.hSFDSL.GlobalProperties#getPropertyType <em>Property Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Type</em>' attribute.
   * @see #getPropertyType()
   * @generated
   */
  void setPropertyType(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getGlobalProperties_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.sosModeling.archModeling.hSFDSL.GlobalProperties#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attrinit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attrinit</em>' containment reference.
   * @see #setAttrinit(initVals)
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getGlobalProperties_Attrinit()
   * @model containment="true"
   * @generated
   */
  initVals getAttrinit();

  /**
   * Sets the value of the '{@link org.xtext.sosModeling.archModeling.hSFDSL.GlobalProperties#getAttrinit <em>Attrinit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attrinit</em>' containment reference.
   * @see #getAttrinit()
   * @generated
   */
  void setAttrinit(initVals value);

} // GlobalProperties