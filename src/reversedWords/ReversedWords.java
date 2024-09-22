package reversedWords;


public class ReversedWords{

    public static void main(String[] args) {
        System.out.println(reverseWords("Hello world from Java"));
    }

    public static String reverseWords(String str){
        String[] words = str.split(" ");

        int left = 0;
        int right = words.length - 1;

        while(left < right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }
        return String.join(" ", words);
    }
}