package practice.string;

import java.util.HashMap;
import java.util.Scanner;

public class String11 {

    public static void solution(String input) {
        char[] chars = input.toCharArray();

        HashMap<Character, Integer> count = new HashMap<>();
        String answer;
        //KKHSSSSSSSE
        count.put(chars[0], 1); // 넣고 값 + 1
        StringBuilder answerBuilder = new StringBuilder();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count.put(chars[i], count.get(chars[i]) + 1); // 넣고 값 + 1
            } else {
                if (count.get(chars[i - 1]) == 1) {
                    answerBuilder.append(chars[i - 1]);
                } else {
                    answerBuilder.append(chars[i - 1]).append(count.get(chars[i - 1]));
                }
                count.put(chars[i], 1);
            }
        }
        answer = answerBuilder.toString();
        if (count.get(chars[chars.length - 1]) == 1) {
            answer += chars[chars.length - 1];
        } else answer += chars[chars.length - 1] + "" + count.get(chars[chars.length - 1]);

        System.out.println(answer);
    }


    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String input = scanner.nextLine();
        solution(input);
    }

}
