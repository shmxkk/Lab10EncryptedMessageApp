import java.util.Scanner;

/**
 * Main View handles interaction with the client - essentially System.in and System.out
 *
 *
 * @author YOUR NAME <br>
 *         YOUR EMAIL <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class MainView {
    private final Scanner scnr = new Scanner(System.in);


    /**
     * Simply forces the scanner to read from the console and return a line.
     * @return a new line from the console.
     */
    public String getResponse() {
        return scnr.nextLine();
    }



    /**
     * Prints the main menu options
     * @param messageCount the number of messages the current uses has available to read.
     */
    public void printMainMenu(int messageCount) {
        System.out.println(English.Main.COMMAND_WINDOW);
        if(messageCount > 0)
            System.out.printf(English.Main.MESSAGE_COUNT, messageCount);
        System.out.println();
        System.out.print(English.Main.COMMANDS);
    }

    /**
     * prints out to the screen with a new line.
     * @param str line to print
     */
    public void display(String str) {
        System.out.println(str);
    }

    /// NOTE: below is often handled through localization Strings read from a file (often xml). not with seperate methods every time or even hard coded strings

    /**
     * Inform user there is an invalid entry
     */
    public void printInvalidEntry() {
        display(English.INVALID_GENERAL);
    }

    /**
     * friendly goodbye referencing TRON
     */
    public void printExit() {
        display(English.Main.GOODBYE);
    }


}
