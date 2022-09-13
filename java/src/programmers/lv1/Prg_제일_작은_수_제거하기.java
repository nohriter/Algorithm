package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class Prg_제일_작은_수_제거하기 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 7};

        solution(arr);
    }

    public static int[] solution(int[] arr) {
        List<Integer> ints = new ArrayList<>();

        for (int num : arr) {
            ints.add(num);
        }

        int min = ints.get(0);

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        for (int i = ints.size()-1; i >= 0; i--) {
            if(min == ints.get(i)) {
                ints.remove(i);
            }
        }

        int[] answer = new int[ints.size()];

        for (int i = 0; i < ints.size(); i++) {
            answer[i] = ints.get(i);
        }

        if(ints.size() == 0) {
            int[] answer2 = {-1};
            return answer2;
        }

        return answer;
    }
}
