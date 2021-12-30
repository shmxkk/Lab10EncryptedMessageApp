/**
 *
 * Handles the logic of clients logging into the message system by checking if they are valid users,
 * and checking passwords
 *
 * @author YOUR NAME <br>
 *         YOUR EMAIL <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class LoginController {
    final LoginView lv = new LoginView();
    final ContactFactory factory;


    /**
     * A simple signin method that checks to see if the person has a valid ename (signin name / account name)
     * and their password. All passwords are stored as an uniquely encoded hash, so we automatically encode the input
     * so we can compare encodings.
     * @return a reference to the active contact
     */
    public Contact askSigin() {
        Contact contact;
        boolean invalid = true;
        do {
            lv.printLoginQuestion();
            String ename = lv.getResponse().trim();
            lv.printPasswordQuestion();
            String pw = SecurityHash.encodePassword(lv.getResponse().trim());  // notice we need to check encoded compared to encoded
            contact = factory.getContact(ename);
            if(contact != null && contact.getPassword().equals(pw)) {
                invalid = false;
            }else {
                lv.printInvalidLogin();
            }
        }while(invalid);
        return contact;
    }

    /**
     * Needs the factory as that gives it access to the various contacts in the system
     * @param factory a ContactFactory with contacts initialized in the system
     */
    public LoginController(ContactFactory factory) {
        this.factory = factory;
    }
}
