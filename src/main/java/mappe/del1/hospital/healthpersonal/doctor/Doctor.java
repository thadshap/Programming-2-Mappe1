package mappe.del1.hospital.healthpersonal.doctor;

/**
 * Doctor is an abstract class that extends employee and is a "form" to register doctors.
 *
 * @version 11.03.2021
 * @author Thadshajini
 */

import mappe.del1.hospital.Employee;
import mappe.del1.hospital.Patient;

public abstract class Doctor extends Employee {
    /**
     * Constructor
     * @param firstName (string)
     * @param lastName (string)
     * @param socialSecurityNumber (string)
     */
    public Doctor(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * setDiagnosis is an abstract methode for setting a patient's diagnosis
     * @param patient (patient object)
     * @param diagnosis (string)
     */
    public abstract void setDiagnosis (Patient patient,String diagnosis);
}
