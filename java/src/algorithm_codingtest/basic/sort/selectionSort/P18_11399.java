package algorithm_codingtest.basic.sort.selectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class P18_11399 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        // 1 =  1
        // 3 =  1 + 2
        // 6 =  1 + 2 + 3
        // 9 =  1 + 2 + 3 + 3
        // 13 = 1 + 2 + 3 + 3 + 4

        // 1 =  0 + 1
        // 4 =  1 + 1 + 2
        // 10 = 4 + 1 + 2 + 3
        // 19 = 10 + 1 + 2 + 3 + 3
        // 32 = 19 + 1 + 2 + 3 + 3 + 4

        // 32
        // 1 4 10 19 32
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
           answer += A[i];
           sum += answer;
        }


        System.out.println(sum);
    }

}
