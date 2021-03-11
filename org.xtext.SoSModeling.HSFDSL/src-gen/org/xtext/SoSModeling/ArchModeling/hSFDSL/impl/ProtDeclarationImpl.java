/**
 * generated by Xtext 2.19.0
 */
package org.xtext.sosModeling.archModeling.hSFDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.sosModeling.archModeling.hSFDSL.HSFDSLPackage;
import org.xtext.sosModeling.archModeling.hSFDSL.ProtDeclaration;
import org.xtext.sosModeling.archModeling.hSFDSL.publicinterfaeceDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prot Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.impl.ProtDeclarationImpl#getPorttype <em>Porttype</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.impl.ProtDeclarationImpl#getPubliicIntractionpointare <em>Publiic Intractionpointare</em>}</li>
 *   <li>{@link org.xtext.sosModeling.archModeling.hSFDSL.impl.ProtDeclarationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtDeclarationImpl extends MinimalEObjectImpl.Container implements ProtDeclaration
{
  /**
   * The default value of the '{@link #getPorttype() <em>Porttype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorttype()
   * @generated
   * @ordered
   */
  protected static final String PORTTYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPorttype() <em>Porttype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorttype()
   * @generated
   * @ordered
   */
  protected String porttype = PORTTYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPubliicIntractionpointare() <em>Publiic Intractionpointare</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPubliicIntractionpointare()
   * @generated
   * @ordered
   */
  protected publicinterfaeceDef publiicIntractionpointare;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProtDeclarationImpl()
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
    return HSFDSLPackage.Literals.PROT_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPorttype()
  {
    return porttype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPorttype(String newPorttype)
  {
    String oldPorttype = porttype;
    porttype = newPorttype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HSFDSLPackage.PROT_DECLARATION__PORTTYPE, oldPorttype, porttype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public publicinterfaeceDef getPubliicIntractionpointare()
  {
    if (publiicIntractionpointare != null && publiicIntractionpointare.eIsProxy())
    {
      InternalEObject oldPubliicIntractionpointare = (InternalEObject)publiicIntractionpointare;
      publiicIntractionpointare = (publicinterfaeceDef)eResolveProxy(oldPubliicIntractionpointare);
      if (publiicIntractionpointare != oldPubliicIntractionpointare)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HSFDSLPackage.PROT_DECLARATION__PUBLIIC_INTRACTIONPOINTARE, oldPubliicIntractionpointare, publiicIntractionpointare));
      }
    }
    return publiicIntractionpointare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public publicinterfaeceDef basicGetPubliicIntractionpointare()
  {
    return publiicIntractionpointare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPubliicIntractionpointare(publicinterfaeceDef newPubliicIntractionpointare)
  {
    publicinterfaeceDef oldPubliicIntractionpointare = publiicIntractionpointare;
    publiicIntractionpointare = newPubliicIntractionpointare;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HSFDSLPackage.PROT_DECLARATION__PUBLIIC_INTRACTIONPOINTARE, oldPubliicIntractionpointare, publiicIntractionpointare));
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
      eNotify(new ENotificationImpl(this, Notification.SET, HSFDSLPackage.PROT_DECLARATION__NAME, oldName, name));
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
      case HSFDSLPackage.PROT_DECLARATION__PORTTYPE:
        return getPorttype();
      case HSFDSLPackage.PROT_DECLARATION__PUBLIIC_INTRACTIONPOINTARE:
        if (resolve) return getPubliicIntractionpointare();
        return basicGetPubliicIntractionpointare();
      case HSFDSLPackage.PROT_DECLARATION__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HSFDSLPackage.PROT_DECLARATION__PORTTYPE:
        setPorttype((String)newValue);
        return;
      case HSFDSLPackage.PROT_DECLARATION__PUBLIIC_INTRACTIONPOINTARE:
        setPubliicIntractionpointare((publicinterfaeceDef)newValue);
        return;
      case HSFDSLPackage.PROT_DECLARATION__NAME:
        setName((String)newValue);
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
      case HSFDSLPackage.PROT_DECLARATION__PORTTYPE:
        setPorttype(PORTTYPE_EDEFAULT);
        return;
      case HSFDSLPackage.PROT_DECLARATION__PUBLIIC_INTRACTIONPOINTARE:
        setPubliicIntractionpointare((publicinterfaeceDef)null);
        return;
      case HSFDSLPackage.PROT_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
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
      case HSFDSLPackage.PROT_DECLARATION__PORTTYPE:
        return PORTTYPE_EDEFAULT == null ? porttype != null : !PORTTYPE_EDEFAULT.equals(porttype);
      case HSFDSLPackage.PROT_DECLARATION__PUBLIIC_INTRACTIONPOINTARE:
        return publiicIntractionpointare != null;
      case HSFDSLPackage.PROT_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (porttype: ");
    result.append(porttype);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ProtDeclarationImpl