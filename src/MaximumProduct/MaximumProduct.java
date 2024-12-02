package MaximumProduct;

//Given an array of integers , Find the maximum product obtained from multiplying 2 adjacent numbers in the array.
//Note that the array size is at least 2 and consists a mixture of positive, negative integers and also zeroes.

public class MaximumProduct {
    public static void main(String[] args) {
        int[] arr = {9, 5, 10, 2, 24, -1, -48};
        System.out.println(adjacentElementsProduct(arr));
    }
    public static int adjacentElementsProduct(int[] array) {
        int max = array[0] * array[1];

        for (int i = 1; i < array.length - 1; i++) {
            int product = array[i] * array[i + 1];
            if (product > max) {
                max = product;
            }
        }

        return max;
    }
}
