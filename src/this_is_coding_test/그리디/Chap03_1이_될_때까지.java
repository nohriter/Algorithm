package this_is_coding_test.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap03_1이_될_때까지 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputRules = br.readLine();  // n 과 k 입력
        String[] rules = inputRules.split(" ");
        int n = Integer.parseInt(rules[0]); // n
        int k = Integer.parseInt(rules[1]); // k
        int count = 0;  // 횟수

        while (n > 1) { // n이 1보다 클 때
            if(n % k == 0) { // n이 k로 나누어 떨어진다면
                n = n / k; // n을 k로 나누고
            } else {  // 나누어 떨어지지 않다면
                n--; // n에서 1을 빼라
            }
            count++; // 횟수 더하기 1
        }
        System.out.println(17/4);
    }

}
