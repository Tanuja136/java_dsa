package day1;

import java.util.Scanner;

public class SecondLargest {

	private static int inputNumber; //static is used because we need the input of one copy
	private static int SecondLargeNumber ;
	private static int FirstLargest ;
	
	public static void findSecondLargestNumber() {
		FirstLargest = -1;
		SecondLargeNumber = -1 ;
		int tempNumber = inputNumber;
		while(tempNumber > 0) {
			int RemainderNumber = tempNumber % 10;			
			if( RemainderNumber > FirstLargest) {
				SecondLargeNumber = FirstLargest;
				FirstLargest = RemainderNumber;
			}
			else if((RemainderNumber < FirstLargest) && (RemainderNumber > SecondLargeNumber)) {
				SecondLargeNumber = RemainderNumber;
			}
			tempNumber = tempNumber / 10;
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number to Calculate Second Largest Number : ");
		inputNumber = scanner.nextInt();
		findSecondLargestNumber();
		System.out.println("The Second Largest Number of " + inputNumber + " is " + SecondLargeNumber);
		
	}

}

