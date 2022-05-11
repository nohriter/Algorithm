package practice.string;

import java.util.Scanner;

public class String2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        System.out.println(solution(input));
    }

    public static String solution(String input) {
        final char[] chars = input.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (char s : chars) {
            if(Character.isUpperCase(s)) {
                sb.append(Character.toLowerCase(s));
            }else {
                sb.append(Character.toUpperCase(s));
            }
        }

        return sb.toString();
    }

}
