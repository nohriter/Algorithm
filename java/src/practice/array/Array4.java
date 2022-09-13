package practice.array;

import java.util.Scanner;

public class Array4 {

    public static void solution(int input) {
        int[] answer = new int[input];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < input; i++) {
            answer[i] = answer[i-1] + answer[i -2];
        }

        StringBuilder sb = new StringBuilder();

        for (int i : answer) {
            sb.append(i + " ");
        }

        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int input = scanner.nextInt();
        solution(input);
    }
}
