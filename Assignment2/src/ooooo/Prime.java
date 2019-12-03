package ooooo;

import java.util.Vector;

public class Prime {
    public static Vector<Integer> primeNumbersBruteForce(int n) {
        Vector<Integer> primeNumbers = new Vector<>();
        for (int i = 2; i <= n; i++) {
            if (isPrimeBruteForce(i)) {
                primeNumbers.add( i);
            }
        }
        return primeNumbers;
    }
    public static boolean isPrimeBruteForce(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
