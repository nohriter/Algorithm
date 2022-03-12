package inflearn_program_solving;

import java.util.Scanner;

public class String6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        solution(input);
    }

    private static String solution(String input) {
        String[] split = input.split("");

        String answer = "";

        for (String s : split) {
            if(!answer.contains(s)) {
               answer += s;
            }
        }

        System.out.println(answer);

        return answer;
    }

}
