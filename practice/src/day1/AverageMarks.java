package day1;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		int marks = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Marks to declare the Result :");
		marks =  scanner.nextInt();
		if(marks>=0 && marks <= 59) {
			System.out.println("Fail");
		}
		else if( (marks >= 60) && (marks <= 80)) {
			System.out.println("Second Class");
		}
		else if( (marks >= 81) && (marks <= 95)) {
			System.out.println("First Class");
		}
		else if( (marks >= 96) && (marks <= 100)){
			System.out.println("Outstanding");
		}
		else {
			System.out.println("Invalid");
		}
		scanner.close();
	}

}
