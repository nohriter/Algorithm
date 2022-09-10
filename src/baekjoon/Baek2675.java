package baekjoon;

import java.util.Scanner;

public class Baek2675 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String[] arr = sc.nextLine().split(" ");
            int R = Integer.parseInt(arr[0]);
            String s = arr[1];
            String answer = "";
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < R; k++) {
                    answer += Character.toString(s.charAt(j));
                }
            }
            System.out.println(answer);
        }
    }
}
