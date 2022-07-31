package algorithm_codingtest.basic.data_structure.chapter3_twoPointer;

import java.util.Scanner;

public class P2018 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 초기화
        int[] numbers = new int[n];
        for (int i = 1; i <= numbers.length; i++) {
            numbers[i - 1] = i;
        }

        int sum = 1;
        int count = 1;
        int startIndex = 1;
        int endIndex = 1;

        while (endIndex != n) {

            if (numbers[startIndex] == numbers[endIndex]) {
                endIndex++;
                continue;
            }

            sum += numbers[endIndex];

            if (sum > n) {
                startIndex++;
                endIndex += startIndex;
                sum = 0;
                break;
            }

            if (sum == n) {
                count++;
                startIndex++;
                endIndex += startIndex;
                sum = 0;
                break;
            }

            endIndex++;
        }


        System.out.println(count);
    }
}
