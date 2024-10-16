package checkThreeAndTwo;

import java.util.HashMap;
import java.util.Map;

public class checkThreeAndTwo {
    public static void main(String[] args) {
        char[] arr = {'a', 'a', 'a', 'b', 'b'};
        System.out.println(checkThreeAndTwo(arr));
    }

    public static boolean checkThreeAndTwo(char[] chars) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int three = 0;
        int two = 0;

        for (int count : map.values()) {
            if (count == 3){
                three++;
            } else if (count == 2) {
                two++;
            }
        }
        return three == 1 && two == 1;
    }
}
