package day11;

import java.util.Scanner;

public class NumberOfIslands {
	static int m, n;
	static char[][] grid;
	static boolean[][] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		m = sc.nextInt(); //rows
		n = sc.nextInt(); //columns
		sc.nextLine();
		
		grid = new char[m][n];
		visited = new boolean[m][n];
		
		for (int i = 0; i < m; i++) {
			String line = sc.nextLine();
			grid[i] = line.toCharArray();
		}
		
		System.out.println("Number of Islands : " + numIslands());
	}
	
	static int numIslands() {
		int count = 0;
		for(int i = 0; i < m ; i++) {
			for(int j = 0; j < n ; j++) {
				if (grid[i][j] == '1' && !visited[i][j] ) {
					dfs(i , j);
					count++;
				}
			}
		}
		return count;
	}
	
	static void dfs(int i , int j) {
		if( i < 0 || j < 0 || i >= m || j >= n || grid[i][j]!= '1' || visited[i][j]) {
			return;
		}    //Base Condition
		
		visited[i][j] = true; // mark the visiting as true
		dfs(i+1 , j); //down
		dfs(i-1 , j); //top
		dfs(i , j+1); //right
		dfs(i , j-1); //Left
	}
	
}
