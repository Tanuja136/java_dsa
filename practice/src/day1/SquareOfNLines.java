package day1;

import java.util.Scanner;

public class SquareOfNLines {
	private static int numberoflines;
	
	public static void findSquareofNLines() {
		for ( int i=1 ; i <= numberoflines ; i++) {
			for(int j=1 ; j <= numberoflines ; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of lines to form square : ");
		numberoflines = scanner.nextInt();
		findSquareofNLines();
		
	}

}
