package practice.string;

import java.util.Scanner;

public class String5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final char[] chars = sc.nextLine().toCharArray();
        solution(chars);
    }

    public static void solution(char[] chars) {
        int lt = 0;
        int rt = chars.length-1;

        while (lt < rt) {
            if(!isAlphabet(chars[lt])) {
                lt++;
            }else if(!isAlphabet(chars[rt])) {
                rt--;
            }else {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            sb.append(aChar);
        }

        System.out.println(sb);
    }

    public static boolean isAlphabet(char c) {
        if((65 <= c &&  c <= 90) || (97 <= c && c <= 122)) {
            return true;
        }

        return false;
    }
}
