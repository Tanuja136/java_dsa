package day1;

import java.util.Scanner;

public class RightAngleTriangle {
	private static int numberoflines;
	
	public static void findRightAngleTriangle() {
		for (int i = 1 ; i <= numberoflines ; i++) {
			for (int j = 1 ; j <= i ; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of lines to form Right angle triangle pattern :");
		numberoflines = scanner.nextInt();
		findRightAngleTriangle();

	}

}
