import java.util.Scanner;

/**
 * Basic view and interaction associated with the sign-in/login screen
 *
 * @author YOUR NAME <br>
 *         YOUR EMAIL <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class LoginView {
    private final Scanner scn = new Scanner(System.in);

    /** returns the clients response **/
    public String getResponse() {
        return scn.nextLine();
    }


    /** prompt user for their e-name / login **/
    public void printLoginQuestion() {
        System.out.println(English.Login.WELCOME);
        System.out.print(English.Login.ENAME_PROMPT);
    }

    /** print user for their password **/
    public void printPasswordQuestion() {
        System.out.print(English.Login.PASSWORD_PROMPT);
    }

    /** informs of invalid login **/
    public void printInvalidLogin() {
        System.out.println(English.Login.INVALID_PROMPT);
    }
}
