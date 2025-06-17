package day1;

import java.util.Scanner;

public class HollowSquare {
	private static int numberoflines;
	
	public static void findthepattern() {
		if(numberoflines % 2 != 0) {
		for(int i = 1 ; i<= numberoflines ; i++) {
			for(int j=1 ; j <= numberoflines ; j++) {
				if( i == (numberoflines / 2 + 1) && i == j) {
					System.out.print("@ ");
				}
				else if(i == j || i == 1 || i == numberoflines || j == (numberoflines - i +1) || j == numberoflines || j == 1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		}
		else {
			System.out.println("Enter odd number");
		}
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines:");
		numberoflines = scanner.nextInt();	
		findthepattern();
		}

}
