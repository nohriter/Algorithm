package baekjoon;

import java.util.Scanner;

public class Baek2480 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int answer = 0;

        if (a == b && a == c) {
            answer = 10000 + a * 1000;
        } else if (a == b) {
            answer = 1000 + a * 100;
        } else if (b == c) {
            answer = 1000 + b * 100;
        } else if (a == c) {
            answer = 1000 + a * 100;
        } else {
            int max = a;
            if(b > a) {
                max = b;
                if(c > b) {
                    max = c;
                }
            }else if(c > a) {
                max = c;
            }

           answer = max * 100;
        }

        System.out.println(answer);
    }

}
