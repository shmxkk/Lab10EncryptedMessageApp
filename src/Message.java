/**
 *
 * Holds a message for the client, so they can read it.
 *
 * @author YOUR NAME <br>
 *         YOUR EMAIL <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class Message {
    private String message;
    private String encryptionType;
    private String from;
    private String to;
    private String subject;

    /** Gets the message. Just a simple text String **/
    public String getMessage() {
        return ""; //TODO STUDENT
    }

    /** sets the message, Just a simple text string**/
    public void setMessage(String message) {
        //TODO STUDENT
    }

    /** Gets the encryption type **/
    public String getEncryptionType() {
        return ""; //TODO STUDENT
    }

    /** sets the encryption type. **/
    public void setEncryptionType(String encryptionType) {
        //TODO STUDENT
    }

    /** gets the sender email **/
    public String getFrom() {
        return ""; //TODO STUDENT
    }

    /** sets the sender email **/
    public void setFrom(String from) {
        //TODO STUDENT
    }

    /** get the to email **/
    public String getTo() {
        return ""; //TODO STUDENT
    }

    /** sets the to email **/
    public void setTo(String to) {
        //TODO STUDENT
    }

    /** gets the subject line **/
    public String getSubject() {
        return ""; //TODO STUDENT
    }

    /** sets the subject line **/
    public void setSubject(String subject) {
        //TODO STUDENT
    }

    // -----------------------------------  Don't modify below this line

    /**
     * renders the head of the message for printing
     */
    private String renderHead() {
        return String.format("     To: %s%n", getTo()) +
               String.format("   From: %s%n", getFrom()) +
               String.format("Subject: %s%n", getSubject()) +
               String.format("--------------------------------%n");

    }

    /** renders the message assuming no decrypting **/
    public String render() {
       return renderHead() + getMessage() + "\n";
    }

    /** renders with decryption **/
    public String render(String encryptionKey) {
        return renderHead() + getMessage(encryptionKey) + "\n";
    }


    /** gets a message based on the encryptionKey **/
    public String getMessage(String encryptionKey) {
        String rtn = message;
        if(getEncryptionType().equals(SubstitutionCipher.TYPE)) {
            rtn = SubstitutionCipher.decrypt(message, encryptionKey);

        }else if(getEncryptionType().equals(ShiftingCaesarCipher.TYPE)) {
            rtn = ShiftingCaesarCipher.decrypt(message, encryptionKey);
        }
        return rtn;
    }

    /** sets a message and encrypts it based on type and key **/
    public void setMessage(String message, String encryptionType, String encryptionKey) {
        if(encryptionType.equals(SubstitutionCipher.TYPE)) {
            message = SubstitutionCipher.encrypt(message, encryptionKey);
        }else if(encryptionType.equals(ShiftingCaesarCipher.TYPE)) {
            message = ShiftingCaesarCipher.encrypt(message, encryptionKey);
        }
        setMessage(message);
        setEncryptionType(encryptionType);
    }

    /**
     * Sets up a basic message, assuming no encryption
     * @param to email
     * @param from email
     * @param subject subject line
     * @param message the message
     */
    public Message(String to, String from, String subject, String message) {
        setTo(to);
        setFrom(from);
        setSubject(subject);
        setMessage(message);
    }

    /**
     * Constructs a message that automatically encrypts
     * @param to  an email
     * @param from an email
     * @param subject subject line
     * @param message  message
     * @param encryptionType type of encryption
     * @param encryptionKey the key to encrypt it with
     */
    public Message(String to, String from, String subject, String message, String encryptionType, String encryptionKey) {
        setTo(to);
        setFrom(from);
        setSubject(subject);
        setMessage(message, encryptionType, encryptionKey);
    }

}
