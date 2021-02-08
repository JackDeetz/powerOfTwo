
//package lab2;
import java.lang.Math;

public class powerOfTwo {

    static boolean isPowerOfTwo(int value)
    {

        if (value < 1)  //because 2^0 = 1, it is the lowest allowable exponent to be a power of 2, positive anyway
        {
            return false ;
        }

        //return value % 2 == 0 ;
        return (int) (Math.ceil((Math.log(value) / Math.log(2)))) == (int) (Math.floor(Math.log(value)/Math.log(2))) ;


    }

}
