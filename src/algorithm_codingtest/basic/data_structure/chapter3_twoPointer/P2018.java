package algorithm_codingtest.basic.data_structure.chapter3_twoPointer;

import java.util.Scanner;

public class P2018 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int lt = 1;
        int rt = 1;
        int sum = 1;
        int count = 1;
        int m = N / 2 + 2;
        while (rt != N) {

            if (sum == N) {
                count++;
                rt++;
                sum += rt;
            } else if (sum < N) {
                rt++;
                sum += rt;
            } else {
                sum -= lt;
                lt++;

            }


        }

        System.out.println(count);
    }
}
