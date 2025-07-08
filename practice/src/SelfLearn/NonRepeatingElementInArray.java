package SelfLearn;

import java.util.HashMap;
import java.util.*;

public class NonRepeatingElementInArray {

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
        
        for(int num : arr) {
        	if(map.get(num) == 1) {
            	System.out.print("The frst non repeating ele is : " + num);
            }
        }

    		System.out.println("no repeating ele");

		

	}

}
