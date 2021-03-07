package mappe.del1.hospital.clientprogram;

/**
 * HospitalClient is a simple client class to test the application.
 *
 * @version 11.03.2021
 * @author Thadshajini
 */

import mappe.del1.hospital.Department;
import mappe.del1.hospital.Employee;
import mappe.del1.hospital.Hospital;
import mappe.del1.hospital.Patient;
import mappe.del1.hospital.healthpersonal.Nurse;
import mappe.del1.hospital.healthpersonal.doctor.GeneralPractitioner;
import mappe.del1.hospital.healthpersonal.doctor.Surgeon;

public final class HospitalTestData {
    private HospitalTestData() {
        // not called
    }
    /**
     * Fills different departments with employees and patients in a hospital
     * @param hospital is final and have hospital as it's data type which means that it takes inn hospital name
     */
    public static void fillRegisterWithTestData(final Hospital hospital) {
        // Add some departments
        Department emergency = new Department("Akutten");
        emergency.getEmployees().put("1",new Employee("Odd Even", "Primtallet", "1"));
        emergency.getEmployees().put("2",new Employee("Huppasahn", "DelFinito", "2"));
        emergency.getEmployees().put("3",new Employee("Rigmor", "Mortis", "3"));
        emergency.getEmployees().put("4",new GeneralPractitioner("Inco", "Gnito", "4"));
        emergency.getEmployees().put("5",new Surgeon("Inco", "Gnito", "5"));
        emergency.getEmployees().put("6",new Nurse("Nina", "Teknologi", "6"));
        emergency.getEmployees().put("7",new Nurse("Ove", "Ralt", "7"));
        emergency.getPatients().put("8",new Patient("Inga", "Lykke", "8"));
        emergency.getPatients().put("9",new Patient("Ulrik", "Smål", "9"));
        hospital.getDepartments().put(emergency.getDepartmentName(), emergency);
        Department childrenPolyclinic = new Department("Barn poliklinikk");
        childrenPolyclinic.getEmployees().put("10",new Employee("Salti", "Kaffen", "10"));
        childrenPolyclinic.getEmployees().put("11",new Employee("Nidel V.", "Elvefølger", "11"));
        childrenPolyclinic.getEmployees().put("12",new Employee("Anton", "Nym", "12"));
        childrenPolyclinic.getEmployees().put("13",new GeneralPractitioner("Gene", "Sis", "13"));
        childrenPolyclinic.getEmployees().put("14",new Surgeon("Nanna", "Na", "14"));
        childrenPolyclinic.getEmployees().put("15",new Nurse("Nora", "Toriet", "15"));
        childrenPolyclinic.getPatients().put("16",new Patient("Hans", "Omvar", "16"));
        childrenPolyclinic.getPatients().put("17",new Patient("Laila", "La", "17"));
        childrenPolyclinic.getPatients().put("18",new Patient("Jøran", "Drebli", "18"));
        hospital.getDepartments().put(childrenPolyclinic.getDepartmentName(), childrenPolyclinic);
    }
}
