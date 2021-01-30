package CodeOnce.Exercice4;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class RepeatedCharFinderTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public RepeatedCharFinderTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( RepeatedCharFinderTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp1()
    {
       assertEquals(new RepeatedCharFinder().repeatedCharFinder("oussema"), "o");
    }
    
    public void testApp2()
    {
    	assertEquals(new RepeatedCharFinder().repeatedCharFinder("oouussema"), "e");
    }
    
    public void testApp3()
    {
    	assertEquals(new RepeatedCharFinder().repeatedCharFinder("oouusseemmaa"), "");
    }
}
