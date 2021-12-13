package this_is_coding_test.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class chap03_큰_수의_법칙 {

    public static void main(String[] args) throws IOException {
        // M번 더하여 가장 큰 수를 만든다.
        // K번을 초과해서 더해질 수 없다.
        // 가장 큰 수를 알아야 한다.
        // 두번째로 큰 수를 알아야 한다. 내림차순으로 정렬을 해서 꺼낼까?

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputRules = br.readLine();
        String inputNumbers = br.readLine();

        String[] rules = inputRules.split(" ");     // 입력 받은 규칙을 배열로 저장
        String[] numbers = inputNumbers.split(" "); // 입력 받은 숫자를 배열로 저장

        Arrays.sort(numbers, Collections.reverseOrder());  // 큰 수를 찾기 위해 내림차순 정렬

        int m = Integer.parseInt(rules[1]);  // 두 번째 값이 더 해지는 횟수 m
        int k = Integer.parseInt(rules[2]);  // 세 번째 값이 연속 가능한 횟수 k

        int max = Integer.parseInt(numbers[0]);            // 가장 큰 숫자가 첫 번째
        int secondMax = Integer.parseInt(numbers[1]);      // 두 번째 큰 숫자가 두번 째
        int sum = 0; // 합을 구하기 위한 변수

        for (int i = 0; i < m; i++) {
            if(k > 0) {      // 연속 가능한 횟수가 0보다 클 때
                sum += max;  // 가장 큰 수를 더한다.
                k--;         // 연속 가능한 횟수를 차감.
                continue;    // 다음 반복으로 넘어간다.
            }

            sum += secondMax;  // 두 번째 큰 수를 더한다.
            k = Integer.parseInt(rules[2]); // 연속 가능한 횟수를 초기화 해준다.
        }
    }

}
