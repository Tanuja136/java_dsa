package Day_16;

import java.util.*;

public class StairCaseDP {
	private static int findStairCaseWays(int n) {
		if (n == 1) {
			return n;
		}
		int[] table = new int[n + 1]; // 1 based index we take here
		table[1] = 1;
		table[2] = 2;
		for(int i = 3 ; i <= n ; i ++) {
			table[i] = table[i-1] + table[i-2];
		}
		return table[n];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(findStairCaseWays(n));
		scanner.close();

	}

}
