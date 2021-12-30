/**
 * Controls the main menu program flow. Often handling work off to other controllers, and also keeps track
 * of program wide variables the other controllers need.
 *
 * @author YOUR NAME <br>
 *         YOUR EMAIL <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class MainController {
    private Contact currentLogin = null;

    private final MainView mainView = new MainView();;
    private final MessageController msgController = new MessageController();
    private final ContactsController contactsController = new ContactsController();
    private final ContactFactory contacts = new ContactFactory();

    private final LoginController login = new LoginController(contacts);


    /**
     * Starts up the actual program, passing information between controllers, views and business logic layers
     */
    public void start() {
        currentLogin = login.askSigin();
        runMainMenu();
    }

    /**
     * Main application menu. Keeps running until someone types exit or x.
     */
    private void runMainMenu() {

        int msgCount = 0;
        while(true)  {
            if(currentLogin.getMessage() != null) msgCount = 1;
            else msgCount = 0; // reset condition
            mainView.printMainMenu(msgCount);
            String cmd = mainView.getResponse().toLowerCase();
            if(cmd.contains("x")) {
                mainView.printExit();
                return; // leave out of the method, and thus the loop - could also use break
            }else if(cmd.contains("g")) {  // often every main menu command is often a different controller and view
                msgController.getMessage(currentLogin);
            }else if(cmd.contains("l")) {
                contactsController.listContacts(contacts);
            }else if(cmd.contains("c")) {
                msgController.composeMessage(currentLogin, contacts);
            }else if(cmd.contains("r")) { // the loginController is an example of different controller + view
                currentLogin = null;  // force reset
                currentLogin = login.askSigin();
            }else {
                mainView.printInvalidEntry();
            }
        }
    }



}
