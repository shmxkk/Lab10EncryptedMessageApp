/**
 *
 * UnitTesting is essential *after* you work through a method, and have it running. It helps you check for boundary
 * conditions, and make sure your code is working. This class only contains the unit tests, and should only be called
 * when wanting to run the tests for the program, over the actual application itself.
 *
 * @author YOUR NAME <br>
 *         YOUR EMAIL <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class UnitTest {

    /**
     * Driver method to run all the unit tests. All unit tests are public, so they could be run individually.
     */
    public static void runTests() {


        testEmail();
        //testPhone();
        //testContact();
        //testCaesarCipher();
        //testSubstitutionCipher();
        //testMessage();

        // the following tests are ones we used in development beyond the methods you are working on as a student

       // testAddress();
       // testGetRandomSequence();


    }

    public static void testContact() {

        System.out.println("\n\nTESTING contact");
        Contact gd = new Contact("Morgan");
        gd.addPhoneNumber("Home", "5557762323");
        System.out.println(gd.getPhoneNumber().render());
        gd.addAddress("Home", "100 Cloud Plaza", "Aiea", "Hawaii", "96701");
        System.out.println(gd.getAddress().render());
        gd.addEmail("Home", "gd@freeman.org");
        System.out.println(gd.getEmail().render());
        System.out.println(gd.render());

        // add your own, what happens when address, phone and email are not properly formatted???

    }

    public static void testPhone() {
        System.out.println("\n\nTESTING Phone number");
        PhoneNumber phoneOne = new PhoneNumber("Home", "9708675309");
        System.out.println(phoneOne.getNumber());
        System.out.println(phoneOne.getType());
        System.out.println(phoneOne.getPrefix());
        System.out.println(phoneOne.getAreaCode());
        System.out.println(phoneOne.getLine());
        System.out.println(phoneOne.getPrettyNumber());
        System.out.println(phoneOne.render());
        // add your own!

    }

    public static void testEmail() {
        System.out.println("\n\nTESTING email");
        Email emailOne = new Email("Home", "splashylemon@cs.colostate.edu");
        System.out.println(emailOne.getType());
        System.out.println(emailOne.getEmail());
        System.out.println(emailOne.getEName());
        System.out.println(emailOne.getDomain());
        System.out.println(emailOne.render());
        // add your own!

    }

    public static void testAddress() {
        System.out.println("\n\nTESTING address");
        Address homeAddress = new Address("Home", "1600 Pennsylvania Ave NW", "Washington DC", "", "20500");
        System.out.println(homeAddress.getType());
        System.out.println(homeAddress.getStreet());
        System.out.println(homeAddress.getCity());
        System.out.println(homeAddress.getState());
        System.out.println(homeAddress.getZip());
        System.out.println(homeAddress.render());
        Address workAddress = new Address("Office", "200 E Colfax Ave", "Denver", "CO", "80203");
        System.out.println(workAddress.render());
    }

    public static void testCaesarCipher() {
        System.out.println("\n\nTESTING Caesar Cipher (all tests should be true)");

        System.out.println("... simpleCaesarEncode ...");
        System.out.printf("Testing \"Abba\" with shift 2 : %b%n", ShiftingCaesarCipher.simpleCaesarEncode("Abba", (byte)2).equals("Cddc"));
        System.out.printf("Testing \"Ada\" with shift 10 : %b%n", ShiftingCaesarCipher.simpleCaesarEncode("Ada", (byte)10).equals("Knk"));
        System.out.printf("Testing \"Turing\" with shift 5 : %b%n", ShiftingCaesarCipher.simpleCaesarEncode("Turing", (byte)5).equals("Yzwnsl"));

        System.out.println("... Shifting Window Caesar Encoding ...");
        String testString = "Abba, The answer to the question is 42?"; // note we started with Abba here, so we could confirm Cddc
        System.out.printf("Testing: %s with a shift of 2%n",testString);
        String encryptedString = ShiftingCaesarCipher.encrypt(testString, "2");
        System.out.printf("Shifting Caesar Encryption: %s%n", encryptedString);
        System.out.printf("Shifting Caesar Decryption: %s%n", ShiftingCaesarCipher.decrypt(encryptedString, "2"));
        System.out.printf("Shift is less than window, should just return simple. \"Abba\" should be \"Cddc\". It is: %s%n", ShiftingCaesarCipher.encrypt("Abba", "2"));

        //Add your own tests here!


    }

    public static void testSubstitutionCipher() {
        // BASE          ABCEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789.?()    // by putting this here, it is easier to debug the encrypt
        String mapOne = "jfodXtvaYkM4mWIT2gBeJZRQy078L9zqpwN1GE5x.iFlCrsVKc?PnUH63Ouhb()AS";
        String mapTwo = "NCOk4)XPARIL7H2VUg3mM?S(pyGtrWdl6QhxnBKbv5wfze0.8FTucojEYZaqs1Ji9";
        String mapThree = "PFzSZ0plU3vbR2NXrWMsfHqemLOijI1AEJ(aCdT)YVQuK6B7yw9G4?g5xct.8nkho";

        System.out.println("\n\nTESTING substitutionCipher");

        String message = "River Song is Melody Pond";
        String encryptedOne = SubstitutionCipher.encrypt(message, mapOne);
        String encryptedTwo = SubstitutionCipher.encrypt(message, mapTwo);
        String encryptedThree = SubstitutionCipher.encrypt(message, mapThree);

        String decryptOne = SubstitutionCipher.decrypt(encryptedOne, mapOne);
        String decryptTwo = SubstitutionCipher.decrypt(encryptedTwo, mapTwo);
        String decryptThree = SubstitutionCipher.decrypt(encryptedThree, mapThree);


        System.out.printf("Message is: %s%n", message);
        System.out.printf("Encrypted:%n%s%n%s%n%s%n", encryptedOne, encryptedTwo, encryptedThree);
        System.out.printf("Decrypted:%n%s%n%s%n%s%n", decryptOne, decryptTwo, decryptThree);

        System.out.printf("Confirming decryption: %b, %b, %b%n", decryptOne.equals(message), decryptTwo.equals(message),
                decryptThree.equals(message));

        // add your own tests here. If you need to get another alphabet map / key, uncomment the call to testGetRandomSequence()

    }

    public static void testMessage() {
        System.out.println("\n\nTESTING Message");

        String map = SubstitutionCipher.getRandomSequence();
        String messageOne = "Sonia Sanchez: Haiku [for you]\nlove between us is\nspeech and breath. loving you is\na long river running.";
        String messageTwo = "A Viking Haiku\nA long days walk, a\nsword by side, and song in heart,\nand we all drank mead!";
        String to = "baroness@magickingdom.org";
        String from = "baron@magickingdom.org";
        String sub = "A love poem";

        Message msg = new Message(to, from, sub, messageOne);
        Message msg2 = new Message(from, to, sub, messageTwo);

        System.out.println(msg.render());

        System.out.println(msg2.render());

        msg.setMessage(messageOne, ShiftingCaesarCipher.TYPE, "6");
        System.out.println(msg.render());
        System.out.println(msg.render("6"));

        msg2.setMessage(messageTwo, SubstitutionCipher.TYPE, map);
        System.out.println(msg2.render());
        System.out.println(msg2.render(map));

    }


    // this test actually helped us generate the keys for the testSubstitutionCipher, and to confirm no duplicates in the sequence
    public static void testGetRandomSequence() {
        System.out.println("\n\nTESTING getRandomSequence()");
        System.out.println(SubstitutionCipher.getRandomSequence());
        System.out.println(SubstitutionCipher.getRandomSequence());
        System.out.println(SubstitutionCipher.getRandomSequence());
    }


}
