package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class Prg_크레인_인형뽑기 {
    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        solution(board, moves);
    }

    public static int solution(int[][] board, int[] moves) {

        // moves 에서 뽑은 라인으로 간다.
        // 위에서부터 하나씩 인형이 있는지 없는지 확인한다.
        // 없다면 다음으로 진행.
        // 값이 있다면 뽑아서. temp 리스트로 옮긴다.
        // 위의 과정을 반복
        // temp의 연속된 숫자가 나온다면 2개를 없애고 count 를 증가시킨다.

        List<Integer> temp = new ArrayList<>();
        int answer = 0;

        for (int i = 0; i < moves.length; i++) {
            int position = moves[i] - 1;
            System.out.println(position + "번째껄 뽑으러가");
            for (int j = 0; j < board.length; j++) {
                if (board[j][position] != 0) {
                    temp.add(board[j][position]);
                    System.out.println(board[j][position] + "을 뽑아");
                    System.out.println(board[j][position] + "을 0으로 바꿔");
                    board[j][position] = 0;
                    System.out.println(board[j][position] + " = 0");
                    break;
                }
            }
            System.out.println(temp.size() + "temp 배열 갯수");
            for(int num : temp) {
                System.out.println("temp에 든거"+num);
            }
            if (temp.size() >= 2) {
                if (temp.get(temp.size() - 2) == temp.get(temp.size() - 1)) {
                    temp.remove(temp.size() - 2);
                    temp.remove(temp.size() - 1);
                    answer = answer+2;
                }
            }
            System.out.println();
        }

        System.out.println(answer);
        return answer;
    }
}
