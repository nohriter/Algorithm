package practice.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Array8 {
    public static void solution(int number, Integer[] scores) {
        final Integer[] sorted = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sorted, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sorted.length; i++) {
            for (int j = 0; j < scores.length; j++) {
                if(sorted[i] == scores[j]) {
                    scores[j] = i + 1;
                }
            }
        }

        for (Integer score : scores) {
            sb.append(score + " ");
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int number = Integer.parseInt(scanner.nextLine());
        Integer[] scores = new Integer[number];
        for (int i = 0; i < number; i++) {
            scores[i] = scanner.nextInt();
        }
        solution(number, scores);
    }
}
