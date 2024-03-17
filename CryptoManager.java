/*
 * Class: CMSC203 
 * Instructor: Prof. Eivazi
 * Description: This program encrpyts/decrypts strings using the Caser and Bellaso cipher methods
 * Due: 03/16/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Brandon Sobremisana
*/

public class CryptoManager {
   
	// Declare the bounds for ASCII characters
    private static final char LOWER_BOUND = ' ';
    private static final char UPPER_BOUND = '_';

    // Method to check if a string is within the allowable bounds
    public static boolean isStringInBounds(String plainText) {
      
    	// Iterate through each character in the plainText within allowable bounds
    	for (char c : plainText.toCharArray()) {
            if (c < LOWER_BOUND || c > UPPER_BOUND) {
                return false;
            }
        }
        // Return false if any character is outside the bounds
    	return true;
    }

    // Method to encrypt using the Caesar Cipher
    public static String caesarEncryption(String plainText, int key) {
       
    	// Check if the plainText is within the allowable bounds and return an error if not
    	if (!isStringInBounds(plainText)) {
            return "The selected string is not in bounds, Try again.";
        }
    	// Initialize a StringBuilder to store the encrypted text
        StringBuilder encryptedText = new StringBuilder();
        
        // Iterate through each character in plainText and wrap around if the shifted value is outside the upper bound
        for (char c : plainText.toCharArray()) {
            int shiftedValue = c + key;
            while (shiftedValue > UPPER_BOUND) {
                shiftedValue -= (UPPER_BOUND - LOWER_BOUND + 1);
            }
            encryptedText.append((char) shiftedValue);
        }
  
        return encryptedText.toString();
    }

    // Method to decrypt a string using the Caesar Cipher
    public static String caesarDecryption(String encryptedText, int key) {
    	
    	 if (!isStringInBounds(encryptedText)) {
    	        return "This is invalid ciphertext.";
    	    }
    	// Initialize a StringBuilder to store the decrypted text
    	StringBuilder decryptedText = new StringBuilder();
        
        // Iterate through each character in the encryptedText and shift the character by the inverse of the key
        for (char c : encryptedText.toCharArray()) {
            int shiftedValue = c - key;
           
            // Wrap around if shifted value lies outside of the bounds
            while (shiftedValue < LOWER_BOUND) {
                shiftedValue += (UPPER_BOUND - LOWER_BOUND + 1);
            }
        
            // Append the shifted character to the decrypted text
            decryptedText.append((char) shiftedValue);
        }

        return decryptedText.toString();
    }

    // Method to encrypt a string using the Bellaso Cipher
    public static String bellasoEncryption(String plainText, String bellasoStr) {
    	
    	// Initialize a StringBuilder to store the encrypted text
    	StringBuilder encryptedText = new StringBuilder();
    	
    	 // Iterate through each character in the plainText and rap around if the shifted value is outside the upper bound
        for (int i = 0; i < plainText.length(); i++) {
            char plainChar = plainText.charAt(i);
            char bellasoChar = bellasoStr.charAt(i % bellasoStr.length());
            int shiftedValue = plainChar + bellasoChar;

            while (shiftedValue > UPPER_BOUND) {
                shiftedValue -= (UPPER_BOUND - LOWER_BOUND + 1);
            }

            encryptedText.append((char) shiftedValue);
        }

        return encryptedText.toString();
    }

    // Method to decrypt a string using the Bellaso Cipher
    public static String bellasoDecryption(String encryptedText, String bellasoStr) {
        
    	// Initialize a StringBuilder to store the decrypted text
    	StringBuilder decryptedText = new StringBuilder();
    	
    	// Iterate through each character in the encryptedText and rap around if the shifted value is outside the lower bound
        for (int i = 0; i < encryptedText.length(); i++) {
            char encryptedChar = encryptedText.charAt(i);
            char bellasoChar = bellasoStr.charAt(i % bellasoStr.length());
            int shiftedValue = encryptedChar - bellasoChar;

            while (shiftedValue < LOWER_BOUND) {
                shiftedValue += (UPPER_BOUND - LOWER_BOUND + 1);
            }
         // Append the shifted character to the decrypted text
            decryptedText.append((char) shiftedValue);
        }
     // Return the decrypted text
        return decryptedText.toString();
    }
}
