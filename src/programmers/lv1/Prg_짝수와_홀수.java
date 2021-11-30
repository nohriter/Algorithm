package programmers.lv1;

public class Prg_짝수와_홀수 {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    public static String solution(int num) {
        String answer = (0 == (num % 2)) ? "Even" : "Odd";

        return answer;
    }
}
