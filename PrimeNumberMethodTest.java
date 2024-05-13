import org.junit.Test;

import static org.junit.Assert.*;



public class PrimeNumberMethodTest {

	   /**
     * Tests the isPrime method with various inputs.
     */

    @Test

    public void testIsPrime() {
        assertTrue(PrimeNumberClass.isPrime(2));
        assertTrue(PrimeNumberClass.isPrime(3));
        assertTrue(PrimeNumberClass.isPrime(5));
        assertTrue(PrimeNumberClass.isPrime(7));
        assertTrue(PrimeNumberClass.isPrime(11));
        assertTrue(PrimeNumberClass.isPrime(13));
        assertFalse(PrimeNumberClass.isPrime(4));
        assertFalse(PrimeNumberClass.isPrime(6));
        assertFalse(PrimeNumberClass.isPrime(8));
        assertFalse(PrimeNumberClass.isPrime(9));
        assertFalse(PrimeNumberClass.isPrime(10));

    }
}