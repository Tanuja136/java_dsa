package Day_15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTwoSum {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int target = scanner.nextInt();
		
		Map<Integer, Integer> pairs = new HashMap<>();
		
		for(int i  = 0; i < n; i++) {
			int diff = target - arr[i];
			if(pairs.containsKey(diff)) {    //if difference is present in the pairs
				System.out.println(i + " " + pairs.get(diff));
				break;
			}
			pairs.put(arr[i], i); // arr[i] is key , i is value
		}
		
//		System.out.println(pairs); // to print pairs
		
		
		
		
	}
}