package Guvi_Codekata;

import java.util.Scanner;

public class StringManipulation {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String fullName = sc.nextLine().trim();  // Read full name and trim extra spaces

	        String[] parts = fullName.split("\\s+"); // Split on one or more spaces

	        if (parts.length == 2) {
	            // Format: First Last
	            String first = parts[0];
	            String last = parts[1];
	            System.out.println(last + ", " + first);
	        } else if (parts.length == 3) {
	            // Format: First Middle Last
	            String first = parts[0];
	            String middle = parts[1];
	            String last = parts[2];
	            System.out.println(last + ", " + first + " " + middle);
	        } else {
	            // Invalid input format
	            System.out.println("Invalid input. Please enter in 'First Last' or 'First Middle Last' format.");
	        }
	    }
	}
