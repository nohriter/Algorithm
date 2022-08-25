package baekjoon;

import java.util.Scanner;

public class Baek25304 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = sc.nextInt();
        int totalCount = sc.nextInt();

        int temp = 0;

        for (int i = 0; i < totalCount; i++) {
            int price = sc.nextInt();
            int count = sc.nextInt();

            temp += price * count;
        }

        if(totalPrice == temp) {
           System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
