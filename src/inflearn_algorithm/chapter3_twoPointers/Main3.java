package inflearn_algorithm.chapter3_twoPointers;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        scanner(n, k, a);
    }

    private static void scanner(int n, int k, int[] a) {
        int max = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += a[i];
        }

        max = sum;

        for (int i = k; i < n; i++) {
            sum += a[i] - a[i-k];
            if(max < sum) {
                max = sum;
            }
        }

        System.out.println(max);
    }

}
