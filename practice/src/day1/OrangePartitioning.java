package day1;

import java.util.Scanner;

public class OrangePartitioning {
	private static int numberOfOranges;
	private static int pivot;
	private static int arr[];
	private static int temp;
	private static int j;
	
	public static void findOrangePartitioning() {
		pivot = arr[numberOfOranges - 1];
		j = 0;
		
		for(int i=0; i < numberOfOranges-1 ; i++) {
			if(arr[i] < pivot ) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		temp = arr[j];
		arr[j] = arr[numberOfOranges - 1];
		arr[numberOfOranges - 1] = temp;;	
			
		System.out.print("after partitioning : ");	
		for(int k = 0 ; k < numberOfOranges ; k++) {
		System.out.print(arr[k] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of Oranges : ");
		numberOfOranges = scanner.nextInt();
		arr = new int[numberOfOranges];
		
		//read input
		System.out.println("Enter an " + numberOfOranges + " elements");
		for(int i = 0; i < numberOfOranges ; i++) {
			arr[i] = scanner.nextInt();
		}
		
		//print input
		System.out.print("Before partitioning : ");
		for(int i=0 ; i < numberOfOranges ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(); //for next line
		
		findOrangePartitioning();
	}

}
