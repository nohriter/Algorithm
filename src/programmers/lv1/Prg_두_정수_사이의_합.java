package programmers.lv1;

public class Prg_두_정수_사이의_합 {

    public static void main(String[] args) {
        solution(5, 3);
    }

    public static long solution(int a, int b) {
        int min = a ;

        if(min > b) {
            min = b;
            b = a;
            a = min;
        }

        long answer = 0;
        for (int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }

}
