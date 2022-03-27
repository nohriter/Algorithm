package inflearn_program_solving.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class String12 {

    // input
    // 4
    //#****###**#####**#####**##**
    public static void solution(int N, String input) {
        int start = 0;
        int end = 7;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            final String substring = input.substring(start, end);
            final String twoNumber = parseTwo(substring);
            start += 7;
            end += 7;
            sb.append((char) parseString(twoNumber).intValue());
        }

        System.out.println(sb);
    }

    private static Integer parseString(String twoNumber) {
        return Integer.valueOf(twoNumber, 2);
    }

    private static String parseTwo(String secret) {
        final String[] split = secret.split("");

        StringBuilder two = new StringBuilder();

        for (String s : split) {
            if(s.equals("#")) {
                two.append("1");
            }else{
                two.append("0");
            }

        }

        return two.toString();
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String N = scanner.nextLine();
        final String input = scanner.nextLine();
        solution(Integer.parseInt(N), input);
    }
}
