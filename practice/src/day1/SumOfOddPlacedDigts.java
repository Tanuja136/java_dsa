package day1;

import java.util.Scanner;

public class SumOfOddPlacedDigts {
	private static int inputNumber; //static is used because we need the input of one copy
	private static int OddPlacedDigitsSum ;
	
	public static void findOddPlacedDigitsSum() {
		int tempNumber = inputNumber ; 
		int count = (int) Math.log10(tempNumber)+1;
		while(tempNumber > 0) {
			int RemainderDigit = tempNumber % 10;
			tempNumber = tempNumber / 10;
			if( count  % 2 != 0 ) {
					OddPlacedDigitsSum += RemainderDigit;
			}	
			count--;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number to Calculate Sum of Odd Placed digits : ");
		inputNumber = scanner.nextInt();
		findOddPlacedDigitsSum();
		System.out.println("The Sum of Odd Placed digits " + inputNumber + " is " + OddPlacedDigitsSum);
		
	}

}

