package this_is_coding_test.구현;

import java.util.Scanner;

public class Chap12_럭키_스트레이트 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int sum = 0;

        String[] str = input.split("");

        for (int i = 0; i < str.length / 2; i++) {
            sum += Integer.parseInt(str[i]);
        }

        for (int i = str.length / 2; i < str.length; i++) {
            sum -= Integer.parseInt(str[i]);
        }

        if(sum == 0) {
            System.out.println("LUCKY");
        }else {
            System.out.println("READY");
        }

    }
}
