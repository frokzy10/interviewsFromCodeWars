public class Main {
    public static void main(String[] args) {
        Boolean[] arr = {true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};
        System.out.println(countSheeps(arr));
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int countSheep = 0;

        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i]) {
                countSheep++;
            }
        }
        return countSheep;
    }
}
