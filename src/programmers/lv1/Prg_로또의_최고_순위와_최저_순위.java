package programmers.lv1;

public class Prg_로또의_최고_순위와_최저_순위 {
    public static void main(String[] args) {
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};
        solution(lottos, win_nums);
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        //값을 하나씩 꺼내서 맞은 숫자가 몇개 인지 확인한다.
        //0의 개수가 몇개인지 확인한다.
        //최소 맞은숫자의 개수
        //최대 맞은숫자 + 0의 개수
        int same = 0;
        int zero = 0;

        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    same++;
                }
            }
            if(lottos[i] == 0) {
                zero++;
            }
        }

        int minAnswer = same;
        int maxAnswer = same + zero;

        int[] answer = {getGrade(maxAnswer), getGrade(minAnswer)};
        return answer;
    }

    private static int getGrade(int num) {
        switch (num) {
            case 0:
            case 1:
                return 6;
            case 2:
                return 5;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 2;
            case 6:
                return 1;

        }
        return num;
    }
}
