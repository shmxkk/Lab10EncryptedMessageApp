/**
 *
 * This is a read only file that generates a bunch of contacts. In an ideal application,
 * contacts would load from a file. 
 * READ ONLY
 * 
 * @author YOUR NAME <br>
 *         YOUR EMAIL <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class ContactFactory {
    // load a bunch of contacts - seems like a better idea would be to read from
    // a file and store an arbitrary number of them. Seems like something we will cover in the future.
    private final Contact one = new Contact("Alice");
    private final Contact two = new Contact("Hatter");
    private final Contact three = new Contact("Red Queen");
    private final Contact four = new Contact("Cheshire");
    private final Contact five = new Contact("White Rabbit");
    private final Contact six = new Contact("White Queen");
    private final Contact seven = new Contact("Absolem");

    /**
     * Load data about the contacts in the system. This would be better if we could load it from a file.
     */
    private void loadContactInformation()  {
        one.setPassword(SecurityHash.encodePassword("alice")); // it is common to store passwords using security hashes.
        two.setPassword(SecurityHash.encodePassword("hatter"));
        three.setPassword(SecurityHash.encodePassword("red"));
        four.setPassword(SecurityHash.encodePassword("cheshire"));
        five.setPassword(SecurityHash.encodePassword("rabbit"));
        six.setPassword(SecurityHash.encodePassword("queen"));
        seven.setPassword(SecurityHash.encodePassword("caterpillar"));

        one.addEmail("Home", "awonder@wonderland.colostate.edu");
        two.addEmail("Office", "madhatter@wonderland.colostate.edu");
        three.addEmail("Other", "offwiththeirheads@wonderland.colostate.edu");
        four.addEmail("Home", "vanishingcat@wonderland.colostate.edu");
        five.addEmail("Home", "late@wonderland.colostate.edu");
        six.addEmail("Home", "necro@wonderland.colostate.edu");
        seven.addEmail("Office", "hookahblue@wonderland.colostate.edu");

        one.addPhoneNumber("Home", "5557552099");
        two.addPhoneNumber("Home", "5557762323");
        three.addPhoneNumber("Mobile","5558675309");
        four.addPhoneNumber("Home", "5552255887");
        five.addPhoneNumber("Mobile", "5559705789");
        six.addPhoneNumber("Office", "5557779311");
        seven.addPhoneNumber("Home", "5550222285");

        one.addAddress("Home", "1 Wonder Lane", "Chelsea", "London", "");
        two.addAddress("Office", "23 Tea party", "Forest", "WL", "80010");
        three.addAddress("Other", "7 Red Castle", "Capitol", "WL", "80010");
        four.addAddress("Home", "0 Vanishing Point", "Forest", "WL", "80010");
        five.addAddress("Other", "15300 Rabbit Hole", "Forest", "WL", "80010");
        six.addAddress("Home", "456 Castle Retreat", "Hidden City", "WL", "80010");
        seven.addAddress("Home", "123 Shroom Lane", "Forest", "WL", "80010");
    }

    /**
     * Grabs a contact based on the ename.
     * @param ename the ename half of the email. Assuming it is unique, though entire email would be better
     * @return the contact or null if contact does not exist.
     */
    public Contact getContact(String ename) {
        Contact tmp = null;
        if(one.hasEName(ename)) {
            tmp = one;
        }else if(two.hasEName(ename)) {
            tmp = two;
        }else if(three.hasEName(ename)) {
            tmp = three;
        }else if(four.hasEName(ename)) {
            tmp = four;
        }else if(five.hasEName(ename)) {
            tmp = five;
        }else if(six.hasEName(ename)) {
            tmp = six;
        }else if(seven.hasEName(ename)) {
            tmp = seven;
        }
        return tmp;
    }

    /**
     * Helps with formatting for a single contact display.
     * [pre]Name [email][pre]
     * @param contact The contact
     * @return String formatted contact pairing
     */
    public String single(Contact contact) {
        return String.format("%s <%s>%n", contact.getName(), contact.getEmail().getEmail());
    }

    /**
     * renders all contacts as multiple lines with the single formatting
     * @return
     */
    public String render() {
        return single(one) + single(two) + single(three) + single(four) + single(five) + single(six) + single(seven);
        // definitely needs to be a better way to do this - maybe involving loops and a structure to store it all
    }

    /**
     * Constructor. This factory builds seven contacts and then loads information into those contacts.
     */
    public ContactFactory() {
        loadContactInformation();
    }


}
