package programmers.lv1;

import java.util.Arrays;

public class Prg_핸드폰_번호_가리기 {
    public static void main(String[] args) {
        solution("01033334444");
    }

    public static String solution(String phone_number) {

        String[] split = phone_number.split("");

        String answer = "";
        for (int i = 0; i < phone_number.length()-4; i++) {
            split[i] = "*";
        }

        for (int i = 0; i < split.length; i++) {
            answer += split[i];
        }

//        for (int i = 0; i < phone_number.length() - 4; i++)
//            answer += "*";
//
//        answer += phone_number.substring(phone_number.length() - 4);


        return answer;
    }
}

// 배운 것 substring, 바꾸는것 외에도 새로 만들어서 반환하는 방식도 있다.
