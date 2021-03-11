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

import org.xtext.sosModeling.archModeling.hSFDSL.AElementsBehaviorRoutines;
import org.xtext.sosModeling.archModeling.hSFDSL.CConsDecl;
import org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage;
import org.xtext.sosModeling.archModeling.hSFDSL.MedDecl;
import org.xtext.sosModeling.archModeling.hSFDSL.MedRoleDeclaration;
import org.xtext.sosModeling.archModeling.hSFDSL.StochsticBehaviors;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Med Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.impl.MedDeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.impl.MedDeclImpl#getMedRoles <em>Med Roles</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.impl.MedDeclImpl#getAActions <em>AActions</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.impl.MedDeclImpl#getCSConConstraints <em>CS Con Constraints</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.impl.MedDeclImpl#getMedCoreBehavior <em>Med Core Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedDeclImpl extends MinimalEObjectImpl.Container implements MedDecl
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
   * The cached value of the '{@link #getMedRoles() <em>Med Roles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMedRoles()
   * @generated
   * @ordered
   */
  protected EList<MedRoleDeclaration> medRoles;

  /**
   * The cached value of the '{@link #getAActions() <em>AActions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAActions()
   * @generated
   * @ordered
   */
  protected EList<AElementsBehaviorRoutines> aActions;

  /**
   * The cached value of the '{@link #getCSConConstraints() <em>CS Con Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCSConConstraints()
   * @generated
   * @ordered
   */
  protected EList<CConsDecl> csConConstraints;

  /**
   * The cached value of the '{@link #getMedCoreBehavior() <em>Med Core Behavior</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMedCoreBehavior()
   * @generated
   * @ordered
   */
  protected EList<StochsticBehaviors> medCoreBehavior;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MedDeclImpl()
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
    return HSFDSLPackage.Literals.MED_DECL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HSFDSLPackage.MED_DECL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MedRoleDeclaration> getMedRoles()
  {
    if (medRoles == null)
    {
      medRoles = new EObjectContainmentEList<MedRoleDeclaration>(MedRoleDeclaration.class, this, HSFDSLPackage.MED_DECL__MED_ROLES);
    }
    return medRoles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AElementsBehaviorRoutines> getAActions()
  {
    if (aActions == null)
    {
      aActions = new EObjectContainmentEList<AElementsBehaviorRoutines>(AElementsBehaviorRoutines.class, this, HSFDSLPackage.MED_DECL__AACTIONS);
    }
    return aActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CConsDecl> getCSConConstraints()
  {
    if (csConConstraints == null)
    {
      csConConstraints = new EObjectContainmentEList<CConsDecl>(CConsDecl.class, this, HSFDSLPackage.MED_DECL__CS_CON_CONSTRAINTS);
    }
    return csConConstraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<StochsticBehaviors> getMedCoreBehavior()
  {
    if (medCoreBehavior == null)
    {
      medCoreBehavior = new EObjectContainmentEList<StochsticBehaviors>(StochsticBehaviors.class, this, HSFDSLPackage.MED_DECL__MED_CORE_BEHAVIOR);
    }
    return medCoreBehavior;
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
      case HSFDSLPackage.MED_DECL__MED_ROLES:
        return ((InternalEList<?>)getMedRoles()).basicRemove(otherEnd, msgs);
      case HSFDSLPackage.MED_DECL__AACTIONS:
        return ((InternalEList<?>)getAActions()).basicRemove(otherEnd, msgs);
      case HSFDSLPackage.MED_DECL__CS_CON_CONSTRAINTS:
        return ((InternalEList<?>)getCSConConstraints()).basicRemove(otherEnd, msgs);
      case HSFDSLPackage.MED_DECL__MED_CORE_BEHAVIOR:
        return ((InternalEList<?>)getMedCoreBehavior()).basicRemove(otherEnd, msgs);
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
      case HSFDSLPackage.MED_DECL__NAME:
        return getName();
      case HSFDSLPackage.MED_DECL__MED_ROLES:
        return getMedRoles();
      case HSFDSLPackage.MED_DECL__AACTIONS:
        return getAActions();
      case HSFDSLPackage.MED_DECL__CS_CON_CONSTRAINTS:
        return getCSConConstraints();
      case HSFDSLPackage.MED_DECL__MED_CORE_BEHAVIOR:
        return getMedCoreBehavior();
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
      case HSFDSLPackage.MED_DECL__NAME:
        setName((String)newValue);
        return;
      case HSFDSLPackage.MED_DECL__MED_ROLES:
        getMedRoles().clear();
        getMedRoles().addAll((Collection<? extends MedRoleDeclaration>)newValue);
        return;
      case HSFDSLPackage.MED_DECL__AACTIONS:
        getAActions().clear();
        getAActions().addAll((Collection<? extends AElementsBehaviorRoutines>)newValue);
        return;
      case HSFDSLPackage.MED_DECL__CS_CON_CONSTRAINTS:
        getCSConConstraints().clear();
        getCSConConstraints().addAll((Collection<? extends CConsDecl>)newValue);
        return;
      case HSFDSLPackage.MED_DECL__MED_CORE_BEHAVIOR:
        getMedCoreBehavior().clear();
        getMedCoreBehavior().addAll((Collection<? extends StochsticBehaviors>)newValue);
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
      case HSFDSLPackage.MED_DECL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HSFDSLPackage.MED_DECL__MED_ROLES:
        getMedRoles().clear();
        return;
      case HSFDSLPackage.MED_DECL__AACTIONS:
        getAActions().clear();
        return;
      case HSFDSLPackage.MED_DECL__CS_CON_CONSTRAINTS:
        getCSConConstraints().clear();
        return;
      case HSFDSLPackage.MED_DECL__MED_CORE_BEHAVIOR:
        getMedCoreBehavior().clear();
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
      case HSFDSLPackage.MED_DECL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HSFDSLPackage.MED_DECL__MED_ROLES:
        return medRoles != null && !medRoles.isEmpty();
      case HSFDSLPackage.MED_DECL__AACTIONS:
        return aActions != null && !aActions.isEmpty();
      case HSFDSLPackage.MED_DECL__CS_CON_CONSTRAINTS:
        return csConConstraints != null && !csConConstraints.isEmpty();
      case HSFDSLPackage.MED_DECL__MED_CORE_BEHAVIOR:
        return medCoreBehavior != null && !medCoreBehavior.isEmpty();
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

} //MedDeclImpl