package programmers.lv1;

import java.util.Arrays;

public class Prg_완주하지_못한_선수 {
    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        String solution = solution(participant, completion);
        System.out.println(solution);
    }

    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if(!completion[i].equals(participant[i])) {
                return participant[i];
            }
        }

        return participant[participant.length-1];
    }
}
