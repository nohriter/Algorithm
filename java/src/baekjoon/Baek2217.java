package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek2217 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputRope = br.readLine();
        int rope = Integer.parseInt(inputRope);

        int[] ropes = new int[rope];

        for (int i = 0; i < rope; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ropes);

        int max = 0;

        for (int i = ropes.length - 1; i >= 0; i--) {
            // 최대중량 = 로프의 중량 * 로프의 수
            ropes[i] = ropes[i] * (rope - i);
            if (max < ropes[i]) {
                max = ropes[i];
            }
        }

        System.out.println(max);
    }

}
