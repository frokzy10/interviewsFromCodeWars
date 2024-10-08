package LatinSquare;

import java.util.Arrays;

//A latin square is an n × n array filled with the integers 1 to n, each occurring once in each row and column.
//Here are examples of latin squares of size 4 and 7:
//        [[1, 4, 3, 2],      [[2, 3, 1, 7, 4, 6, 5],
//        [4, 3, 2, 1],       [7, 1, 6, 5, 2, 4, 3],
//        [3, 2, 1, 4],       [6, 7, 5, 4, 1, 3, 2],
//        [2, 1, 4, 3]]       [4, 5, 3, 2, 6, 1, 7],
//        [5, 6, 4, 3, 7, 2, 1],
//        [1, 2, 7, 6, 3, 5, 4],
//        [3, 4, 2, 1, 5, 7, 6]]

public class LatinSquare {
    public static void main(String[] args) {
        int n = 4;
        int[][] latinSquare = makeLatinSquare(n);
        printSquare(latinSquare);
    }

    public static void printSquare(int[][] square) {
        for (int[] row : square) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] makeLatinSquare(int n) {
        final int[][] latinSquare = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                latinSquare[i][j] = (i + j) % n + 1;
            }
        }

        return latinSquare;
    }
}