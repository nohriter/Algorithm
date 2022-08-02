package algorithm_codingtest.basic.data_structure.chapter1_arrayAndList.resolve;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class REP1546 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Integer[] scores = new Integer[N];

        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
            sum += scores[i];
        }

        Integer max = Collections.max(Arrays.asList(scores));

        System.out.println((sum * 100) / max / (float)N);
    }

}
