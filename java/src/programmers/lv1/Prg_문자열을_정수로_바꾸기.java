package programmers.lv1;

public class Prg_문자열을_정수로_바꾸기 {

    public static void main(String[] args) {
        System.out.println(solution("-1234"));
    }

    public static int solution(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }
}
