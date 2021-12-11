package programmers.lv1;

public class Prg_1차_다트_게임 {

    public static void main(String[] args) {
        System.out.println(solution("10S5D*10T"));
    }

    public static int solution(String dartResult) {
        int[] stage = new int[3];

        char[] chars = dartResult.toCharArray();

        int idx = -1;

        for (int i = 0; i < chars.length; i++) {
            if('0' <= chars[i] && chars[i] <= '9') {
                idx++;
                stage[idx] = Integer.parseInt(String.valueOf(chars[i]));
                if(chars.length-1 != i+1  && chars[i] == '1' && chars[i+1] == '0') {
                    stage[idx] = 10;
                    i++;
                }
            } else if (chars[i] == 'D') {
                stage[idx] *= stage[idx];
            } else if(chars[i] == 'T') {
                stage[idx] *= stage[idx] * stage[idx];
            } else if (chars[i] == '*') {
                if (idx > 0) stage[idx-1] *=2;
                stage[idx] *= 2;
            } else if (chars[i] == '#') {
                stage[idx] *= -1;
            }
        }

        return stage[0] + stage[1] + stage[2];
    }
}
