/**
 * This is one way to setup localization strings based on the locality of the client using the application. Ideally,
 * the information would pull from an XML file - but this is the cheap way to do it. By putting them
 * in a separate file, it is easier to make sure you are using the same wording throughout the program.
 *
 * One part missing this localization is in contact.
 *
 * @author YOUR NAME <br>
 *         YOUR EMAIL <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class English {
    public static final String INVALID_GENERAL = "Invalid entry.";
    private static final String APP_NAME = "Encrypted Message System 101";

    public static class Login {
        static final String WELCOME = "Welcome to " + APP_NAME;
        static final String ENAME_PROMPT = "Please enter your e-name > ";
        static final String PASSWORD_PROMPT = "Please enter your password > ";
        static final String INVALID_PROMPT = "Invalid Sign-in: Try again (look at assignment specifications)\n\n";
    }
    public static class Main {
        static final String COMMAND_WINDOW = "+-------- " + APP_NAME + "----------+\n" +
                                             "|                                                |\n" +
                                             "| (L)ist Contacts                                |\n" +
                                             "| (G)et Message                                  |\n" +
                                             "| (C)ompose Message                              |\n" +
                                             "| (R)eturn to Sign-in                            |\n" +
                                             "|  E(x)it Program                                |\n" +
                                             "+------------------------------------------------+";

        static final String MESSAGE_COUNT  = "You have %d pending message(s)!!%n";
        static final String COMMANDS = "Enter an option (L|G|C|R|X): ";
        static final String GOODBYE = "Thank you. Have a good day, user.";

    }
    public static class Message {
        public static final String REQUEST = "Type E-Name of contact to send message to (x to return back): ";
        public static final String COMPOSE_BODY = "Message Composing - type END (on a new line) when done composing the message";
        public static final String COMPOSE_SUBJECT = "Enter the subject of your message: ";
        public static final String ENCRYPTION_TYPE = "How would you like to encrypt the message - defaults to sub (Caesar|Sub)? ";
        public static final String ENCRYPTION_UPDATE = "Encrypting Message... ";
        public static final String VIEW_INSTRUCTIONS = "To view the message, sign-in as the other client";
        public static final String NO_MAIL = "You have no waiting messages!";
    }

    public static class Contacts {
        public static final String SINGLE_CONTACT_INSTRUCTIONS = "Type Contact E-Name to See Full Contact, or return to exit: ";
    }
}
