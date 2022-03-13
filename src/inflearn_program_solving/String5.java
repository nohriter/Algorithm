package inflearn_program_solving;

import java.util.Scanner;
import java.util.Stack;

public class String5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final char[] chars = sc.nextLine().toCharArray();
        solution(chars);
    }

    public static void solution(char[] chars) {
        int lt = 0;
        int rt = chars.length-1;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if((65 <= chars[i] &&  chars[i] <= 90) || (97 <= chars[i] && chars[i] <= 122)) {

            }
            sb.append(chars[i]);
        }

    }

}
