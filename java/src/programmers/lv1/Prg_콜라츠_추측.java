package programmers.lv1;

//int 와 long 을 항상 신경써야겠다
// 이번문제는 int 값을 그대로 사용했더니 오버플로우가 발생했다.

public class Prg_콜라츠_추측 {
    public static void main(String[] args) {
        System.out.println(solution(626331));
    }

    public static int solution(int num) {
        int count = 0;
        long temp = num;
        while(true) {
            if(temp == 1) {
                return 0;
            }
            if (num % 2 == 0) {
                num =  num / 2;
            } else {
                num = (num * 3) +1;
            }
            count++;
            System.out.println(num +" "+ count);
            if( num == 1) {
                break;
            }
            if(count == 500) {
                return -1;
            }
        }

        return count;
    }
}
