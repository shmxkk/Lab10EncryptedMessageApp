/**
 * @author YOUR NAME <br>
 *         YOUR EMAIL <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class MessageController {

    private final MessageView view = new MessageView();

    /**
     * Prints the single message that can be stored as for a client, and then deletes it.
     */
    public void getMessage(Contact currentLogin) {
        if(currentLogin.getMessage() != null) {
            String key = currentLogin.getSubstitutionKey();
            if(currentLogin.getMessage().getEncryptionType().equals(ShiftingCaesarCipher.TYPE)) key = currentLogin.getCaesarKey();
            view.display(currentLogin.getMessage().render(key));
            currentLogin.setMessage(null); // reset the empty message
        }else {
            view.printNoMessages();
        }
    }

    /**
     * Composes a message and encrypts it for later retrieval. Only person it is composed for can retrieve it.
     */
    public void composeMessage(Contact currentLogin, ContactFactory contact) {
        Contact to = getContactForCompose(contact);
        if(to == null) return; // exit if contact does not exist
        String subject = getSubject();
        String body = getBody();
        String encryptionType = getEncryptionType();
        String key = to.getSubstitutionKey();
        if(encryptionType.equals(ShiftingCaesarCipher.TYPE)) key = to.getCaesarKey();
        view.printEncryptionStatus();
        Message msg = new Message(to.getEmail().getEmail(),
                currentLogin.getEmail().getEmail(),
                subject, body, encryptionType, key);
        to.setMessage(msg);  // store with who it is going to - maybe another way to do this?
        view.display(msg.render());
        view.printLoginToView();
    }

    /**
     * Helper method that prompts the client for the type of encryption for the message.
     * @return either Security.ShiftingCaesarCipher.TYPE or Security.SubstitutionCipher.TYPE (Default)
     */
    private String getEncryptionType() {
        view.printEncryptionTypeQuestion();
        String type = view.getResponse().toLowerCase();
        if(type.equals("caesar")) return ShiftingCaesarCipher.TYPE;
        return SubstitutionCipher.TYPE;
    }

    /**
     * Prompts the user for typing in a multiline response to get the message body. While most appliations
     * would use cntl-D, we used END typed in, due to the zybooks interface.
     * @return
     */
    private String getBody() {
        view.printComposePrompt();
        return  view.getMultilineResponse();
    }

    /**gets the subject line for the message**/
    private String getSubject() {
        view.printComposeSubjectRequest();
        return view.getResponse().trim();
    }

    /**Gets the contact the message is going to be composed to. **/
    private Contact getContactForCompose(ContactFactory contacts) {
        Contact contact = null;
        while(contact == null) {
            view.printComposeRequest();
            String response = view.getResponse();
            if(response.equalsIgnoreCase("x")) break;
            contact = contacts.getContact(response);
            if(contact == null) {
                view.printInvalidEntry();
            }
        }
        return contact;
    }


}
