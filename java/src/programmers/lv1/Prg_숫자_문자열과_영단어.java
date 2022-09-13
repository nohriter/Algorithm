package programmers.lv1;


public class Prg_숫자_문자열과_영단어 {
    public static void main(String[] args) {
        int solution = solution("2three45sixseven");
        System.out.println(solution);
    }

    public static int solution(String s) {
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < 10; i++) {
            s = s.replace(word[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }


}
