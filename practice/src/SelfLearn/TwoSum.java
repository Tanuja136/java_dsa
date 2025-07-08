package SelfLearn;
import java.util.*;
public class TwoSum {

	public static void main(String[] args) {
		int[] arr = {2 , 3, 4, 5 ,6 };
		int target = 9;
		
		HashMap <Integer , Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < arr.length; i++) {
			int comp = target - arr[i];
			
			if(map.containsKey(comp)) {
				System.out.println("Indices : "+ map.get(comp) + " and " + i);
			}
			
			map.put(arr[i], i);
		}
		
	}

}
