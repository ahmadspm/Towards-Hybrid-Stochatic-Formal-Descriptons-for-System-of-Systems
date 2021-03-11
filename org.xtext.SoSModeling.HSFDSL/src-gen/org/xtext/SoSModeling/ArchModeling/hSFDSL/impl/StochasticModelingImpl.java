/**
 * generated by Xtext 2.19.0
 */
package org.xtext.sosModeling.archModeling.hSFDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage;
import org.xtext.sosModeling.archModeling.hSFDSL.ModelElementsDecaration;
import org.xtext.sosModeling.archModeling.hSFDSL.StochasticModeling;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stochastic Modeling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.impl.StochasticModelingImpl#getStochasticModelElements <em>Stochastic Model Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StochasticModelingImpl extends MinimalEObjectImpl.Container implements StochasticModeling
{
  /**
   * The cached value of the '{@link #getStochasticModelElements() <em>Stochastic Model Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStochasticModelElements()
   * @generated
   * @ordered
   */
  protected EList<ModelElementsDecaration> stochasticModelElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StochasticModelingImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return HSFDSLPackage.Literals.STOCHASTIC_MODELING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ModelElementsDecaration> getStochasticModelElements()
  {
    if (stochasticModelElements == null)
    {
      stochasticModelElements = new EObjectContainmentEList<ModelElementsDecaration>(ModelElementsDecaration.class, this, HSFDSLPackage.STOCHASTIC_MODELING__STOCHASTIC_MODEL_ELEMENTS);
    }
    return stochasticModelElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case HSFDSLPackage.STOCHASTIC_MODELING__STOCHASTIC_MODEL_ELEMENTS:
        return ((InternalEList<?>)getStochasticModelElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case HSFDSLPackage.STOCHASTIC_MODELING__STOCHASTIC_MODEL_ELEMENTS:
        return getStochasticModelElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HSFDSLPackage.STOCHASTIC_MODELING__STOCHASTIC_MODEL_ELEMENTS:
        getStochasticModelElements().clear();
        getStochasticModelElements().addAll((Collection<? extends ModelElementsDecaration>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case HSFDSLPackage.STOCHASTIC_MODELING__STOCHASTIC_MODEL_ELEMENTS:
        getStochasticModelElements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case HSFDSLPackage.STOCHASTIC_MODELING__STOCHASTIC_MODEL_ELEMENTS:
        return stochasticModelElements != null && !stochasticModelElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StochasticModelingImpl
