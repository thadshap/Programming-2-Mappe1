package mappe.del1.hospital;

/**
 * RemoveException is a exception class.
 *
 * @version 11.03.2021
 * @author Thadshajini
 */

public class Employee extends Person {
    /**
     * Constructor
     * @param firstName (String)
     * @param lastName (String)
     * @param socialSecurityNumber (String)
     */
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * toString methode
     * @return firstName = 'firstName'
               lastName = 'lastName'
               socialSecurityNumber = 'socialSecurityNumber'
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
