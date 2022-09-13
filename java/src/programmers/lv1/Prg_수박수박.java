package programmers.lv1;

public class Prg_수박수박 {
    public static void main(String[] args) {
        solution(2);
    }

    public static String solution(int n) {
        StringBuffer strBuffer = new StringBuffer();

        for (int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                strBuffer.append("수");
            }else {
                strBuffer.append("박");
            }
        }

        return strBuffer.toString();
    }
}
