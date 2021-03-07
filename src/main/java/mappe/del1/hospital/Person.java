package mappe.del1.hospital;

/**
 * RemoveException is a exception class and has some access and mutator methods.
 *
 * @version 11.03.2021
 * @author Thadshajini
 */

public abstract class Person {
    private String firstName;
    private  String lastName;
    private String socialSecurityNumber;

    /**
     * Constructor
     * @param firstName (String)
     * @param lastName (String)
     * @param socialSecurityNumber (String)
     */
    public Person(String firstName, String lastName, String socialSecurityNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setSocialSecurityNumber(socialSecurityNumber);
    }

    /**
     * (access methode)
     * @param socialSecurityNumber (String)
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * (access methode)
     * @param firstName (String)
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * (access methode)
     * @param lastName (String)
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * (mutator methode)
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * (mutator methode)
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * (mutator methode)
     * @return social security number
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * (mutator methode)
     * @return full name last name
     */
    public String getFullname(){
        return firstName+" "+lastName;
    }

    /**
     * toString methode
     * @return firstName='firstName'
               lastName='lastName'
     *         socialSecurityNumber='socialSecurityNumber'
     */
    @Override
    public String toString() {
        return
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber;
    }
}
