/*#That RSA thing that guesses the D from E, M, Q, P
#This wont work in unix because of formatting reasons ??????
#Easier to just copy paste this into an external interpreter and run it.
#Hardcoded values are test values, but you can fandangle with it
#If your computer gets hot, dont blame me :) --M*/
import java.math.BigDecimal;
import java.math.BigInteger;

public class Guess
{
    public static void main(String[] args)
    {
       // int p = 11;
       // int q = 3;

        //int e = 13;
//        int n = p*q;
  //      int r = (p-1)*(q-1);

        //stick with prime numbers as RSA deals primarily in primes
        BigInteger p = BigInteger.valueOf( 199 );
        BigInteger q = BigInteger.valueOf( 151 );
        BigInteger e = BigInteger.valueOf( 181 );
        BigInteger M = BigInteger.valueOf( 89 );

        //p * q
        BigInteger n = p.multiply( q );
        // (p-1)(q-1)
        BigInteger r = (p.subtract( BigInteger.valueOf( 1 ) )).multiply( q.subtract( BigInteger.valueOf( 1 ) ) );
        // M to the power of e % n
        BigInteger C = M.modPow( e, n );
        //print pre-cipher and cipher value
        System.out.printf("Our p value: %d\nOur q value: %d\n" +
                "Our n value: %d\nOur r value: %d\n", p, q, n, r);

        System.out.printf("The %d raised to the power of %d and" +
                " modulo to %d is %d\n ", M, e, n, C);

        //for(int i = 0; i <= r; i++)
        for(BigInteger i = BigInteger.valueOf( 0 ); i.compareTo( r ) < 0; i = i.add( BigInteger.ONE))
        {
            // have to use BigInteger due to how huge numbers can get
            BigInteger a0 = C.modPow( i, n );
            // C to the power of i % n
            if(a0.equals( M ) )
            {
                // if a hit is found
                System.out.printf( "%d raised to the power of %d modulo by %d is %d\n", C, i, n, a0 );
                System.exit( 0 ); // dr. fries would throttle me for this lol
            }
            else
            {
                // continue attempts, listing what value is up next
                System.out.printf( "Trying %d...\n", i );
            }
        }
        System.out.println( "\nEnd of program." );
    }
}

