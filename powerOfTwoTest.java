import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;               //associated with JUnitTest

class powerOfTwoTest {

    @Test
    void powerOfTwoTestWork()                                       //Tests input that should work
    {
        powerOfTwo test = new powerOfTwo() ;                        //create Object
        assertEquals(true, test.isPowerOfTwo(2)) ;      //tests the first argument is the result of the second argument function
        assertEquals(true, test.isPowerOfTwo(4)) ;
        assertEquals(true, test.isPowerOfTwo(8)) ;
        assertEquals(true, test.isPowerOfTwo(16)) ;
        assertEquals(true, test.isPowerOfTwo(32)) ;

    }
    @Test
    void powerOfTwoTestFail()                                       //tests input that should fail
    {
        powerOfTwo test2 = new powerOfTwo() ;
        assertEquals(false, test2.isPowerOfTwo(3)) ;
        assertEquals(false, test2.isPowerOfTwo(5)) ;
        assertEquals(false, test2.isPowerOfTwo(7)) ;
        assertEquals(false, test2.isPowerOfTwo(9)) ;
        assertEquals(false, test2.isPowerOfTwo(13)) ;

    }
}
