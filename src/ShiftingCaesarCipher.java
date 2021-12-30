/**
 * While the traditional Caesar Cipher 'shifts' a letter down the alphabet, and by knowing the correct shift,
 * you an shift it back the correct direction, a Security.ShiftingCaesarCipher changes the shift amount
 * every so many number of characters. While that means the key could be multiple shift values, this one
 * actually just moves the value up by one for every 5 characters
 *
 * @author YOUR NAME <br>
 *         YOUR EMAIL <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 20210
 */
public class ShiftingCaesarCipher {
    private static final int WINDOW = 5;
    public static final String TYPE = "SHIFTING_CAESAR";


    /**
     * Shifts a character down by adding the byte value to the character, and then casting it back to
     * a character
     * @param x the original character
     * @param shift the byte value to add to the character
     * @return the new character (casted as a character)
     */
    public static char shift(char x, byte shift) {
       return 0; //TODO by student
    }

    /**
     * "Encrypts" a string by going through each element in the string, and 'shifting' the character by
     * the given amount. For example
     *
     * <pre>
     *     encryptString("Abba", 2); // returns "Cddc"
     *     encryptString("Ada", 10); // returns "Knk"
     *     encryptString("Turing", 5); // returns Yzwnsl
     * </pre>
     * @param str the string to encrypt
     * @param shift the amount to shift or the 'key' for the cipher
     * @return the encrypted string based on the shift value
     */
    public static String simpleCaesarEncode(String str, byte shift) {
        StringBuilder builder = new StringBuilder(); // we use a StringBuilder as it is more efficient on memory than +=
        // to 'concatenate' to a string builder, use builder.append(value) with value being what you want to concatenate
        // to the string.

        // TODO by student

        // end TODO
        return builder.toString();
    }


    /**
     * Encrypts a String using a ShiftingCasarCipher, meaning the the key/shift changes every WINDOW worth of character
     * by 1. So if the key was 6 and window 5, Characters 0-4 would be shifted 6, 5-9, shifted 7, 10-14, shifted 8 and so on.
     * @param str the message to encrypt
     * @param shift the amount of initial shift to start with.
     * @return the encrypted string
     */
    public static String encrypt(String str, byte shift) {
        if(str.length() < WINDOW) return simpleCaesarEncode(str, shift); // in case it is smaller than the window
        StringBuilder rtn = new StringBuilder();
        int last = 0;
        for(int i = 0; i < str.length(); i++) {
            if((i+1) % WINDOW == 0) { // need the +1 else it shifts no the 0 index
                rtn.append(simpleCaesarEncode(str.substring(last, i), shift));
                last = i;
                if(shift >=0) shift++;
                else shift--;

            }
        }
        if(last+1 != str.length()) {
            rtn.append(simpleCaesarEncode(str.substring(last), shift)); // capture the last part
        }
        return rtn.toString();
    }


    // --------------------- Do not modify below this line ----------------------------

    /**
     * Basic encrypt method that takes in two strings
     * @param str  the string to encrypt
     * @param key  the key as a string
     * @return the encrypted string
     */
    public static String encrypt(String str, String key) {
        return encrypt(str, Byte.parseByte(key));
    }


    /**
     * Decrypts a cipher which is simply inverting the key
     * @param str  the string to encrypt
     * @param key  the key as a string
     * @return the encrypted string
     */
    public static String decrypt(String str, String key) {
        return decrypt(str, Byte.parseByte(key));
    }

    /**
     * Basic encrypt method that takes in two strings
     * @param str  the string to encrypt
     * @param shift  the key as a byte
     * @return the encrypted string
     */
    public static String decrypt(String str, Byte shift) {
        return encrypt(str, (byte)-shift);
    }



}
