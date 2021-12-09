package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Prg_같은_숫자는_싫어 {

    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 3, 3};

        solution(arr);
    }

    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        int current = 10;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != current) {
                list.add(arr[i]);
                current = arr[i];
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
