package this_is_coding_test.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap04_왕실의_나이트 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputMap = br.readLine();

        String[] map = inputMap.split("");

        int column = map[0].charAt(0);
        int row = Integer.parseInt(map[1]);

        int answer = 8;

        if((row <= 2 || 7 <= row) && (column <= 98 || 103 <= column)) {
            answer -= 6;
        }
        if((2 < row || 7 < row) && (column <= 98 || 103 <= column)) {
            answer -= 4;
        }
        if((2 <= row || 7 <= row) && (column < 98 || 103 < column)) {
            answer -= 4;
        }

        System.out.println(answer);
    }

}
