package programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prg_모의고사 {

    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};

        solution(answers);
    }

    public static int[] solution(int[] answers) {
        int[] aAnswer = {1, 2, 3, 4, 5};
        int[] bAnswer = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] cAnswer = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;

        int aScore = 0;
        int bScore = 0;
        int cScore = 0;

        for (int i = 0; i < answers.length; i++) {

            if (answers[i] == aAnswer[aCount]) {
                aScore++;
            }

            if (answers[i] == bAnswer[bCount]) {
                bScore++;
            }

            if (answers[i] == cAnswer[cCount]) {
                cScore++;
            }

            aCount++;
            bCount++;
            cCount++;

            if (aCount % 5 == 0) {
                aCount = 0;
            }
            if (bCount % 8 == 0) {
                bCount = 0;
            }
            if (cCount % 10 == 0) {
                cCount = 0;
            }
        }

        List<Integer> answerList = new ArrayList<>();

        if (aScore > bScore && aScore > cScore) {
            answerList.add(1);
        } else if (bScore > aScore && bScore > cScore) {
            answerList.add(2);
        } else if (cScore > aScore && cScore > bScore) {
            answerList.add(3);
        } else if (aScore == bScore && aScore > cScore) {
            answerList.add(1);
            answerList.add(2);
        } else if (aScore == cScore && aScore > bScore) {
            answerList.add(1);
            answerList.add(3);
        } else if (bScore == cScore && bScore > aScore) {
            answerList.add(2);
            answerList.add(3);
        } else {
            answerList.add(1);
            answerList.add(2);
            answerList.add(3);
        }

        int[] answer = new int[answerList.size()];

        Collections.sort(answerList);

        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
