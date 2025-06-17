package day1;

import java.util.Scanner;

public class SquarePattern {

		private static int numberoflines;
		
		public static void findSquarePattern() {
			for (int i = 1 ; i <= numberoflines ; i++) {
				for (int j = 1 ; j <= numberoflines ; j++) {
					if(i==1 || i == numberoflines || j == 1 || j == numberoflines) {
					System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.println(" ");
			}
			
		}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter number of lines to form Square pattern :");
			numberoflines = scanner.nextInt();
			findSquarePattern();

		}

	}
