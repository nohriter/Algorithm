package algorithm_codingtest.basic.data_structure.chapter2_sectionSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11660 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        long[][] origin = new long[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                origin[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        long[][] sum = new long[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sum[i][j] = sum[i][j - 1] + sum[i - 1][j] + origin[i][j] - sum[i - 1][j - 1];
            }
        }

        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());

            long result = sum[x2][y2] - sum[x1 - 1][y2] - sum[x2][y1 - 1] + sum[x1 - 1][y1 - 1];
            System.out.println(result);
        }
    }
}
