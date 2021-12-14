package this_is_coding_test.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chap03_숫자_카드_게임 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputSize = br.readLine();   // 첫번째 행과 열의 개수 입력

        String[] sizes = inputSize.split(" "); // 공백을 기준으로 나누고

        int n = Integer.parseInt(sizes[0]);  // 행의 수를 저장한다.
        int m = Integer.parseInt(sizes[1]);  // 열의 수를 저장한다.

        String[][] areas = new String[n][m]; // 2차원 배열을 행의 수만큼 만들어주고

        for (int i = 0; i < n; i++) {  // 행의 수만큼 반복하면서
            areas[i] = br.readLine().split(" "); // 한줄씩 생성한 2차원 배열에 넣는다.
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            int min = Integer.parseInt(areas[i][0]); // 최솟값을 배열의 첫번째 값으로 미리 정해준다.

            for (int j = 0; j < m; j++) { // 열의 수만큼 반복하면서
                if (Integer.parseInt(areas[i][j]) < min) { // 값이 최솟값보다 작다면
                    min = Integer.parseInt(areas[i][j]); // 값을 최솟값으로 정해준다.
                }
            }

            if (min > max) { // 최솟값이 최댓값 보다 크다면
                max = min; // 최댓값을 변경한다.
            }
        }
        System.out.println(max);
    }

}
