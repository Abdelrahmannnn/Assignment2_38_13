package ooooo;


public class GCD {

    int t,s ;

    public  long gcd(long a, long b) {
        if (a == 0) {

            return b;
        }


        long gcd = gcd(b % a, a);

        return gcd;
    }


    public void get(long a, long b)
    {
        long x = 0, y = 1 ;
        long temp;
        long lx=1,ly=0;

        while (b != 0)
        {
            long q = a / b;
            long r = a % b;

            a = b;
            b = r;

            temp = x;
            x = lx - q * x;
            lx = temp;

            temp = y;
            y = ly - q * y;
            ly = temp;
        }
        System.out.println("Bézout coefﬁcients of a and b are :");
        System.out.println("  s : "+ lx +" t :"+ ly);
    }




}






