package mappe.del1.hospital.healthpersonal;

/**
 * Nurse extends Employee class.
 *
 * @version 11.03.2021
 * @author Thadshajini
 */

import mappe.del1.hospital.Employee;

public class Nurse extends Employee {
    /**
     * Constructor
     * @param firstName (String)
     * @param lastName (String)
     * @param socialSecurityNumber (String)
     */
    public Nurse(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * toString methode
     * @return firstName='firstName'
               lastName='lastName'
               socialSecurityNumber='socialSecurityNumber'
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
