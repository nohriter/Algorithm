package practice.array;

import java.util.*;

class Array7 {
    public static void solution(int[] arr) {
        int answer = 0;
        int flag = 1;

        for (int i : arr) {
            if (i == 1) {
                answer += flag;
                flag++;
            } else {
                flag = 1;
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[] answers = new int[number];
        for (int i = 0; i < number; i++) {
            answers[i] = scanner.nextInt();
        }
        solution(answers);
    }
}
