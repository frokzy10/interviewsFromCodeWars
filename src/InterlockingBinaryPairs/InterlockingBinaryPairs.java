package InterlockingBinaryPairs;

//Task
//Write a function that checks if two non-negative integers make an "interlocking binary pair".

//Examples
//   a = 9, b = 4
//Stacking representations shows how they can interlock.
// 9    1001
// 4     100
//Here, no 1's share any position, so the function returns true.

public class InterlockingBinaryPairs {

    public static void main(String[] args) {
        System.out.println(interlockable(9,4)); // must output "true"
        System.out.println(interlockable(7,1)); // output "false"
    }

    public static boolean interlockable(long a, long b) {
        return (a & b) == 0;
    }
}
