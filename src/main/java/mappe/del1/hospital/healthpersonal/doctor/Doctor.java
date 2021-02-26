package mappe.del1.hospital.healthpersonal.doctor;

import mappe.del1.hospital.Employee;
import mappe.del1.hospital.Patient;

public abstract class Doctor extends Employee {
    public Doctor(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    public abstract void setDiagnosis (Patient patient,String diagnosis);
}
