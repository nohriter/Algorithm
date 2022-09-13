package algorithm_codingtest.basic.data_structure.chapter2_sectionSum;

import java.util.Scanner;

public class P03_11659 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] s = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            s[i] = s[i - 1] + sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int j = sc.nextInt();
            int k = sc.nextInt();

            System.out.println(s[k] - s[j-1]);
        }

    }

}
