package day1;

import java.util.Scanner;

public class SecondLargest {

	private static int inputNumber; //static is used because we need the input of one copy
	private static int SumOfEvenlyPlaced ;
	
	public static void findSumOfEvenlyPlacedDigits() {
		int tempNumber = inputNumber ; 
		int count = (int) Math.log10(tempNumber)+1;
		while(tempNumber > 0) {
			int RemainderDigit = tempNumber % 10;
			tempNumber = tempNumber / 10;
			if( count  % 2 == 0 ) {
				SumOfEvenlyPlaced += RemainderDigit;
			}	
			count--;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number to Calculate Sum of Evenly Placed digits : ");
		inputNumber = scanner.nextInt();
		findSumOfEvenlyPlacedDigits();
		System.out.println("The Sum of Evenly Placed digits " + inputNumber + " is " + SumOfEvenlyPlaced);
		
	}

}

