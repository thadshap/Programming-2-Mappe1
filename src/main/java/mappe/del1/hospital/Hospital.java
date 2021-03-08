package mappe.del1.hospital;

/**
 * RemoveException is a exception class and has some methods as add methode to add departments, access and
 * mutator methods.
 *
 * @version 11.03.2021
 * @author Thadshajini
 */

import java.util.HashMap;
import java.util.Map;

public class Hospital {
    private final String hospitalName;
    /**
     * The reason why departments are listed up as Map is because of that a department name is unique
     * which means that two or more departments can not be called the same. Duplicates of the departments
     * are not necessary in this case. In addition we need unlimited capacity for the number of objects
     * that can be added/registered and the order of the objects do not matter with regard to the methods.
     * Therefore are departments listed as Map with department name as key and Department as value.
     */
    private Map<String,Department> departments;

    /**
     * Constructor
     * @param hospitalName (String)
     */
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        departments = new HashMap<>();
    }

    /**
     * (access methode)
     * @return hospital name
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * access departments which contains employees and patients (access methode)
     * @return departments (Map<String,Department>)
     */
    public Map<String,Department> getDepartments(){
        return departments;
    }

    /**
     * add new department with department object which contains department name. You can not add a
     * department that already exists.
     *
     * @param department (Department)
     */
    public void addDepartments(Department department){
        if (departments.containsKey(department)){
            return;
        }
        departments.put(department.getDepartmentName(),department);
    }

    /**
     * toString methode
     * @return Hospital{hospitalName='hospitalName'
                        departments=departments
                       }
     */
    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", departments=" + departments +
                '}';
    }
}
