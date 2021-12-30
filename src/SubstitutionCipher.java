import java.util.Random;

/**
 * A simple Security.SubstitutionCipher takes a message, and substitutes each letter in for another letter in the alphabet.
 *
 * @author YOUR NAME <br>
 *         YOUR EMAIL <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class SubstitutionCipher {
    private static final String BASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789.?()";
    public static final String TYPE = "SUBSTITUTION";



    /**
     * Encrypts using a substitution. MapTo is the substitution key, meaning what every
     * character should mapTo (A (from) -> x (to)). mapFrom is the default order of the character.
     * Technically, it could be any order, but the most common one is A-Za-z0-9.?() represented in BASE
     * @param str message to encode
     * @param mapTo the mapping to map the message character order to
     * @param mapFrom the mapping that is the base order
     * @return an encrypted string
     */
    public static String encrypt(String str, String mapTo, String mapFrom) {
        StringBuilder rtn= new StringBuilder();
        //TODO STUDENT
        //END TODO
        return rtn.toString();
    }

    //-------------------------------- Don't Modify below this line

    /**
     * The common default case of substitution in which the new mapping is changing the order of characters
     * from a traditional alphabet order. A-Za-z0-9 uses BASE to represented the traditional alphabet order
     * @param str the message to encrypt
     * @param mapTo the substitution key - new 'order of the alphabet'
     * @return an encrypted string
     */
    public static String encrypt(String str, String mapTo) {
        return encrypt(str, mapTo, BASE);
    }


    /**
     * Decrypts using the common default case / order of the alphabet A-Za-z0-9
     * @param str the string to decrypt
     * @param mapFrom the encryption key (i.e different order of the alphabet)
     * @return a decrypted string.
     */
    public static String decrypt(String str, String mapFrom) {
        return decrypt(str, mapFrom, BASE);
    }

    /**
     * Decryption is simply calling encryption of two alphabets (but with different orders), and
     * swapping which one is the base and foundation. This method calls encryption by swapping that order
     * @param str the string to decrypt
     * @param mapFrom the alphabet ordering used for encryption
     * @param mapTo the original order of the alphabet
     * @return the decrypted string
     */
    public static String decrypt(String str, String mapFrom, String mapTo) {
        return encrypt(str, mapTo, mapFrom); // decryption is swapping the maps.
    }


    /**
     * Calls #getRandomSequence(String) with the BASE final variable
     * @return return a random order of the BASE String
     */
    public static String getRandomSequence() {
        return getRandomSequence(BASE);
    }

    /**
     * Randomly samples the string, returning a string of the same length but with the characters in
     * a different order. For example
     * <pre>
     *     getRandomSequence("abc");
     *
     *     could return
     *     bca
     *     cba
     *     bac
     *     cab
     *     abc (very unlikely but possible)
     * </pre>
     *
     * Code inspired by - https://www.journaldev.com/32661/shuffle-array-java
     *
     * @param str The string you wish to randomize the character order
     * @return a new string with characters in a different random order
     */
    public static String getRandomSequence(String str) {
        char[] charArray = str.toCharArray();
        Random rnd = new Random();
        for(int i = 0; i < charArray.length; i++) {
            int randomIndex = rnd.nextInt(charArray.length); // generate random number for 0..length-1, so an index that exists
            char tmp = charArray[i]; // save the value in location i, this is a common 'swap' combination
            charArray[i] = charArray[randomIndex];
            charArray[randomIndex] = tmp;
        }
        return new String(charArray); // a string is an ordered sequence of character, or an array of characters
    }

}
