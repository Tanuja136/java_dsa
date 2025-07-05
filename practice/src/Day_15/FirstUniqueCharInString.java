package Day_15;

import java.util.*;

public class FirstUniqueCharInString {
	
	private static int findFirst(String word) {
		Map<Character , Integer> dict = new HashMap<>();
		
		for(int i = 0; i < word.length(); i++) {
//			int count = dict.computeIfAbsent(word.charAt(i), e -> 0)+1;
//			dict.put(word.charAt(i), count);
			//map.put(c, map.getOrDefault(c, 0) + 1);

			dict.put((char) i, dict.getOrDefault(word.charAt(i), 0)+1);
		}
		for(int i = 0; i < word.length(); i++) {
			if(dict.get(word.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		System.out.println(findFirst(word));
		scanner.close();
	}

}
