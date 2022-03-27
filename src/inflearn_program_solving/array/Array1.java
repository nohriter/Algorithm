package inflearn_program_solving.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array1 {

    public static void solution(int n, String[] input) {

        List<String> answer = new ArrayList<>();

        answer.add(input[0]+" ");

        for (int i = 1; i < n; i++) {
            if (Integer.parseInt(input[i-1]) < (Integer.parseInt(input[i]))) {
                answer.add(input[i] + " ");
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : answer) {
            sb.append(s);
        }

        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = Integer.parseInt(scanner.nextLine());
        final String input = scanner.nextLine();
        solution(n, input.split(" "));
    }

}
