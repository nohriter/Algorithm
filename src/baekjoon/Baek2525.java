package baekjoon;

import java.util.Scanner;

public class Baek2525 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        int c = sc.nextInt();

        if (m + c >= 60) {
            int a = (m + c) % 60;
            int b = (m + c) / 60;

            h += b;
            m = a;
        }else{
            m += c;
        }

        if (h >= 24) {
            h = h - 24;
        }

        System.out.println(h + " " + m);


    }

}
