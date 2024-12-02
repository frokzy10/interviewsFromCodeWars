package ArmStrong;

public class ArmStrong {
    public static void main(String[] args) {
        System.out.println(armStrong(11));
    }
    public static int armStrong(int n) {
        String num = String.valueOf(n);
        int res = 0;
        int length = num.length();

        for (char c : num.toCharArray()) {
            int digit = Character.getNumericValue(c);
            res += Math.pow(digit, length);
        }
        return res;
    }
}