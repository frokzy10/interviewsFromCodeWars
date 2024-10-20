package ReturnthefirstMmultiplesofN;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ReturnthefirstMmultiplesofN {
    public static void main(String[] args) {
        int m = 3;
        int n = 5;
        int[] result = multiples(m, n);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int[] multiples(int m, int n) {
        return IntStream.range(1,m+1)
                .map(i -> i * n)
                .toArray();
    }
}
