package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baek11399 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = 0;

        int n = sc.nextInt();

        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j <= i; j++) {
                answer += list[j];
            }
        }

        System.out.println(answer);
    }

}
