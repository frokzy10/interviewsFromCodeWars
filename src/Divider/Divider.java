package Divider;

import java.util.Arrays;
import java.util.Scanner;

//Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor.
//First argument is an array of numbers and the second is the divisor.
//Example(Input1, Input2 --> Output)
//[1, 2, 3, 4, 5, 6], 2 --> [2, 4, 6]

public class Divider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Напишите на сколько хотите разделить массив: ");
        int divider = sc.nextInt();
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(divisibleBy(arr, divider)));
    }
    public static int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int number : numbers) {
            if (number % divider == 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int number : numbers) {
            if (number % divider == 0) {
                result[index++] = number;
            }
        }

        return result;
    }
}
