package VaporCode;

public class Vaporcode {
    public static void main(String[] args) {
        System.out.println(vaporcode("Lets go to the movies"));
    }
    public static String vaporcode(String s) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            res.append(s.charAt(i));

            if (i < s.length() - 1) {
                res.append(' ');
            }
        }

        return res.toString().trim().toUpperCase();
    }
}
