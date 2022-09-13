package baekjoon;

import java.util.Scanner;

public class Baek3003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = {1, 1, 2, 2, 2, 8};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < A.length; i++) {
            sb.append(A[i] - sc.nextInt() + " ");
        }

        System.out.println(sb);
    }

}
