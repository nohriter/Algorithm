package this_is_coding_test.그리디;

import java.util.Arrays;

public class Chap11_무지의_먹방_라이브 {

    public static void main(String[] args) {
        int[] food_times = {2, 1, 3};
        int k = 5;
        System.out.println(solution(food_times, k));
        ;
    }

    public static int solution(int[] food_times, long k) {

        // k 번 반복한다.
        // k번 내에서 food 아이템 목록을 순회한다.

        long sum = Arrays.stream(food_times).sum();

        if (sum <= k) {
            return -1;
        }

        boolean flag = true;
        int index = 0;

        while (flag) {
            for (int i = 0; i < food_times.length; i++) {
                if (k > 0) {
                    if (food_times[i] > 0) {
                        food_times[i] -= 1;
                        k -= 1;
                    }
                } else {
                    index = i + 1;
                    flag = false;
                    break;
                }
            }
        }

        return index;
    }

}
