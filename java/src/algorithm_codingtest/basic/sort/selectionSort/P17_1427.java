package algorithm_codingtest.basic.sort.selectionSort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P17_1427 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String[] split = N.split("");
        Integer[] A = new Integer[N.length()];

        for (int i = 0; i < N.length(); i++) {
            A[i] = Integer.parseInt(split[i]);
        }

        Arrays.sort(A, Comparator.reverseOrder());

        StringBuilder st = new StringBuilder();
        for (int i = 0; i < N.length(); i++) {
            st.append(A[i]);
        }

        System.out.println(st);
    }

}
