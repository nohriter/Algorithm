package backjoon;

import java.util.Scanner;

public class Back10872 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        int sum = mul(n);
        System.out.println(sum);
    }

    private static int mul(int n) {
        if(n <= 1) {
            return 1;
        }

        return n * mul(n-1);
    }

}
