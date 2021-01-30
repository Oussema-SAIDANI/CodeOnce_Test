package CodeOnce.Exercice1;

import java.util.Arrays;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ListConcatenatorTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ListConcatenatorTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ListConcatenatorTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp1()
    {
    	List<String> l1  = Arrays.asList("oussema","saidani");
    	List<Integer> l2  = Arrays.asList(1,2);
    	List<String> result = new ListConcatenator().concat(l1, l2);
        assertEquals(result.size(),4);
    }
    public void testApp2()
    {
    	List<String> l1  = Arrays.asList("oussema","saidani");
    	List<Integer> l2  = Arrays.asList();
    	List<String> result = new ListConcatenator().concat(l1, l2);
        assertEquals(result.size(),2);
    }
    
}
