/**
 * generated by Xtext 2.19.0
 */
package org.xtext.sosModeling.archModeling.hSFDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stochastic Modeling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.StochasticModeling#getStochasticModelElements <em>Stochastic Model Elements</em>}</li>
 * </ul>
 *
 * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getStochasticModeling()
 * @model
 * @generated
 */
public interface StochasticModeling extends EObject
{
  /**
   * Returns the value of the '<em><b>Stochastic Model Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sosModeling.archModeling.hSFDSL.ModelElementsDecaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stochastic Model Elements</em>' containment reference list.
   * @see org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage#getStochasticModeling_StochasticModelElements()
   * @model containment="true"
   * @generated
   */
  EList<ModelElementsDecaration> getStochasticModelElements();

} // StochasticModeling