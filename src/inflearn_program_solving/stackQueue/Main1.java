package inflearn_program_solving.stackQueue;

import java.util.*;

public class Main1 {

    public static String solution(String input) {
        String answer="YES";
        Stack<Character> stack = new Stack<>();

        for (char aChar : input.toCharArray()) {
            if(aChar == '(') {
                stack.push(aChar);
            } else {
                stack.pop();
            }
        }

        if(!stack.isEmpty()) {
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        solution(input);
    }

}
