package algorithm_codingtest.basic.data_structure.chapter1_arrayAndList.resolve;

import java.util.Scanner;

public class REP01_11720 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        char[] cNums = sc.next().toCharArray();

        int sum = 0;

        for (int i = 0; i < cNums.length; i++) {
            sum += Character.getNumericValue(cNums[i]);
        }

        System.out.println(sum);
    }

}
