/**
 */
package Classes.mdsdAdmin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel Staff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Classes.mdsdAdmin.HotelStaff#getName <em>Name</em>}</li>
 *   <li>{@link Classes.mdsdAdmin.HotelStaff#getRank <em>Rank</em>}</li>
 *   <li>{@link Classes.mdsdAdmin.HotelStaff#getSSN <em>SSN</em>}</li>
 * </ul>
 *
 * @see Classes.mdsdAdmin.MdsdAdminPackage#getHotelStaff()
 * @model
 * @generated
 */
public interface HotelStaff extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Classes.mdsdAdmin.MdsdAdminPackage#getHotelStaff_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Classes.mdsdAdmin.HotelStaff#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(int)
	 * @see Classes.mdsdAdmin.MdsdAdminPackage#getHotelStaff_Rank()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getRank();

	/**
	 * Sets the value of the '{@link Classes.mdsdAdmin.HotelStaff#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(int value);

	/**
	 * Returns the value of the '<em><b>SSN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SSN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SSN</em>' attribute.
	 * @see #setSSN(String)
	 * @see Classes.mdsdAdmin.MdsdAdminPackage#getHotelStaff_SSN()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSSN();

	/**
	 * Sets the value of the '{@link Classes.mdsdAdmin.HotelStaff#getSSN <em>SSN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SSN</em>' attribute.
	 * @see #getSSN()
	 * @generated
	 */
	void setSSN(String value);

} // HotelStaff
