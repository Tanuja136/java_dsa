package day1;

/*
Read N
PERFECT_ROOT = math.sqrt(N)
ROOT = math.floor(PERFECT_ROOT)
if ROOT * ROOT is N then
	Print: N is PS
else
	Print: N is not a PS
*/

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		int inputNumber = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number to Check whether number is Perfect Square : ");
		inputNumber = scanner.nextInt();
		int root = (int) Math.sqrt(inputNumber);
		if(root*root == inputNumber) {
			System.out.println(inputNumber + " is a Perfect Square");
		}
		else {
			System.out.println(inputNumber + " is not a Perfect Square");
		}
		scanner.close();
	}

}
