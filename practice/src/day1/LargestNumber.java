package day1;

import java.util.Scanner;

public class LargestNumber {
	private static int inputNumber; //static is used because we need the input of one copy
	private static int LargeNumber ;
	
	public static void findLargeNumber() {
		int tempNumber = inputNumber ; 
		LargeNumber = -1;
		while(tempNumber > 0) {
			int RemainderDigit = tempNumber % 10;
			tempNumber = tempNumber / 10;
			if( RemainderDigit > LargeNumber ) {
				LargeNumber = RemainderDigit;
				}
			}	
		}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number to Calculate Largest Number : ");
		inputNumber = scanner.nextInt();
		findLargeNumber();
		System.out.println("The Largest Number of " + inputNumber + " is " + LargeNumber);
		
	}

}

