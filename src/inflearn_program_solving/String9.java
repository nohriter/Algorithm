package inflearn_program_solving;

import java.util.Scanner;

public class String9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        solution(input);
    }

    public static void solution(String input) {
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if(isNumber(c)) {

            }
        }
    }

    private static boolean isNumber(char c) {

    }

}
