package practice.string;

import java.util.Scanner;

public class String10 {

    public static void solution(String[] input) {
        char[] c = input[0].toCharArray();
        char find = input[1].charAt(0);

        int p = 1000;
        int[] answer = new int[c.length];

        // left
        for (int i = 0; i < c.length; i++) {
            if(c[i] == find) {
                p = 0;
            }
            answer[i] = p;
            p++;
        }

        //right
        p = 1000;
        for (int i = c.length -1; i >= 0; i--) {
            if(c[i] == find) {
                p = 0;
            }
            if(answer[i] > p) {
                answer[i] = p;
            }
            p++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : answer) {
            sb.append(i + " ");
        }

        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String input = sc.nextLine();
        solution(input.split(" "));
    }
}
