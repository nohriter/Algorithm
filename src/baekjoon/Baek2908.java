package baekjoon;

import java.util.Scanner;

public class Baek2908 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        String s = arr[0];
        StringBuilder sb = new StringBuilder(s);
        String a = sb.reverse().toString();
        s = arr[1];
        sb = new StringBuilder(s);
        String b = sb.reverse().toString();
        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);

        if(A > B) {
            System.out.println(A);
        }else System.out.println(B);

    }
}
