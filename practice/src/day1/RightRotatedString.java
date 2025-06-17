package day1;

import java.util.Scanner;

public class RightRotatedString {
	private static String OriginalString;
	private static String RotatedString;
	private static String temp;
	
	
	public static void findStringEqual() {
	    temp = RotatedString + RotatedString ;
		if(temp.contains(OriginalString)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter original string : ");
		OriginalString = scanner.next();
		System.out.println("Enter Rotated string : ");
		RotatedString = scanner.next();
		findStringEqual();
		
	}

}
