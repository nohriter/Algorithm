package baekjoon;

import java.util.Scanner;

public class Baek2480 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;

        for (int i = 0; i < 3; i++) {
            if(sc.nextInt() == a) {
                count++;
            }
        }


    }

}
