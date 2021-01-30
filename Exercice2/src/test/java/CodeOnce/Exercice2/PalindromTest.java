package CodeOnce.Exercice2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PalindromTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PalindromTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PalindromTest.class );
    }
    

    /**
     * Rigourous Test :-)
     */
    public void testApp1()
    {
        assertTrue(new Palindrome().isPalindrome("r ad.ar"));
    }
    public void testApp2()
    {
    	
        assertTrue(new Palindrome().isPalindrome("r ad.ar"));
      
    }
    
    public void testApp3()
    {
    assertFalse(new Palindrome().isPalindrome("12r"));
    }
    
    public void testApp4()
    {
    	assertTrue(new Palindrome().isPalindrome(" "));
    }
}
