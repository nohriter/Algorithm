package algorithm_codingtest.basic.data_structure.chapter1_arrayAndList;

import java.util.Scanner;

public class P11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        String input = sc.nextLine();

        char[] chars = input.toCharArray();

        int sum = 0;

        for(int i = 0; i < chars.length; i++) {
            sum += chars[i] -48;
        }

        System.out.println(sum);

    }

}
