package programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;

public class Prg_K번째수 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3}, // 4
                {4, 4, 1}, // 1
                {1, 7, 3}}; // 7

        solution(array, commands);
    }

    public static int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            for (int k = commands[i][0]; k < (commands[i][1] + 1); k++) {
                temp.add(array[k-1]);
            }
            Collections.sort(temp);
            answerList.add(temp.get(commands[i][2]-1));
            temp.clear();
        }


        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
