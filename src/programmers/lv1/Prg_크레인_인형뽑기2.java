package programmers.lv1;

import java.util.Stack;

public class Prg_크레인_인형뽑기2 {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        // [[0,0,0,0,0],    []
        //  [0,0,1,0,3],    []
        //  [0,2,5,0,1],    []
        //  [0,2,4,4,2],    []
        //  [3,5,1,3,1]]    [4]

        // board[높이 위에서부터 아래][좌에서 우]
        for (int i = 0; i < moves.length; i++) {
            int move = moves[i] - 1;

            for (int j = 0; j < board.length; j++) {

                // board[반복][무브]가 0이 아니면
                if (board[j][move] != 0) {

                    // 스택의 크기가 1이상일때
                    if (stack.size() > 0) {
                        // board[반복][무브]의 값을 꺼내서
                        // 전의 스택 값이 현재의 값과 같으면 맨위의 값을 꺼내서 answer++를 한다.
                        if (stack.peek() == board[j][move]) {
                            stack.pop();
                            answer++;
                            // board[반복][무브]의 값을 꺼내서
                            // 전의 스택 값이 현재의 값과 다르면 스택에 넣는다.
                        } else {
                            stack.push(board[j][move]);
                        }

                        // 스택의 크기가 0이면 board[반복][무브] 값을 넣는다.
                    } else {
                        stack.push(board[j][move]);
                    }

                    // board[반복][무브]의 값을 0으로 바꾼다.
                    board[j][move] = 0;
                    // 그리고 세로탐색을 멈춘다.

                    break;
                }

            }

        }

        // board[반복][무브]가 0이 아니면
        // board[반복][무브]의 값을 꺼내서 스택의 크기가 1이상일때 전의 스택 값이 현재의 값과 다르면 스택에 넣는다.
        // board[반복][무브]의 값을 꺼내서 전의 스택 값이 현재의 값과 같으면 맨위의 값을 꺼내서 count++를 한다.
        // 스택의 크기가 0 이면 그냥 넣어줘.
        // board[반복][무브]의 값을 0으로 바꾼다.
        // 그리고 세로탐색을 멈춘다.


        return answer * 2;
    }


}
