package baekjoon;

import java.util.Scanner;

public class Baek2577 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a * b * c;
        String str = String.valueOf(sum);

        int[] arr = new int[10];
        int zero = 0;

        for (int i = 0; i < str.length(); i++) {
            arr[Integer.parseInt(String.valueOf(str.charAt(i)))]++;
            if((str.charAt(i)) == '0') {
                zero++;
            }
        }

        System.out.println(zero);

        for (int i = 1; i <= 9; i++) {
            System.out.println(arr[i]);
        }

    }
}
