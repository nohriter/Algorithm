package baekjoon;

import java.util.Scanner;

public class Baek15964 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        System.out.println(king(a, b));
    }

    private static long king(long a, long b) {
        return (a + b) * (a - b);
    }
}
