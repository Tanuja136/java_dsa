package day11;
import java.util.*;

public class GenPermutations {
    public ArrayList<String> findPermutation(String s) {
        Set<String> ans = new HashSet<>();
        genPer(s, "", ans); // Call helper function to generate permutations

        // Convert Set to List and sort it to get lexicographical order
        ArrayList<String> resList = new ArrayList<>(ans);
        Collections.sort(resList);
        return resList;
    }

    public void genPer(String s, String a, Set<String> result) {
        if (s.isEmpty()) {
            result.add(a); // Base case: permutation complete
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // Choose one character
            // Remove chosen character from s
            String nq = s.substring(0, i) + s.substring(i + 1);
            // Recursively generate permutations with remaining string
            genPer(nq, a + ch, result);
        }
    }
}
