package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baek2750 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

}
