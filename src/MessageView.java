import java.util.Scanner;

/**
 * Handles the input and output for the Messages Section of the application
 *
 * @author YOUR NAME <br>
 *         YOUR EMAIL <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class MessageView {

    private Scanner scnr = new Scanner(System.in);

    /**
     * Simply forces the scanner to read from the console and return a line.
     * @return a new line from the console.
     */
    public String getResponse() {
        return scnr.nextLine();
    }

    /**
     * Reads multiple  lines until END is  typed. Then returns every line, but the line that includes END
     * @return all the lines stored in a single string.
     */
    public String getMultilineResponse() {
        StringBuilder lines = new StringBuilder();
        String line = "";
        while(true) {
            line = scnr.nextLine();
            if(line.contains("END")) break;
            lines.append(line);
            lines.append("\n"); // just so we don't loose the newline character as scanner trims it
        }
        return lines.toString();
    }


    /**
     * prints out to the screen with a new line.
     * @param str line to print
     */
    public void display(String str) {
        System.out.println(str);
    }


    /**
     * Instructions for who to write a message to
     */
    public void printComposeRequest() {
        System.out.print(English.Message.REQUEST);
    }

    /**
     * Instructions for composing a message
     */
    public void printComposePrompt() {
        display(English.Message.COMPOSE_BODY);
    }

    /**
     * Prompting for subject of the message
     */
    public void printComposeSubjectRequest() {
        System.out.print(English.Message.COMPOSE_SUBJECT);
    }

    /**
     * Prompting for encryption type
     */
    public void printEncryptionTypeQuestion() {
        System.out.print(English.Message.ENCRYPTION_TYPE);
    }

    /**
     * Informing that encryption is being done
     */
    public void printEncryptionStatus() {
        display(English.Message.ENCRYPTION_UPDATE);
    }

    /**
     * Informing client how to view the message
     */
    public void printLoginToView() {
        display(English.Message.VIEW_INSTRUCTIONS);
    }

    /**
     * Used when a client attempts to retrieve a message when their inbox is empty.
     */
    public void printNoMessages() {
        display(English.Message.NO_MAIL);
    }

    /**
     * Inform user there is an invalid entry
     */
    public void printInvalidEntry() {
        display(English.INVALID_GENERAL);
    }

}
