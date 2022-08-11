package algorithm_codingtest.basic.data_structure.chapter3_twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P09_12891 {
    static int[] goodArr = new int[4];
    static int[] checkArr = new int[4];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        char[] S = st.nextToken().toCharArray();
        int result = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            goodArr[i] = Integer.parseInt(st.nextToken());
        }

        int[] myArr = new int[P];

        for (int i = 0; i < P; i++) {
            myArr[i] = S[i];
        }

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == 'A') {
                checkArr[0]++;
            } else if (myArr[i] == 'C') {
                checkArr[1]++;
            } else if (myArr[i] == 'G') {
                checkArr[2]++;
            } else if (myArr[i] == 'T') {
                checkArr[3]++;
            }
        }

        if (isGood()) {
            result++;
        }

        for (int rt = P; rt < N; rt++) {
            add(S[rt]);
            minus(S[rt - P]);
            if (isGood()) {
                result++;
            }
        }

        System.out.println(result);
    }

    private static void minus(char x) {
        if (x == 'A') {
            checkArr[0]--;
        } else if (x == 'C') {
            checkArr[1]--;
        } else if (x == 'G') {
            checkArr[2]--;
        } else if (x == 'T') {
            checkArr[3]--;
        }
    }

    private static void add(char x) {
        if (x == 'A') {
            checkArr[0]++;
        } else if (x == 'C') {
            checkArr[1]++;
        } else if (x == 'G') {
            checkArr[2]++;
        } else if (x == 'T') {
            checkArr[3]++;
        }
    }

    private static boolean isGood() {
        for (int i = 0; i < checkArr.length; i++) {
            if (checkArr[i] < goodArr[i]) {
                return false;
            }
        }

        return true;
    }


}
