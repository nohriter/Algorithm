package this_is_coding_test.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Chap06_두_배열의_원소_교체 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputRules = br.readLine().split(" ");

        int N = Integer.parseInt(inputRules[0]);
        int K = Integer.parseInt(inputRules[1]);

        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");

        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());

        for (int i = 0; i < K; i++) {
            if (Integer.parseInt(A[i]) < Integer.parseInt(B[i])) {
                String temp = A[i];
                A[i] = B[i];
                B[i] = temp;
            } else {
                break;
            }
        }

        long answer = 0;

        for (int i = 0; i < A.length; i++) {
            answer += Integer.parseInt(A[i]);
        }

        System.out.println(answer);
    }

}
