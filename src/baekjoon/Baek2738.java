package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baek2738 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        int[][] answer = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                answer[i][j] = A[i][j] + B[i][j];
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }


    }
}
