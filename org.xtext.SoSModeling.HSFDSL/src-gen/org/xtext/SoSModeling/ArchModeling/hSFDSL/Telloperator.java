/**
 * generated by Xtext 2.19.0
 */
package org.xtext.sosModeling.archModeling.hSFDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telloperator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.Telloperator#getConstraintShareDate <em>Constraint Share Date</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.Telloperator#getRate <em>Rate</em>}</li>
 * </ul>
 *
 * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getTelloperator()
 * @model
 * @generated
 */
public interface Telloperator extends EObject
{
  /**
   * Returns the value of the '<em><b>Constraint Share Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint Share Date</em>' attribute.
   * @see #setConstraintShareDate(String)
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getTelloperator_ConstraintShareDate()
   * @model
   * @generated
   */
  String getConstraintShareDate();

  /**
   * Sets the value of the '{@link org.xtext.sosModeling.archModeling.hSFDSL.Telloperator#getConstraintShareDate <em>Constraint Share Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint Share Date</em>' attribute.
   * @see #getConstraintShareDate()
   * @generated
   */
  void setConstraintShareDate(String value);

  /**
   * Returns the value of the '<em><b>Rate</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rate</em>' reference.
   * @see #setRate(ExponentialRates)
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getTelloperator_Rate()
   * @model
   * @generated
   */
  ExponentialRates getRate();

  /**
   * Sets the value of the '{@link org.xtext.sosModeling.archModeling.hSFDSL.Telloperator#getRate <em>Rate</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rate</em>' reference.
   * @see #getRate()
   * @generated
   */
  void setRate(ExponentialRates value);

} // Telloperator
