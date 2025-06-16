package day1;

import java.util.Scanner;

public class SumOfFirstAndLastNumbers {
	private static int inputNumber;
	private static int FirstAndLastNumbersSum;
	private static int firstDigit;
	private static int LastDigit;

	public static void findFirstAndLastNumbersSum() {
		int tempNumber = inputNumber;

		// Get last digit
		LastDigit = tempNumber % 10;

		// Get first digit
		while (tempNumber >= 10) {
			tempNumber = tempNumber / 10;
		}
		firstDigit = tempNumber;

		// Sum of first and last digit
		FirstAndLastNumbersSum = firstDigit + LastDigit;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number to Calculate Sum of first and last digits: ");
		inputNumber = scanner.nextInt();
		findFirstAndLastNumbersSum();
		System.out.println("The Sum of first and last digits of " + inputNumber + " is " + FirstAndLastNumbersSum);
	}
}
