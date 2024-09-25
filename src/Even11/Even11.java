package Even11;

import java.util.Scanner;

//Divisibility by 11
//(Time: 1 sec. Memory: 16 MB Difficulty: 22%)
//To divide numbers by 11, the difference between the sum of the digits in even positions and the sum of the digits in odd positions must be divided by 11.
//You need to write a program that checks the divisibility of a given number by 11.

public class Even11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(even(n));
    }

    private static boolean even(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        boolean even = true;

        while (n > 0) {
            int temp = n % 10;
            n /= 10;

            if (even) {
                sumEven += temp;
            } else {
                sumOdd += temp;
            }
            even = !even;
        }
        return (sumEven - sumOdd) % 11 == 0;
    }
}
