package CodeOnce.Exercice3;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class RepeatedCharCounterTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public RepeatedCharCounterTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( RepeatedCharCounterTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp1()
    {
       assertEquals(new RepeatedCharCounter().repeatedWord("oussema", "Oussema is coding now, good work oussema !"), 2);
    }
    
    public void testApp2()
    {
       assertEquals(new RepeatedCharCounter().repeatedWord("ousema", "Oussema is coding now, good work oussema !"), 0);
    }
}
