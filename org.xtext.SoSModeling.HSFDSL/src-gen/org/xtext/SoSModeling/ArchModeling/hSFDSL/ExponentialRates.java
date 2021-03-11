/**
 * generated by Xtext 2.19.0
 */
package org.xtext.sosModeling.archModeling.hSFDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exponential Rates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.ExponentialRates#getDelayValue <em>Delay Value</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.ExponentialRates#getExponentialRates <em>Exponential Rates</em>}</li>
 * </ul>
 *
 * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getExponentialRates()
 * @model
 * @generated
 */
public interface ExponentialRates extends EObject
{
  /**
   * Returns the value of the '<em><b>Delay Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delay Value</em>' attribute.
   * @see #setDelayValue(int)
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getExponentialRates_DelayValue()
   * @model
   * @generated
   */
  int getDelayValue();

  /**
   * Sets the value of the '{@link org.xtext.sosModeling.archModeling.hSFDSL.ExponentialRates#getDelayValue <em>Delay Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delay Value</em>' attribute.
   * @see #getDelayValue()
   * @generated
   */
  void setDelayValue(int value);

  /**
   * Returns the value of the '<em><b>Exponential Rates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exponential Rates</em>' containment reference.
   * @see #setExponentialRates(Expression)
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getExponentialRates_ExponentialRates()
   * @model containment="true"
   * @generated
   */
  Expression getExponentialRates();

  /**
   * Sets the value of the '{@link org.xtext.sosModeling.archModeling.hSFDSL.ExponentialRates#getExponentialRates <em>Exponential Rates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exponential Rates</em>' containment reference.
   * @see #getExponentialRates()
   * @generated
   */
  void setExponentialRates(Expression value);

} // ExponentialRates