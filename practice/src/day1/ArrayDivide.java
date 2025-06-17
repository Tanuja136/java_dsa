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
		System.out.println( arr[x-n-1] - arr[y-n-1]);
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enetr number of elements : ");
		n = scanner.nextInt();
		System.out.println("eneter x value : ");
		x = scanner.nextInt();
		System.out.println("eneter y value : ");
		y = scanner.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i <= n ; i++) {
			System.out.println("enter array elements : ");
			arr[i] = scanner.nextInt();
		}
		find_p_element();
		
		
	}

}
