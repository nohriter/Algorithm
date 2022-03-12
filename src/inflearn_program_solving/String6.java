package inflearn_program_solving;

import java.util.Scanner;

public class String6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        solution(input);
    }

    private static void solution(String input) {
        String[] split = input.split("");

        StringBuilder answer = new StringBuilder();

        for (String s : split) {
            if(!answer.toString().contains(s)) {
               answer.append(s);
            }
        }

        System.out.println(answer);
    }

}
