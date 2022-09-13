package programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;

public class Prg_문자열_내_마음대로_정렬하기 {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};

        System.out.println(solution(strings, 1));
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }

        // 정렬
        Collections.sort(list);

        answer = new String[list.size()];

        for (int i = 0; i < strings.length; i++) {
            answer[i] = list.get(i).substring(1);
        }

        return answer;
    }
}
