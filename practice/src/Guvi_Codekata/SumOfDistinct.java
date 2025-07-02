package Guvi_Codekata;

import java.util.*;

public class SumOfDistinct {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        int sum = 0;
        for(int i = 0 ; i < s.length()-1 ; i++ ) {
            int d1 = s.charAt(i) - '0';
            int d2 = s.charAt(i + 1) - '0';
            sum += Math.abs(d1 - d2);
        }
        System.out.println(sum);
    }
}