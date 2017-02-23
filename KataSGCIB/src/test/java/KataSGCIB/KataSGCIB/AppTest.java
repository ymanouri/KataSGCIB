package KataSGCIB.KataSGCIB;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

  
    /**
     *  test of conversion method
     */
    public void testRoman()
    {
        assertEquals( "I",App.roman(1));
        assertEquals( "IV",App.roman(4));
        assertEquals( "MCMLIV",App.roman(1954));
        assertEquals( "MCMXC",App.roman(1990));
    }
}
