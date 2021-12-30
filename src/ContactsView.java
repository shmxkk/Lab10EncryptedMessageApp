import java.util.Scanner;

/**
 * Handles viewing contacts both single and as a group.
 *
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class ContactsView {
    private final Scanner scnr = new Scanner(System.in);


    /**
     * Inform user there is an invalid entry
     */
    public void printInvalidEntry() {
        display(English.INVALID_GENERAL);
    }

    /**
     * Simply forces the scanner to read from the console and return a line.
     * @return a new line from the console.
     */
    public String getResponse() {
        return scnr.nextLine();
    }

    /**
     * prints out to the screen with a new line.
     * @param str line to print
     */
    public void display(String str) {
        System.out.println(str);
    }

    /**
     * Prints (no new line) asking for a contact name
     */
    public void printContactsPrompt() {
        System.out.print(English.Contacts.SINGLE_CONTACT_INSTRUCTIONS);
    }


}
