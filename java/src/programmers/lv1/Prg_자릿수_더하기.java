package programmers.lv1;

public class Prg_자릿수_더하기 {

    public static void main(String[] args) {
        solution(123);
    }

    public static int solution(int n) {
        String temp = n + "";
        String[] split = temp.split("");

        int answer = 0;
        for (int i = 0; i < split.length; i++) {
            answer += Integer.valueOf(split[i]);
        }

        return answer;
    }

}

// 다른방식
//public class Solution {
//    public int solution(int n) {
//        int answer = 0;
//
//        while(true){
//            answer+=n%10;
//            if(n<10)
//                break;
//
//            n=n/10;
//        }
//
//        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//        System.out.println("Hello Java");
//
//        return answer;
//    }
//}
