package Day_15;

import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.next();
		String secondLine = scanner.next();
		List<Integer> arr = new ArrayList<>(n);
		
		for(String numstr : secondLine.trim().split(" ")) {
			arr.add(Integer.parseInt(numstr));
		}
		
		int target = scanner.nextInt();
		
		Map<Integer , Integer> pairs = new HashMap<Integer , Integer>(n);
		for(int i = 0; i < arr.size() ; i++) {
			int difference = target - arr.get(i);
			if(pairs.containsKey(difference)) {
				System.out.println( pairs.get(difference) + " " + i);
				break;
			}
			pairs.put(arr.get(i), i);
		}
		System.out.println(pairs);
		
		scanner.close(); //Releasing the resource

	}

}
