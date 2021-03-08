package mappe.del1.hospital;

/**
 * Department class contains employees and patients and this class has add methode to add employees
 * and patients, remove methode, equal method to check if two departments are equal, and some access
 * and mutator methods.
 *
 * @version 11.03.2021
 * @author Thadshajini
 */

import mappe.del1.hospital.exception.RemoveException;

import java.util.*;

public class Department{
    private  String departmentName;
    /**
     * The reason why employees and patients are listed up as Map is because a patient and an employee
     * has unique social security number. Duplicates of the employees and patients are not necessary
     * in this case. In addition we need unlimited capacity for the number of objects
     * that can be added/registered and the order of the objects do not matter with regard to the methods.
     * Therefore are employees and patients listed as Map with social security number as key,
     * employees and patients as value.
     */
    private Map<String,Employee> employees;
    private Map<String,Patient> patients;

    /**
     * Constructor
     * @param departmentName (String)
     */
    public Department(String departmentName) {
        setDepartmentName(departmentName);
        employees = new HashMap<>();
        patients = new HashMap<>();
    }

    /**
     * (mutator method)
     * @param departmentName (String)
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * (access method)
     * @return department name (String)
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * (access method)
     * @return employees (Map<String,Employee>)
     */
    public Map<String,Employee> getEmployees(){
        return employees;
    }

    /**
     * (access method)
     * @return patients (Map<String,Employee>)
     */
    public Map<String,Patient> getPatients(){
        return patients;
    }

    /**
     * add new employees with employee object which contains employee's first name, last name and
     * social security number. You can not add a employee that already exists.
     *
     * @param employee (Employee)
     */
    public void addEmployee(Employee employee){
        if (employees.containsKey(employee)){
            return;
        }
        employees.put(employee.getSocialSecurityNumber(),employee);
    }

    /**
     * add new patients with patient object which contains patient's first name, last name and
     * social security number. You can not add a patient that already exists.
     *
     * @param patient (Patient)
     */
    public void addPatients(Patient patient){
        if (patients.containsKey(patient)){
            return;
        }
        patients.put(patient.getSocialSecurityNumber(),patient);
    }

    /**
     * removing employees and patients which already exists
     * @param person (Person)
     * @throws RemoveException
     */
    public void remove(Person person) throws RemoveException{

        if (person instanceof Employee){
            if (employees.containsKey(person.getSocialSecurityNumber())) {
                employees.remove(person.getSocialSecurityNumber());
            }
            else {
                throw new RemoveException("The person you entered is not an employee.");
            }
        }
        else if(person instanceof Patient){
            if (patients.containsKey(person.getSocialSecurityNumber())) {
                patients.remove(person.getSocialSecurityNumber());
            }
            else {
                throw new RemoveException("The person you entered is not a patient.");
            }
        }
        else {
            throw new RemoveException("The person you entered is neither a patient nor an employee.");
        }
    }

    /**
     * equals methode checks if two department object are equal by their hashcode, aka department names
     * @param o (Object)
     * @return true if both of the department objects have same hash code
     *         false if the hash code of o does not match with the other department's hash code
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return getDepartmentName().equals(that.getDepartmentName());
    }

    /**
     * hashCode
     * @return hash code value of the department name
     */
    @Override
    public int hashCode() {
        return Objects.hash(getDepartmentName());
    }

    /**
     * toString method
     * @return Department{departmentName='departmentName'
                          employees=firstName='firstName'
                                    lastName='lastName'
                                    socialSecurityNumber='socialSecurityNumber'
                          patients=firstName='firstName'
                                   lastName='lastName'
                                   socialSecurityNumber='socialSecurityNumber'
                          }
     */
    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", employees=" + employees +
                ", patients=" + patients +
                '}';
    }
}
