/**
 * generated by Xtext 2.19.0
 */
package org.xtext.sosModeling.archModeling.hSFDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>publicinterfaece Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.publicinterfaeceDef#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.publicinterfaeceDef#getParamsDecl <em>Params Decl</em>}</li>
 * </ul>
 *
 * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getpublicinterfaeceDef()
 * @model
 * @generated
 */
public interface publicinterfaeceDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getpublicinterfaeceDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.sosModeling.archModeling.hSFDSL.publicinterfaeceDef#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getpublicinterfaeceDef_ParamsDecl()
   * @model containment="true"
   * @generated
   */
  formalParameters getParamsDecl();

  /**
   * Sets the value of the '{@link org.xtext.sosModeling.archModeling.hSFDSL.publicinterfaeceDef#getParamsDecl <em>Params Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params Decl</em>' containment reference.
   * @see #getParamsDecl()
   * @generated
   */
  void setParamsDecl(formalParameters value);

} // publicinterfaeceDef