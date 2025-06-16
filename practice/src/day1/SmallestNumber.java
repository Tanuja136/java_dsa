package day1;

import java.util.Scanner;

public class SmallestNumber {
	private static int inputNumber; //static is used because we need the input of one copy
	private static int SmallNumber ;
	
	public static void findSmallNumber() {
		int tempNumber = inputNumber ; 
		SmallNumber = 9;
		while(tempNumber > 0) {
			int RemainderDigit = tempNumber % 10;
			tempNumber = tempNumber / 10;
			if( RemainderDigit < SmallNumber ) {
				SmallNumber = RemainderDigit;
				}
			}	
		}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number to Calculate Smallest Number : ");
		inputNumber = scanner.nextInt();
		findSmallNumber();
		System.out.println("The Smallest Number of " + inputNumber + " is " + SmallNumber);
		
	}

}

