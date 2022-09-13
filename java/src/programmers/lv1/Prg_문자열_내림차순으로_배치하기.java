package programmers.lv1;

import java.util.Arrays;

public class Prg_문자열_내림차순으로_배치하기 {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
        ;
    }

    public static String solution(String s) {
        String answer = "";

        char[] chars = s.toCharArray();

        Arrays.sort(chars);

        for (int i = chars.length - 1; i >= 0; i--) {
            answer += chars[i];
        }

        return answer;
    }
}
