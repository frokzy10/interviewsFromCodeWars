package MinElem;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = new int[] {62,21,54,76,12,56,76,59,32};
        System.out.println(minArray(arr));
    }
    private static int minArray(int[] arr) {
        int minValue = arr[0];
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        System.out.println(minIndex);
        return minValue;
    }
}