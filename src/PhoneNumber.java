/**
 * Basic object to hold phone numbers. It can be assumed phone numbers are 10 digits
 *
 *
 * @author YOUR NAME <br>
 *         YOUR EMAIL <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class PhoneNumber {
    private String type;
    private String number;

    /**
     * The type of phone number - mobile, home, office, other
     * @return the type associated with the number
     */
    public String getType() {
        return type;
    }

    /**
     * sets the type of phone number
     * @param type string to set it to
     */
    public void setType(String type) {
        this.type = type;
    }

    /** Gets the phone number as *rawnumbers* only **/
    public String getNumber() {
        return number;
    }

    /** Sets the phone number. This should be set as raw numbers, for example 5554443333 NOT (555)444-3333 **/
    public void setNumber(String number) {
        this.number = number;
    }

    /** Gets the first 3 digits of a US Standard phone number (10 digits). **/
    public String getAreaCode() {
        return ""; //TODO STUDENT
    }

    /** Gets the second three digits. In the number (555) 444-3333, 444 would be the prefix. Remember, phone
     * numbers are stored as number strings only, so 5554443333.
     * @return the prefix
     */
    public String getPrefix() {
        return ""; //TODO STUDENT 
    }

    /** get the last four digits in a number (so location 6 onward) **/
    public String getLine() {
        return ""; //TODO STUDENT
    }

    /**
     * Reformats a 10 digit numeric string into US Standard display format, so 5554443333 becomes (555) 444-3333
     * @return a US Standard formatted number
     */
    public String getPrettyNumber() {
        return ""; //TODO STUDENT
    }

    /**
     * Returns a string in the format "[type]: [prettyNumber].
     * Example - Office: (555) 444-3333. The type is 7 padded (%-7s)
     */
    public String render() {
        return ""; //TODO STUDENT 
    }

    /**
     * Basic constructor
     * @param type the type of number
     * @param number the phone number as a ten digit string
     */
    public PhoneNumber(String type, String number) {
        setType(type);
        setNumber(number);
    }

}
