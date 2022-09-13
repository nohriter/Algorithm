package algorithm_codingtest.basic.data_structure.chapter3_twoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class P07_1940 {

    public static void main(String[] args) {
        // 시간제한 2초
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int answer = 0;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int lt = 0;
        int rt = arr.length - 1;

        while (rt > lt) {

            if (arr[lt] + arr[rt] == M) {
                answer++;
                rt--;
                lt++;
            }

            if (arr[lt] + arr[rt] > M) {
                rt--; // 값을 더작게 만듬
            }

            if (arr[lt] + arr[rt] < M) {
                lt++; // 값을 더크게 만듬
            }
        }

        System.out.println(answer);
    }

}
