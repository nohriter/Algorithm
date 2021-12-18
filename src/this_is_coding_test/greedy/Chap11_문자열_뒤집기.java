package this_is_coding_test.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap11_문자열_뒤집기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("");
        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int zeroCount = 0;
        int oneCount = 0;
        int check = 2;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0 && check != 0) {
                zeroCount++;
                check = 0;
            }

            if (numbers[i] == 1 && check != 1) {
                oneCount++;
                check = 1;
            }
        }

        if (zeroCount > oneCount) {
            System.out.println(oneCount);
        } else if (zeroCount < oneCount) {
            System.out.println(zeroCount);
        } else if (zeroCount == oneCount) {
            System.out.println(zeroCount);
        }
    }

}
