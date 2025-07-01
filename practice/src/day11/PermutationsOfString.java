package day11;
import java.util.*;

public class PermutationsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<String> result = new ArrayList<>();
        boolean[] used = new boolean[s.length()];
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        backtrack(chars, new StringBuilder(), used, result);
        for (String perm : result) {
            System.out.println(perm);
        }
    }

    private static void backtrack(char[] chars, StringBuilder path, boolean[] used, List<String> result) {
        if (path.length() == chars.length) {
            result.add(path.toString());
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (used[i]) continue;
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) continue;
            used[i] = true;
            path.append(chars[i]);
            backtrack(chars, path, used, result);
            path.deleteCharAt(path.length() - 1);
            used[i] = false;
        }
    }
}