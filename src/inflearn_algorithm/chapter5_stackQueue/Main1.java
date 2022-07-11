package inflearn_algorithm.chapter5_stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Main1 {
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Main1 T = new Main1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
