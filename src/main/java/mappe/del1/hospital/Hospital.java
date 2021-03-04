package mappe.del1.hospital;

import java.util.HashMap;
import java.util.Map;

public class Hospital {
    private final String hospitalName;
    private Map<String,Department> departments;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        departments = new HashMap<>();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public Map<String,Department> getDepartments(){
        return departments;
    }

    public void addDepartments(Department department){
        if (departments.containsValue(department)){
            return;
        }
        departments.put(department.getDepartmentName(),department);
    }

    public Department getSeparateDepartment(String departmentName){
        return departments.get(departmentName);
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", departments=" + departments +
                '}';
    }
}
