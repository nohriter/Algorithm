package practice.array;

import java.util.Scanner;

public class Array2 {

    public static void solution(int n, String[] input) {
        int answer = 1;
        int max = Integer.parseInt(input[0]);
        for (int i = 1; i < n; i++) {
            if(Integer.parseInt(input[i]) > max) {
                answer++;
                max = Integer.parseInt(input[i]);
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = Integer.parseInt(scanner.nextLine());
        final String[] input = scanner.nextLine().split(" ");

        solution(n, input);
    }

}
