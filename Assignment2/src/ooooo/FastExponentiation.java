package ooooo;

public class FastExponentiation {


    //Naive 1

    public static int naive1(int a,int b,int m) {
        int c = 1;
        for( int i = 1;i<=b;i++) {
        c = c * a ;
    }
        c= c % m ;
        return c ;

    }


    // Naive 2

    public static int naive2(int a,int b,int m) {
        int c= 1 ;
        for( int i = 1;i<=b;i++) {
            c = (c * a) % m ;
        }
        return c ;

    }

    // iterative version

     public static int iterative(int a, int b, int c)
    {

        int res = 1;

     // Update a if it is more
        // than or equal to c
        a = a % c;

        while (b > 0)
        {
            // If b is odd, multiply a
            // with result

            if((b & 1)==1)
                res = (res * a) % c;

// y must be even then
            b = b >> 1;
            a = (a * a) % c;
        }
        return res;
    }


    //Recursive version

    int recursive(int a, int b, int c)
    {
         // Base cases
        if (a == 0)
            return 0;
        if (b == 0)
            return 1;


        // If B is even
        long y;
        if (b % 2 == 0) {
            y = recursive(a, b / 2, c);
            y = (y * y) % c;
        }
        // If b is odd
        else {
            y = a % c;
            y = (y * recursive(a, b - 1, c) % c) % c;
        }

        return (int)((y + c) % c);
    }









}