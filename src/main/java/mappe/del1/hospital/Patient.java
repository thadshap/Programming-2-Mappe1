package mappe.del1.hospital;

/**
 * Patient extends Person class and implements diagnosis. This class has some access and mutator methods.
 *
 * @version 11.03.2021
 * @author Thadshajini
 */

public class Patient extends Person implements Diagnosable {
    private String diagnosis = "";

    /**
     * Constructor
     * @param firstName (String)
     * @param lastName (String)
     * @param socialSecurityNumber (String)
     */
    public Patient(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * (access methode)
     * @return diagnosis
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * setting diagnosis to a patient (mutator methode)
     * @param diagnosis (String)
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * toString methode
     * @return Patient{ firstName='firstName'
                        lastName='lastName'
                        diagnosis='diagnosis'
                      }
     */
    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + getFirstName() + '\'' +
                "lastName='" + getLastName() + '\'' +
                "diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
