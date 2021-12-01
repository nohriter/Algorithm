package programmers.lv1;

import java.util.Arrays;
import java.util.Collections;

public class Prg_정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        solution(118372);
    }

    public static long solution(long n) {
        String s = n + "";
        String[] split = s.split("");
        Long[] ints = new Long[split.length];
        for (int i = 0; i < split.length; i++) {
            ints[i] = Long.parseLong(split[i]);
        }

        Arrays.sort(ints, Collections.reverseOrder());

        String temp = "";
        for (long a: ints) {
            temp += a;
        }

        return Long.parseLong(temp);
    }
}
