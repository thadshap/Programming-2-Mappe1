package mappe.del1.hospital.clientprogram;

/**
 * HospitalClient is a simple client class that uses HospitalTestData.fillRegisterWithTestDate
 * to fill the registers with data to test the application.
 *
 * @version 11.03.2021
 * @author Thadshajini
 */

import mappe.del1.hospital.Department;
import mappe.del1.hospital.Employee;
import mappe.del1.hospital.Hospital;
import mappe.del1.hospital.Patient;
import mappe.del1.hospital.exception.RemoveException;

public class HospitalClient {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Ullevål");
        HospitalTestData.fillRegisterWithTestData(hospital);
        Department department1 = hospital.getDepartments().get("Akutten");
        Employee employee1 = department1.getEmployees().get("1");
        try {
            department1.remove(employee1);
        }
        catch (RemoveException r){
            System.out.println(r.getMessage());
        }
        if (department1.getEmployees().get("1")==null){
            System.out.println("The employee was successfully fired.");
        }

        Patient patient = new Patient("Kare","Los","20");
        try {
            department1.remove(patient);
        }
        catch (RemoveException r){
            System.out.println(r.getMessage());
        }
    }
}
