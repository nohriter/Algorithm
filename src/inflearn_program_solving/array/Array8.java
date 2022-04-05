package inflearn_program_solving.array;


import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

class Array8 {
    public static int[] solution(int number, int[] scores) {
        final int[] sorted = Arrays.stream(scores).sorted().toArray();
        int[] answer = new int[number];

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < sorted.length; j++) {

            }
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int number = Integer.parseInt(scanner.nextLine());
        int[] scores = new int[number];
        for (int i = 0; i < number; i++) {
            scores[i] = scanner.nextInt();
        }
        solution(number, scores);
    }
}
