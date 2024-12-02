package IsUppercase;

//is the string uppercase?
//Task
//Create a method to see whether the string is ALL CAPS.

public class IsUppercase {
    public static void main(String[] args) {
        String str = "S";
        System.out.println(isUpperCase(str));
    }

    public static boolean isUpperCase(String s) {
        return s.toUpperCase().equals(s);
    }
}
