package day11;
import java.util.*;

public class SudokuSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[9][9];
        for (int i = 0; i < 9; i++) {
            String[] line = sc.nextLine().trim().split("\\s+");
            for (int j = 0; j < 9; j++) {
                board[i][j] = line[j].charAt(0);
            }
        }
        solveSudoku(board);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j]);
                if (j < 8) System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static boolean solveSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, row, col, c)) {
                            board[row][col] = c;
                            if (solveSudoku(board)) return true;
                            board[row][col] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == c) return false;
            if (board[i][col] == c) return false;
            if (board[3*(row/3)+i/3][3*(col/3)+i%3] == c) return false;
        }
        return true;
    }
}
