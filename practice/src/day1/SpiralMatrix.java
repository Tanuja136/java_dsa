package day1;

import java.util.Scanner;

public class SpiralMatrix {
	private static int RowSize;
	private static int ColumnSize;
	private static int[][] matrix;

	private static void ReadMatrixElements() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Row size : ");
		RowSize = scanner.nextInt();
		System.out.print("Enter the Column size : ");
		ColumnSize = scanner.nextInt();
		matrix = new int[RowSize][ColumnSize];
		
		for(int i = 0; i < RowSize ; i++) {
			System.out.println("Enter the row elements : ");
			for(int j = 0; j < ColumnSize; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		System.out.print("The array is : ");
		for(int i = 0; i < RowSize ; i++) {
			for(int j = 0; j < ColumnSize; j++) {
				System.out.print(matrix[i][j]);
			}
		}
		System.out.println(" ");
		
	}
	
	private static void PrintSpiralMatrix() {
		System.out.print("The Spiral Matrix is : ");
		for(int j = 0 ;j < ColumnSize ; j++) {
			System.out.print(matrix[0][j] + " ");
		}
		for(int i = 0; i < RowSize ; i++) {
			System.out.print(matrix[i][2] + " ");
		}
		for(int j = ColumnSize-1; j >= 0 ; j--) {
			System.out.print(matrix[2][j] + " ");
		}
		
		
	}
	
	public static void main(String[] args) {
		ReadMatrixElements();
		PrintSpiralMatrix();

	}

}
