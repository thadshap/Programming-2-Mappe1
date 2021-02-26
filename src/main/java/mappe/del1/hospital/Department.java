package mappe.del1.hospital;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Department {
    private  String departmentName;
    private Map<String,Employee> employees;
    private Map<String,Patient> patients;

    public Department(String departmentName) {
        setDepartmentName(departmentName);
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

    public void remove(Person person){
        if (person instanceof Employee){
            employees.remove(person.getSocialSecurityNumber());
        }
        else if(person instanceof Patient){
            patients.remove(person.getSocialSecurityNumber());
        }
    }

    //@Override
    public boolean equals(Department o) {
        if (this == o) return true;
        return getDepartmentName().equals(o.getDepartmentName());
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
