package DecimicalDigits;

import java.util.ArrayList;
import java.util.List;

public class DecimicalDigits {
    public static void main(String[] args) {
        System.out.println(Digits(12345));
    }
    public static int Digits(long n) {
        String digits = String.valueOf(n);

        return Integer.parseInt(String.valueOf(digits.length()));
    }
}
