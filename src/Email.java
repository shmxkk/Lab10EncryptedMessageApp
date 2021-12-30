/**
 *
 *  Basic holder for an email. You can assume an email is properly / safely formatted.
 *
 * @author YOUR NAME <br>
 *         YOUR EMAIL <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class Email {
    private String email;
    private String type; // options Home, Office, Other

    /**Returns the email address**/
    public String getEmail() {
        return email;
    }

    /**Sets the email address. No checks for valid emails**/
    public void setEmail(String email) {
        //TODO Student
    }

    /**Gets the type of email**/
    public String getType() {
        return ""; //TODO STUDENT
    }

    /**Sets the type**/
    public void setType(String type) {
        //TODO STUDENT
    }

    /**Gets the client name  E-name. This is the name before the @ in an email**/
    public String getEName() {
       return ""; //TODO STUDENT
    }

    /** gets the domain of the email. This is the part after the @ in an email **/
    public String getDomain() {
        //TODO STUDENT
        return ""; //TODO STUDENT
    }

    /** renders the email as Type:  email - with 7 padding on the type **/
    public String render() {
        //TODO STUDENT
        return ""; //TODO STUDENT
    }

    /**
     * Basic constructor
     * @param type the type of email (home, work, etc)
     * @param email the email address
     */
    public Email(String type, String email) {
        setEmail(email);
        setType(type);
    }


}
