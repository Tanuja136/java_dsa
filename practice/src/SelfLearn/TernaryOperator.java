package SelfLearn;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		int number;
		String result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check even or odd : ");
		number = scanner.nextInt();
		result = (number % 2 == 0) ? "Even Number" : "Odd number";
		System.out.println(result);
		
	}

}
