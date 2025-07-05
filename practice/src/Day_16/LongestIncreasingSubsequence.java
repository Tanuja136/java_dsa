package Day_16;

import java.util.*;

public class LongestIncreasingSubsequence {
	public static int n;

	public static int lengthOfLTS(int[] arr) {
		if(n == 0) return 0;
		int[] dp = new int[n];
		int maxLen = 1;
		for(int i = 0 ; i < n ; i++) {
			dp[i] = 1;
			for(int j = 0 ; j < i; j++) {
				if(arr[i] > arr[j] ) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			maxLen = Math.max(maxLen, dp[i]);
		}
		return maxLen;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n  = scanner.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(lengthOfLTS(arr));
		scanner.close(); 
	}

	

}
