package baekjoon;

import java.util.Scanner;

public class Baek9086 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            if (s.length() == 1) {
                System.out.println(s+s);
                continue;
            }
            String a = Character.toString(s.charAt(0));
            String b = Character.toString(s.charAt(s.length() - 1));
            System.out.println(a + b);
        }
    }
}
