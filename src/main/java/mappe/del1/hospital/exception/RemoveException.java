package mappe.del1.hospital.exception;

/**
 * RemoveException is a exception class.
 *
 * @version 11.03.2021
 * @author Thadshajini
 */

public class RemoveException extends Exception{

    //serialVersionUID declaration
    public static final long serialVersionUID=1L;

    //constructor
    public RemoveException(String message) {
        super(message);
    }
}
