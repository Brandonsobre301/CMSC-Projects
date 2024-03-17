import static org.junit.Assert.*;
import org.junit.Test;

public class CryptoManagerTestStudent {

    @Test
    public void testStringInBounds() {
        assertTrue(CryptoManager.isStringInBounds("HELLO"));
        assertFalse(CryptoManager.isStringInBounds("hello"));
        assertFalse(CryptoManager.isStringInBounds("{JAVA"));
        assertFalse(CryptoManager.isStringInBounds("\"THIS TEST THAT SHOULD FAIL BECAUSE { IS OUTSIDE THE RANGE\""));
        assertTrue(CryptoManager.isStringInBounds("TESTING123"));
    }

    @Test
    public void testEncryptCaesar() {
        assertEquals("DEF", CryptoManager.caesarEncryption("ABC", 3));
        assertEquals("HELLO", CryptoManager.caesarEncryption("HELLO", 0));
        assertEquals("UFTUJOH", CryptoManager.caesarEncryption("TESTING", 1));
        assertEquals("WKLV#LV#DQRWKHU#WHVW", CryptoManager.caesarEncryption("THIS IS ANOTHER TEST", 3));
        assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("bye", 3));
    }

    @Test
    public void testDecryptCaesar() {
        assertEquals("TESTING", CryptoManager.caesarDecryption("UFTUJOH", 1));
        assertEquals("THIS IS ANOTHER TEST", CryptoManager.caesarDecryption("WKLV#LV#DQRWKHU#WHVW", 3));
        assertEquals("HELLO", CryptoManager.caesarDecryption("HELLO", 0));
  
    }

    @Test
    public void testEncryptBellaso() {
        assertEquals("WN#\\N &", CryptoManager.bellasoEncryption("TESTING", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
        assertEquals("UJ^^((HT^X[YYM\"", CryptoManager.bellasoEncryption("MERRY CHRISTMAS", "HELLO"));
        assertEquals("WU\\VR9F#N!RF88U-'HED", CryptoManager.bellasoEncryption("THIS IS ANOTHER TEST", "CMSC203"));
    }

    @Test
    public void testDecryptBellaso() {
        assertEquals("TESTING", CryptoManager.bellasoDecryption("WN#\\N &", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
        assertEquals("MERRY CHRISTMAS", CryptoManager.bellasoDecryption("UJ^^((HT^X[YYM\"", "HELLO"));
        assertEquals("THIS IS ANOTHER TEST", CryptoManager.bellasoDecryption("WU\\VR9F#N!RF88U-'HED", "CMSC203"));
    }
}
