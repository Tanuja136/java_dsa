package Day_15;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());

        Map<String, List<String>> map = new HashMap<>();  // key is sorted version and values is the gropu of anagrams comes under key

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();                

            char[] chars = word.toCharArray();           // Convert word to character array
            Arrays.sort(chars);                // 'a ' , 'e' , 't'

            String sorted = new String(chars);           // Convert back to string (key) "aet"

            map.putIfAbsent(sorted, new ArrayList<>());  // If key not present, create new list
            map.get(sorted).add(word);   
        }

        for (List<String> group : map.values()) {        // For every group in the map
            System.out.println(String.join(" ", group)); // Print all words in the group
        }
    }
}
