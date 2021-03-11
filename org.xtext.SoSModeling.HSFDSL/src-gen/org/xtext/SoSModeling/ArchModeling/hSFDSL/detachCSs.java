/**
 * generated by Xtext 2.19.0
 */
package org.xtext.sosModeling.archModeling.hSFDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>detach CSs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.detachCSs#getDetachParam1 <em>Detach Param1</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.detachCSs#getDetachParam2 <em>Detach Param2</em>}</li>
 * </ul>
 *
 * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getdetachCSs()
 * @model
 * @generated
 */
public interface detachCSs extends EObject
{
  /**
   * Returns the value of the '<em><b>Detach Param1</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sosModeling.archModeling.hSFDSL.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Detach Param1</em>' containment reference list.
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getdetachCSs_DetachParam1()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getDetachParam1();

  /**
   * Returns the value of the '<em><b>Detach Param2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sosModeling.archModeling.hSFDSL.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Detach Param2</em>' containment reference list.
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getdetachCSs_DetachParam2()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getDetachParam2();

} // detachCSs
