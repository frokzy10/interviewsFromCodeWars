package replaceDots;

public class ReplaceDots {
    public static void main(String[] args) {
        System.out.println(replaceDots("one-two-three"));
    }

    public static String replaceDots(final String str) {
        String[] words = str.split(" ");
        StringBuilder res = new StringBuilder();

        for (String word : words) {
            String replaced = word.replaceAll("\\.", "-");
            res.append(replaced).append(" ");
        }
        return res.toString().trim();
    }
}
