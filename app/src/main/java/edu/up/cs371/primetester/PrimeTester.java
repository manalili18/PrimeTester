package edu.up.cs371.primetester;

/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */

/**
 * Tells whether an integer is prime.
 *
 * @param n the number to test
 * @return true if n is prime
 */
public class PrimeTester
{
    public static boolean isPrime(long n)
    {
        if(n==1 || n==0) return false; //1 and 0 aren't prime

        long halfN = n/2;
        for(int testMod=2;testMod<=halfN;++testMod)
        {
            if(n%testMod==0) return false;
        }

        return true;
    }
}
