package algorithm_codingtest.basic.data_structure.chapter3_twoPointer.resolve;

import java.util.Scanner;

public class REP2018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        int lt = 0;
        int rt = 0;
        int count = 1;
        int sum = 1;

        while (rt != N - 1) {

            // 만약 sum > N lt를 한칸 오른쪽으로 하고 lt 만큼 값을 뺀다
            // 만약 sum < N rt를 한칸 오른쪽으로 하고 rt 만큼 값을 더한다.
            // 만약 sum == N count++하고 rt 값을 오른쪽으로하고 rt값을 더한다.

            if (sum < N) {
                rt++;
                sum += arr[rt];
            } else if (sum > N) {
                sum -= arr[lt];
                lt++;
            } else {
                count++;
                rt++;
                sum += arr[rt];
            }


        }

        System.out.println(count);
    }


}
