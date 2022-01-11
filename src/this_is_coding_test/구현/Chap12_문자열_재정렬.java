package this_is_coding_test.구현;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Chap12_문자열_재정렬 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        ArrayList<String> strList = new ArrayList<>();
        int num = 0;

        String[] str = input.split("");

        for (int i = 0; i < str.length; i++) {
            if (isNumber(str[i])) {
                num += Integer.parseInt(str[i]);
            } else {
                strList.add(str[i]);
            }
        }

        Collections.sort(strList);
        String answer = "";

        for (int i = 0; i < strList.size(); i++) {
            answer += strList.get(i);
        }

        System.out.println(answer + num);
    }

    public static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

}
