package day11;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

class RadixSort {

    public void radixSort(List<Integer> arr, int N, int place) {
        Map<Integer, List<Integer>> dict = new TreeMap<>();

        for (int e : arr) {
            int digit = (e / place) % 10;
            dict.putIfAbsent(digit, new ArrayList<>());
            dict.get(digit).add(e);
        }

        int i = 0;
        for (List<Integer> groupArr : dict.values()) {
            for (int e : groupArr) {
                arr.set(i++, e);
            }
        }
    }

    public void sort(List<Integer> arr, int N) {
        int max = arr.stream().max(Integer::compare).orElse(0);
        for (int place = 1; max / place > 0; place *= 10) {
            radixSort(arr, N, place);
        }
    }
}

public class RadixSortMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int N = scanner.nextInt();
        scanner.nextLine();  // Consume leftover newline

        System.out.print("Enter elements separated by space: ");
        String secondLine = scanner.nextLine();
        List<Integer> arr = new ArrayList<>();

        for (String e : secondLine.trim().split(" ")) {
            arr.add(Integer.parseInt(e));
        }

        RadixSort sorting = new RadixSort();
        sorting.sort(arr, arr.size());

        System.out.println("Sorted array using Radix Sort :");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
