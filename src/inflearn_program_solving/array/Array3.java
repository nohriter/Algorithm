package inflearn_program_solving.array;

import java.util.Scanner;

public class Array3 {

    public static void solution(int n, String[] inputA, String[] inputB) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String a = inputA[i];
            String b = inputB[i];

            if (a.equals("1")) {
                if (b.equals("1")) sb.append("D\n");
                if (b.equals("2")) sb.append("B\n");
                if (b.equals("3")) sb.append("A\n");
            } else if (a.equals("2")) {
                if (b.equals("1")) sb.append("A\n");
                if (b.equals("2")) sb.append("D\n");
                if (b.equals("3")) sb.append("B\n");
            } else if (a.equals("3")) {
                if (b.equals("1")) sb.append("B\n");
                if (b.equals("2")) sb.append("A\n");
                if (b.equals("3")) sb.append("D\n");
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = Integer.parseInt(scanner.nextLine());
        final String[] a = scanner.nextLine().split(" ");
        final String[] b = scanner.nextLine().split(" ");

        solution(n, a, b);
    }

}
