package SelfLearn;
import java.util.*;

public class freqCountHashMap {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for(int i = 0; i< n ; i++) {
	            arr[i] = sc.nextInt();
	        }
	        System.out.println("The array is : ");
	        for(int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	        
	        HashMap<Integer , Integer> map = new HashMap<>();
	        
	        for(int num : arr) {
	            map.put(num , map.getOrDefault(num , 0) + 1);
	        }
	        System.out.println("The frequency count is :");
	        //printing the frequencies
	        for(Map.Entry<Integer , Integer> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }
	    }
	}