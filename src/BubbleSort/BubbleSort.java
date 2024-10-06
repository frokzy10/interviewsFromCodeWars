package BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{64, 42, 73, 41, 31, 54, 16, 24, 57, 42, 74, 55, 36};

        bubbleSort(arr);
        printArray(arr);
    }

    private static void bubbleSort(int[] arr) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]");
    }
}
