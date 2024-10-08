package OdderThanTheRest;

//Create a method that takes an array/list as an input, and outputs the index at which the sole odd number is located.
//This method should work with arrays with negative numbers.
//If there are no odd numbers in the array, then the method should output -1.

public class OdderThanTheRest {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        System.out.println(oddOne(arr));
    }

    public static int oddOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                return i;
            }
        }
        return -1;
    }
}
