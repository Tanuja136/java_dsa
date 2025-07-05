package Day_16;

import java.util.*;

public class FibonacciTabulationDP {
	
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	int n = scanner.nextInt();
        System.out.println(fib(n));
        
        scanner.close();
    }
}












//import java.util.Scanner;
//
//public class FibonacciSeries {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number of terms: ");
//        int n = scanner.nextInt();
//
//        int first = 0, second = 1;
//
//        System.out.print("Fibonacci Series: ");
//        for (int i = 1; i <= n; i++) {
//            System.out.print(first + " ");
//
//            // Calculate the next term
//            int next = first + second;
//            first = second;
//            second = next;
//        }
//    }
//}
