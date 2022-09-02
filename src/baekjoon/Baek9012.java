package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Baek9012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            Stack<Character> stack = new Stack<>();
            String str = sc.nextLine();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (c == '(') {
                    stack.push(c);
                } else if (stack.isEmpty()) {
                    stack.push(c);
                    break;
                } else stack.pop();
            }

            if (stack.isEmpty()) {
                System.out.println("YES");
            } else System.out.println("NO");
        }

    }

}
