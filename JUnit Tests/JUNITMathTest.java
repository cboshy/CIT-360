

import org.junit.Test;

import static org.junit.Assert.*;



/**

 *

 * @author boshy

 */



// This is a simple math test of JUnit



public class JUNITMathTest {

    

    @Test

    public void mathTest() {

        JUNITMath test = new JUNITMath();

 

        int result = test.math(50, 2, 50, 2);

 				

 				// Below will not pass

 				

        assertEquals(1, result);

        

        // Below will pass

        

        assertTrue (50 <= result);

        

        // Below will not pass

        

        assertFalse(115 >= result);

        

        // Below will pass

        

        assertNotNull(result);

        

        // Bellow will not pass

        

        assertNull(result);

        

        // Below will pass

        

        assertSame(125,result);

        

        // Below will not pass

        

        assertNotSame(125,result);

 

    }

}