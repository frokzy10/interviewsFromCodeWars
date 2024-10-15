package TwoSumArr;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSumArr {
    public static void main(String[] args) {
        List<Integer> num = List.of(1, 2, 5, 5, 0, 3, 14);
        System.out.println(sumList(num, 10));

    }

    public static boolean sumList(List<Integer> nums, int k) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == k) {
                    return true;
                }
            }
        }
        return false;
    }
}
