package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dfsPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of nodes
        int m = sc.nextInt(); // Number of edges

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u); // Undirected
        }

        int start = sc.nextInt();
        int end = sc.nextInt();

        boolean[] visited = new boolean[n];
        List<Integer> path = new ArrayList<>();

        boolean found = dfsWithPath(adj, visited, start, end, path);

        if (found) {
            System.out.println("Yes");
            System.out.print("Path: ");
            for (int node : path) {
                System.out.print(node + " ");
            }
        } else {
            System.out.println("No");
        }
    }

    private static boolean dfsWithPath(List<List<Integer>> adj, boolean[] visited, int curr, int target, List<Integer> path) {
        visited[curr] = true;
        path.add(curr);

        if (curr == target) return true;

        for (int neighbor : adj.get(curr)) {
            if (!visited[neighbor]) {
                if (dfsWithPath(adj, visited, neighbor, target, path)) {
                    return true;
                }
            }
        }

        // Backtrack if path not found
        path.remove(path.size() - 1);
        return false;
    }
}
