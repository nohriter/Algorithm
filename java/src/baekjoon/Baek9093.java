package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Baek9093 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        ;
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ' ') {
                    while (!stack.empty()) sb.append(stack.pop());
                    sb.append(" ");
                } else stack.add(s.charAt(j));
            }
            while (!stack.empty()) sb.append(stack.pop());
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
