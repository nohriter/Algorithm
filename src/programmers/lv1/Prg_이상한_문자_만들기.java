package programmers.lv1;

import java.util.Locale;

public class Prg_이상한_문자_만들기 {

    public static void main(String[] args) {
        solution("hello ");
    }

    public static String solution(String s) {
        String[] split = s.split(" ", -1);

        String answer = "";

        for (int i = 0; i < split.length; i++) {
            String tempAnswer = "";
            for (int j = 0; j < split[i].length(); j++) {

                String[] tempArray = split[i].split("");

                if(j % 2 == 0) {
                    tempAnswer += tempArray[j].toUpperCase();
                }else {
                    tempAnswer += tempArray[j].toLowerCase();
                }
            }
            answer += tempAnswer;


            if(!(i==split.length-1))
                answer+=" ";
        }

        return answer;
    }

}
