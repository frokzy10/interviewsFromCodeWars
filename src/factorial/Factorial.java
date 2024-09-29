package factorial;


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = sc.nextInt();
        System.out.println(factorial(n,fact));
    }
    private static int factorial(int n,int k){
        int res = 1;
        while(n > 0){
            res *= n;
            n -= k;
        }
        return res;
    }
}
