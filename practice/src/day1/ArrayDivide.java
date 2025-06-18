package day1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDivide {
	private static int n;
	private static int x;	
	private static int y;
	private static int[] arr;

	public static void find_p_element() {
	    Arrays.sort(arr);
	    System.out.print("Sorted array: ");
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }
	    System.out.println(); 
	    
		if(x >= 1 || y >= 1 || x+y == n || n <= 2000 || n>= 2) {
			System.out.print("The p elements between  " +arr[n-y] + " and " + arr[n-x] + " is : " );
			System.out.println(arr[n-y] - arr[n-x]);
		}
		
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of elements : ");
		n = scanner.nextInt();
		System.out.println("enter x value : ");
		x = scanner.nextInt();
		System.out.println("enter y value : ");
		y = scanner.nextInt();
	    arr = new int[n];

		System.out.println("enter array elements : ");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.print("Array is :");
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		find_p_element();
		
		
	}

}
