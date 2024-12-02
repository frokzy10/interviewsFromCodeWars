package SimplestringreversalII;

public class SimplestringreversalII {
    public static void main(String[] args) {
        String s = "codewars";
        int a = 1;
        int b = 5;

        System.out.println(solve(s, a, b));
    }

    public static String solve(String s, int a, int b) {
        StringBuilder sb = new StringBuilder(s.substring(a, b + 1));
        sb.reverse();

        return s.substring(0, a) + sb.toString() + s.substring(b + 1);
    }
}