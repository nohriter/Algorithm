package baekjoon;

import java.util.Scanner;

public class Baek2475 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += Math.pow(sc.nextDouble(), 2);
        }

        System.out.println((int)(sum % 10));
    }
}
