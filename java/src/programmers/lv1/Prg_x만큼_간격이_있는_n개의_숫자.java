package programmers.lv1;

public class Prg_x만큼_간격이_있는_n개의_숫자 {
    public static void main(String[] args) {
        solution(-4, 2);
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long temp = x;
        for (int i = 0; i < n; i++) {
            answer[i] = temp * (i+1);
        }

        return answer;
    }
}// 배운 것 int의 범위를 생각하고 코딩하자.
