package programmers.lv1;

import java.util.Arrays;

public class Prg_서울에서_김서방_찾기 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};

        System.out.println(seoul);
    }

    public static String solution(String[] seoul) {
        int count = 0;
        for (String a: seoul) {
            if(a.equals("Kim")) {
                break;
            }
            count++;
        }

        return "김서방은 "+count+"에 있다";
    }
}
