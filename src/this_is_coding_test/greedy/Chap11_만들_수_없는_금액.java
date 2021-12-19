package this_is_coding_test.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Chap11_만들_수_없는_금액 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());
        String[] inputNumbers = br.readLine().split(" ");
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        Arrays.sort(numbers);

        int min = 1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > min) {
                break;
            }

            min += numbers[i];
        }

        System.out.println(min);
    }

}
