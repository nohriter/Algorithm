package algorithm_codingtest.basic.data_structure.chapter3_twoPointer;

import java.util.Scanner;

public class P1940 {

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

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] + arr[j] == M) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }

}
