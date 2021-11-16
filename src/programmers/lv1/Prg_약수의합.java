package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class Prg_약수의합{
    public static void main(String[] args) {
        solution(5);
    }

    static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }
}
