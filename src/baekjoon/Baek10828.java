package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Baek10828 {

    static Stack<String> stack = new Stack<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();

            if (str.startsWith("push")) {
                stack.push(str.split(" ")[1]);
            } else if (str.equals("top")) {
                if (stack.isEmpty()) sb.append("-1\n");
                else sb.append(stack.peek()+"\n");
            } else if (str.equals("size")) {
                sb.append(stack.size()+ "\n");
            } else if (str.equals("empty")) {
                if (stack.isEmpty()) sb.append("1\n");
                else sb.append("0\n");
            } else if (str.equals("pop")) {
                if (stack.isEmpty()) sb.append("-1\n");
                else sb.append(stack.pop()+"\n");
            }
        }
        System.out.println(sb);
    }

}
