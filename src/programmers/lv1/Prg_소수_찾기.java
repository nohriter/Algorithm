package programmers.lv1;

public class Prg_소수_찾기 {
    public static void main(String[] args) {
        solution(17);
    }

    public static int solution(int n) {
        boolean sosu;
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            sosu = true;
            for(int j=2; j*j<=i; j++){
                System.out.println(j);
                if(i % j == 0){
                    sosu = false;
                    break;
                }
            }
            if(sosu) {
                answer++;
            }
        }
        return answer;
    }
}
