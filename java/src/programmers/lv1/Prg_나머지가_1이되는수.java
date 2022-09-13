package programmers.lv1;

public class Prg_나머지가_1이되는수 {

    public static void main(String[] args) {
        System.out.println(solution(10));;
    }

    public static int solution(int n) {

        int answer = 0;

        for (int i = 3; i <= 1000000; i++) {
            if(n % i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }


}
