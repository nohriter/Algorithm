package programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;

public class Prg_나누어_떨어지는_숫자배열 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int divisor = 2;

        solution(arr, divisor);
    }

    public static ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                temp.add(arr[i]);
            }
        }

        if (temp.isEmpty()) {
            temp.add(-1);
            return temp;
        }

        Collections.sort(temp);

        return temp;
    }
}
