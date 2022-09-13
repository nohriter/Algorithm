package baekjoon;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Baek1157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase(Locale.ROOT);

        // 알파벳 개수
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 97]++;
        }

        int max = 0;
        boolean same = false;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
                same = false;
            } else if (max == arr[i]) {
                same = true;
            }
        }

        if (same) {
            System.out.println("?");
        } else System.out.println((char)(index + 65));

    }

}
