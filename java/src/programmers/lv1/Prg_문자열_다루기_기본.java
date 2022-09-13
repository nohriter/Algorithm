package programmers.lv1;

public class Prg_문자열_다루기_기본 {

    public static void main(String[] args) {
        solution("a234");
    }

    public static boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            try {
                Integer.parseInt(s);
            } catch (Exception e) {
                return false;
            }

            return true;
        }

        return false;
    }
}
