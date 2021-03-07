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
        Department department = hospital.getSeparateDepartment("Akutten");
        Employee employee = department.getSeparateEmployee("1");
        try {
            department.remove(employee);
        }
        catch (RemoveException r){
            System.out.println(r.getMessage());
        }
        if (department.getSeparateEmployee("1")==null){
            System.out.println("The employee was successfully fired.");
        }

        Patient patient = new Patient("Kare","Los","20");
        try {
            department.remove(patient);
        }
        catch (RemoveException r){
            System.out.println(r.getMessage());
        }
    }
}
