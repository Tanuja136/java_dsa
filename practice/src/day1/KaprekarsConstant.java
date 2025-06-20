package day1;

import java.util.Arrays;
import java.util.Scanner;

public class KaprekarsConstant {
	private static int inputNumber;
	private static int arr[];
	
	public static void findNtoArray() {
	    int size = 4;  // Kaprekar only works for 4-digit numbers
	    arr = new int[size];
	    int temp = inputNumber;
	    int index = size - 1;

	    while (temp > 0 && index >= 0) {
	        arr[index] = temp % 10;
	        temp = temp / 10;
	        index--;
	    }

	    // Optional: Print array to check
	    System.out.print("Digits array: ");
	    for (int digit : arr) {
	        System.out.print(digit + " ");
	    }
	    System.out.println();
	}


	private static int findDescendingOrder() {
		Arrays.sort(digit);
		return 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check Kaprekars constant : ");
		inputNumber = scanner.nextInt();
		
		findNtoArray();
		findDescendingOrder();
	}


}
