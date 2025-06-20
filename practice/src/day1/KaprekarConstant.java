package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KaprekarConstant {
	private static int number;
	private static int highestNum;
	private static int lowestNum;
	
	public static void findLowestHighestNum() {
		ArrayList<Integer> arraylist = new ArrayList<>();
		int tempNum = number;
		while(tempNum > 0) {
			int remainder = tempNum % 10;
			arraylist.add(remainder);
			tempNum /= 10;
		}
		Collections.sort(arraylist);
		StringBuilder lowestString = new StringBuilder();
		for(int num : arraylist) {
			lowestString.append(num);
		}
		
		lowestNum = Integer.parseInt(lowestString.toString());
		highestNum = Integer.parseInt(lowestString.reverse().toString());
		
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check Kaprekars constant count : ");
		number = scanner.nextInt();
		int i = 0;
		while(number != 6174) {
			findLowestHighestNum();
			number = highestNum - lowestNum;
			i++;
		}
		System.out.println(number);
		System.out.println("Number of count: " + i);
	}

}