package algorithm_codingtest.basic.data_structure.chapter2_sectionSum;

import java.util.Scanner;

public class P05_10986 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        // 합을 구하는 배열이므로 int를 넘어갈 수 있음 (long 안하면 에러)
        long[] S = new long[N];
        long[] C = new long[M];

        long answer = 0;

        S[0] = sc.nextInt();

        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int remainder = (int) (S[i] % M);
            if (remainder == 0) answer++;
            C[remainder]++;
        }

        for (int i = 0; i < M; i++) {
            if (C[i] > 1) {
                answer += C[i] * (C[i] - 1) / 2;
            }
        }

        System.out.println(answer);
    }

}

