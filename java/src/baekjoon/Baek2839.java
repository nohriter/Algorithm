package baekjoon;

import java.util.Scanner;

public class Baek2839 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;
        int result;

        if(N >= 5) {
            answer += N / 5;
        }

        if(N >= 3) {
            answer += answer / 3;
        }

        System.out.println(answer);
        // 5로 나눈다.
        // 5로 나누어 지지 않으면 -1 출력
        // 몫의 개수를 더한다.
        // 나머지를 3으로 나눈다.

        // 5로 나누어지지 않으면 3으로 나눈다.
        // 3으로 나
        // 몫의 개수를 더한다.

        // 나머지가 0 이면 몫을 더한 값을 출력
        // 나머지가 존재하면 -1 을 출력


    }

}
