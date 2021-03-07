package mappe.del1.hospital;

/**
 * DepartmentTest is a test program that tests the remove methode from department class.
 *
 * @version 11.03.2021
 * @author Thadshajini
 */

import mappe.del1.hospital.exception.RemoveException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {

    @Test
    @DisplayName("Positive tests")
    void removePositive() {
        Department childrenPolyclinic = new Department("Barn poliklinikk");
        Employee person = new Employee("Salti", "Kaffen", "10");
        childrenPolyclinic.addEmployee(person);
        childrenPolyclinic.addPatients(new Patient("Cara", "Mel", "11"));
        assertDoesNotThrow(() -> {childrenPolyclinic.remove(person);});
        assertNull(childrenPolyclinic.getEmployees().get(person.getSocialSecurityNumber()));

    }

    @Test
    @DisplayName("Negative tests")
    void removeNegative() {
        Department childrenPolyclinic = new Department("Barn poliklinikk");
        Employee person = new Employee("Salti", "Kaffen", "10");

        assertThrows(RemoveException.class, () -> {childrenPolyclinic.remove(person);});
    }
}