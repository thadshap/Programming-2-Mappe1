package mappe.del1.hospital.healthpersonal.doctor;

/**
 * GeneralPractitioner extends Doctor class and has a mutator method.
 *
 * @version 11.03.2021
 * @author Thadshajini
 */

import mappe.del1.hospital.Patient;

public class GeneralPractitioner extends Doctor{
    /**
     * Constructor
     * @param firstName (String)
     * @param lastName (String)
     * @param socialSecurityNumber (String)
     */
    public GeneralPractitioner(String firstName, String lastName, String socialSecurityNumber) {
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
