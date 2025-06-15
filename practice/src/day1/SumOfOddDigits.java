package day1;

import java.util.Scanner;

/*
 Sum of odd digits of a number 
 2345
 o/p : - 8 {3+5}
 */

public class SumOfOddDigits {
	private static int inputNumber; //static is used beacuse we need the input of one copy
	private static int SumOfOdd ;
	
	public static void findSumOfOddDigits() {
		int tempNumber = inputNumber ; 
		while(tempNumber > 0) {
			int RemainderDigit = tempNumber % 10;
			tempNumber = tempNumber / 10;
			if( RemainderDigit % 2 == 1 ) {
				SumOfOdd += RemainderDigit;
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number to Calculate Sum of Odd digits : ");
		inputNumber = scanner.nextInt();
		findSumOfOddDigits();
		System.out.println("The Sum of Odd digits of " + inputNumber + " is " + SumOfOdd);
		
	}

}
