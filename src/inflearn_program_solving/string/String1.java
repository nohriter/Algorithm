package inflearn_program_solving.string;

import java.util.Locale;
import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next().toLowerCase(Locale.ROOT);
        char find = Character.toLowerCase(scanner.next().charAt(0));
        System.out.println(solution(word, find));
    }

    private static int solution(String input, char c) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

}
