package Day_15;
import java.util.*;

public class frequencies {

	public static void main(String[] args){
        int[] arr = {1,2,3,4,1,2,5,6,7,3,5,7};
        
        HashMap<Integer, Integer> ls = new HashMap<>();
        for(int i : arr){
            //ls.put(i,ls.getOrDefault(i,0)+1);
        	if(ls.containsKey(i)) {
        		ls.put(i , ls.get(i) + 1);
        	}
        	else { 
        		ls.put(i, 1);
        	}
        }
        System.out.println(ls);
    }

}

//import java.util.*;
//
//public class frequencies {
//    public static void main(String args[]) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        
//        for(int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        
//        HashMap<Integer , Integer> freq = new HashMap<>();
//        for(int i : arr) {
//            if(freq.containsKey(i)) {
//                freq.put(i , freq.get(i) + 1);
//            }
//            else {
//                freq.put(i ,1);
//            }
//        }
//        System.out.println(freq);
//    }
//}