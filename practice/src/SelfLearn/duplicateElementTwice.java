package SelfLearn;

import java.util.HashMap;
import java.util.Scanner;

public class duplicateElementTwice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i< n; i++) {
			arr[i] = scanner.nextInt();
		}
		HashMap<Integer , Integer> map = new HashMap<>();
		
		for(int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		System.out.println("The freq count of array is : ");
		System.out.println(map);

		System.out.println("The Duplicate values which repeated twice are : ");
		for(int key : map.keySet()) {
			if(map.get(key) == 2) {
				System.out.println(key);
			}
		}

	}

}
