package programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Prg_두개_뽑아서_더하기 {
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};

        solution(answers);
    }

    public static int[] solution(int[] numbers) {
        Set<Integer> temp = new HashSet<>();

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++){
                temp.add(numbers[i] + numbers[j]);
            }
        }

        ArrayList<Integer> list = new ArrayList(temp);
        int[] answer = new int[list.size()];
        Collections.sort(list);
        int size = 0;
        for(int a : list) {
            answer[size] = a;
            size++;
        }

        return answer;
    }
}
