/**
 * Class that handles the program flow when dealing with listing contacts and the contact listing for a single
 * contact
 * 
 * READ ONLY
 *
 * @author YOUR NAME <br>
 *         YOUR EMAIL <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class ContactsController {

    private final ContactsView view = new ContactsView();



    /**Lists all the various contacts, and asks client if they want to display details for a single contact**/
    public void listContacts(ContactFactory contacts) {
        view.display(contacts.render());
        view.printContactsPrompt();
        String answer = view.getResponse().trim();
        if(answer.isEmpty()) return;
        Contact toList = contacts.getContact(answer);
        if(toList != null) {
            view.display(toList.render());
        }else {
            view.printInvalidEntry();
        }

    }
}
