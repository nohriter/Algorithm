package this_is_coding_test.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap11_곱하기_혹은_더하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strNumbers = br.readLine().split("");
        int[] numbers = new int[strNumbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (sum != 0 && numbers[i] > 1) {
                sum *= numbers[i];
            } else {
                sum += numbers[i];
            }
        }

        System.out.println(sum);
    }

}
