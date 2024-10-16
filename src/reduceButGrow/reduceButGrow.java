package reduceButGrow;

import java.util.Arrays;

public class reduceButGrow {
    public static void main(String[] args) {

    }
    public static int grow(int[] x){
        int res = Arrays.stream(x)
                .reduce(1, (a, b) -> a * b);
        return res;
    }
}