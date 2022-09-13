package programmers.lv1;

public class Prg_자연수_뒤집어_배열로_만들기 {

    public static void main(String[] args) {
        solution(1000000000);
    }

    public static int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];

        int i = 0;
        while (n > 0) {
            answer[i] = (int) (n % 10);

            n /= 10;

            i++;
        }

        return answer;
    }

}
