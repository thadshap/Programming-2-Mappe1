package mappe.del1.hospital;

import mappe.del1.hospital.exception.RemoveException;

import java.util.*;

public class Department{
    private  String departmentName;
    private Map<String,Employee> employees;
    private Map<String,Patient> patients;

    public Department(String departmentName) {
        setDepartmentName(departmentName);
        employees = new HashMap<>();
        patients = new HashMap<>();
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Map<String,Employee> getEmployees(){
        return employees;
    }

    public void addEmployee(Employee employee){
        if (employees.containsValue(employee)){
            return;
        }
        employees.put(employee.getSocialSecurityNumber(),employee);
    }

    public Map<String,Patient> getPatients(){
        return patients;
    }

    public void addPatients(Patient patient){
        if (patients.containsValue(patient)){
            return;
        }
        patients.put(patient.getSocialSecurityNumber(),patient);
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return getDepartmentName().equals(that.getDepartmentName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartmentName());
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", employees=" + employees +
                ", patients=" + patients +
                '}';
    }
}
