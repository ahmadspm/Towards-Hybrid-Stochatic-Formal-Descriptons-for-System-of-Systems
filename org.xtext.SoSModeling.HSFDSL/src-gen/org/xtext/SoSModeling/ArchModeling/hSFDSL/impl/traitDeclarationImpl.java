/**
 * generated by Xtext 2.19.0
 */
package org.xtext.sosModeling.archModeling.hSFDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage;
import org.xtext.sosModeling.archModeling.hSFDSL.MedRoleDeclaration;
import org.xtext.sosModeling.archModeling.hSFDSL.ProtDeclaration;
import org.xtext.sosModeling.archModeling.hSFDSL.traitDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>trait Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.impl.traitDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.impl.traitDeclarationImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.impl.traitDeclarationImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class traitDeclarationImpl extends MinimalEObjectImpl.Container implements traitDeclaration
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorts()
   * @generated
   * @ordered
   */
  protected EList<ProtDeclaration> ports;

  /**
   * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoles()
   * @generated
   * @ordered
   */
  protected EList<MedRoleDeclaration> roles;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected traitDeclarationImpl()
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
    return HSFDSLPackage.Literals.TRAIT_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HSFDSLPackage.TRAIT_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ProtDeclaration> getPorts()
  {
    if (ports == null)
    {
      ports = new EObjectContainmentEList<ProtDeclaration>(ProtDeclaration.class, this, HSFDSLPackage.TRAIT_DECLARATION__PORTS);
    }
    return ports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MedRoleDeclaration> getRoles()
  {
    if (roles == null)
    {
      roles = new EObjectContainmentEList<MedRoleDeclaration>(MedRoleDeclaration.class, this, HSFDSLPackage.TRAIT_DECLARATION__ROLES);
    }
    return roles;
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
      case HSFDSLPackage.TRAIT_DECLARATION__PORTS:
        return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
      case HSFDSLPackage.TRAIT_DECLARATION__ROLES:
        return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
      case HSFDSLPackage.TRAIT_DECLARATION__NAME:
        return getName();
      case HSFDSLPackage.TRAIT_DECLARATION__PORTS:
        return getPorts();
      case HSFDSLPackage.TRAIT_DECLARATION__ROLES:
        return getRoles();
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
      case HSFDSLPackage.TRAIT_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case HSFDSLPackage.TRAIT_DECLARATION__PORTS:
        getPorts().clear();
        getPorts().addAll((Collection<? extends ProtDeclaration>)newValue);
        return;
      case HSFDSLPackage.TRAIT_DECLARATION__ROLES:
        getRoles().clear();
        getRoles().addAll((Collection<? extends MedRoleDeclaration>)newValue);
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
      case HSFDSLPackage.TRAIT_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HSFDSLPackage.TRAIT_DECLARATION__PORTS:
        getPorts().clear();
        return;
      case HSFDSLPackage.TRAIT_DECLARATION__ROLES:
        getRoles().clear();
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
      case HSFDSLPackage.TRAIT_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HSFDSLPackage.TRAIT_DECLARATION__PORTS:
        return ports != null && !ports.isEmpty();
      case HSFDSLPackage.TRAIT_DECLARATION__ROLES:
        return roles != null && !roles.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //traitDeclarationImpl