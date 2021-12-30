import java.util.Random;

/**
 *
 * Contains the contact/client information.
 *
 * @author YOUR NAME <br>
 *         YOUR EMAIL <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class Contact {
    private static final Random rnd = new Random(); // used for generating random caesar cipher keys

    private String name;
    private PhoneNumber phoneNumber;
    private Email email;
    private Address address;
    private String substitutionKey;
    private String caesarKey;
    private String pw;
    private Message message;

    /**
     * Cleans up a String, isolating only the numbers.
     * Example: "ab123deFG" returns "123" and "a1b2c3d4" returns "1234".
     * Using Character.isDigit() may be helpful.
     *
     * @param number the String to be cleaned up
     * @return the new String, made up of only numbers
     */
    public String cleanNumber(String number) {
        StringBuilder str = new StringBuilder();
        //TODO STUDENT
       
        //END TODO
        return str.toString();
    }


    // ------------------------------ DO NOT MODIFY BELOW THIS LINE -----


    /** gets a message if one is stored with the contact or null **/
    public Message getMessage() {
        return message;
    }

    /** Stores a message object with the contact. Not the best way to do this. Instead a server should hold the messages**/
    public void setMessage(Message message) {
        this.message = message;
    }

    /** Gets the password **/
    public String getPassword() {
        return pw;
    }

    /** sets the contacts password **/
    public void setPassword(String pw) {
        this.pw = pw;
    }

    /** returns if the user as an ename - which is the first half of their email **/
    public boolean hasEName(String ename) {
        return getEmail().getEName().equalsIgnoreCase(ename); // since only one email for now.
    }

    /** Sets the key to be used for any substitution ciphers **/
    public void setSubstitutionKey(String substitutionKey) {
        this.substitutionKey = substitutionKey;
    }

    /** the key to used any caesar ciphers **/
    public void setCaesarKey(String caesar) {
        this.caesarKey = caesar;
    }

    /** gets the key to use for encryption **/
    public String getSubstitutionKey() {
        return substitutionKey;
    }

    /** gets the key for caesars **/
    public String getCaesarKey() {
        return caesarKey;
    }

    /** gets the phone number **/
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    /** gets the email for the contact **/
    public Email getEmail() {
        return email;
    }

    /** gets the address for the contact **/
    public Address getAddress() {
        return address;
    }

    /** gets the name for the contact **/
    public String getName() {
        return name;
    }

    /** sets the name for the contact **/
    public void setName(String name) {
        this.name = name;
    }

    /** adds an address to the contact - only one for now**/
    public void addAddress(String type, String street, String city, String state, String zip) {
        address = new Address(type, street, city, state, zip);
    }

    /** adds an email if it has the @ sign in it **/
    public void addEmail(String type, String email) {
        if(!email.contains("@")) return;
        this.email = new Email(type, email);
    }

    /** add a phone number as long as long as it is valid **/
    public void addPhoneNumber(String type, String number) {
        number = cleanNumber(number);
        if(number.length() != 10) return;
        phoneNumber = new PhoneNumber(type, number);
    }


    /** returns a string representation of the contact **/
    public String render() {
        return String.format("***** Contact Info For %s *****%n%n", getName()) +
               String.format("Name: %s%n%n", getName()) +
               String.format("Phone Numbers:%n%s%n%n", phoneNumber.render()) +
               String.format("Emails:%n%s%n%n", email.render()) +
               String.format("Addresses:%n%s%n%n", address.render());
    }

    /** basic constructor with the keys **/
    public Contact(String name, String subKey, String caesar) {
        setName(name);
        setSubstitutionKey(subKey);
        setCaesarKey(caesar);
    }

    /** construction that sets random keys **/
    public Contact(String name) {
        setName(name);
        setSubstitutionKey(SubstitutionCipher.getRandomSequence());
        setCaesarKey(String.valueOf(rnd.nextInt(26)));
    }



}
