/**
 * Practical 2:   Encrypted Communications
 *
 * For this practical, the students will work with an encrypted
 * contact application that is meant to send messages between contacts.
 *
 * Essentially it is an email application without the networking.
 *
 * What you will learn:
 *
 * <ul>
 *     <li>loops</li>
 *     <li>character</li>
 *     <li>basic operations</li>
 *     <li>string manipulation</li>
 * </ul>
 *
 * @author YOUR NAME <br>
 *         YOUR EMAIL <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class Main {
    /** entry point for the program **/
    public static void main(String[] args) {
        if(args.length > 0 && args[0].equalsIgnoreCase("debug")) {
            UnitTest.runTests();
        } else { // if in  DEBUG mode don't run the program.
            MainController controller = new MainController();
            controller.start();
        }


    }
}
