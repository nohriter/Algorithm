package practice.string;

import java.util.Scanner;

public class String8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String input = sc.nextLine();
        solution(input);
    }

    public static void solution(String input) {
        final String correct = input.toUpperCase().replaceAll("[^A-Z]", "");
        final String reverse = new StringBuilder(correct).reverse().toString();

        if(correct.equals(reverse)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }

}
