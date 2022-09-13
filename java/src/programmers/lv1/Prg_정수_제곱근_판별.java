package programmers.lv1;

// 배운 것 Math.sqrt
// 배운 것 Math.pow

public class Prg_정수_제곱근_판별 {
    public static void main(String[] args) {
        System.out.println(solution(25000));
    }

    public static long solution(long n) {
        long answer = 0;

        for (long i = 1; i <= n; i++) {
            if (i * i == n) {
                answer = (i + 1) * (i + 1);
                break;
            } else answer = -1;
        }
        return answer;
    }
}
