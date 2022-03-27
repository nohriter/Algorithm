package inflearn_program_solving.string;

import java.util.*;

public class String9 {

    public static void solution(String input) {
        final char[] chars = input.toCharArray();
        int answer = 0;
        for (char c : chars) {
            if(48 <=c && c <= 57) {
                answer = answer * 10 + (c - 48);
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        solution(input);
    }
}
