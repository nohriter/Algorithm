package inflearn_program_solving.section3;

import java.util.*;

class Main5 {
    public int solution(int n) {
        int answer = 0, cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main5 T = new Main5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.print(T.solution(n));
    }
}
