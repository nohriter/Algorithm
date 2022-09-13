package inflearn_algorithm.chapter1_string;

import java.util.*;

public class Main9 {

    public int solution(String s) {
        String answer = "";
        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) answer += x;
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Main9 T = new Main9();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
