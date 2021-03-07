package mappe.del1.hospital.healthpersonal.doctor;

/**
 * Surgeon extends Doctor class has a mutator method.
 *
 * @version 11.03.2021
 * @author Thadshajini
 */

import mappe.del1.hospital.Patient;

public class Surgeon extends Doctor{
    /**
     * Constructor
     * @param firstName (String)
     * @param lastName (String)
     * @param socialSecurityNumber (String)
     */
    public Surgeon(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * setDiagnosis is an abstract methode for setting a patient's diagnosis
     * @param patient (patient object)
     * @param diagnosis (string)
     */
    @Override
    public void setDiagnosis(Patient patient, String diagnosis) {

    }
}
