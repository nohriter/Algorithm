package programmers.lv1;

import java.util.Arrays;

public class Prg_시저_암호 {
    public static void main(String[] args) {
        System.out.println(solution("a B z", 4));
        ;
    }

    public static String solution(String s, int n) {
        char[] chars = s.toCharArray();

        String answer = "";

        for (int i = 0; i < chars.length; i++) {
            if(64 < chars[i] && chars[i] < 91) {
                chars[i] = (char)((int)chars[i] + n);
                if(chars[i] >= 91) {
                    chars[i] -= 26;
                }
            }

            if(96 < chars[i] && chars[i] < 123) {
                chars[i] = (char)((int)chars[i] + n);
                if(chars[i] >= 123) {
                    chars[i] -= 26;
                }
            }

            answer += chars[i];
        }

        System.out.println(123 % 26);

        return answer;
    }
}
