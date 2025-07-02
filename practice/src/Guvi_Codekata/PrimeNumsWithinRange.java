package Guvi_Codekata;

import java.util.*;

public class PrimeNumsWithinRange {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        
        for(int i = start ; i <= end ; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n) {
        if ( n <= 1) return false;
        if (n == 2) return true;
        
        for(int i = 2 ; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}