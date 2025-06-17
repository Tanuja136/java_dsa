package day1;

import java.util.Scanner;

public class Xshape {

	private static int numberoflines;
	
	public static void findXshape() {
		if(numberoflines % 2 == 0 ) { // we cannot form a X shape with even numbers
			System.out.println("Enter an ODD number");
		}
		else {

		for (int i = 1 ; i <= numberoflines ; i++) {
			for (int j = 1 ; j <= numberoflines ; j++) {
					if( i == j || j == (numberoflines - i + 1)) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
			}
			System.out.println(" ");
		}
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of lines to form Square pattern :");
		numberoflines = scanner.nextInt();
		findXshape();

	}

}
