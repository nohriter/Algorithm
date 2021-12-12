package programmers.lv1;

public class Prg_부족한_금액_계산하기 {

    public static void main(String[] args) {
        solution(3, 20, 4);
    }

    public static long solution(int price, int money, int count) {
        long temp = 0;

        for (int i = 1; i <= count; i++) {
            temp += price * i;
        }

        if(money > temp) {
            return 0;
        }

        if(money < temp) {
            return (money - temp) * -1;
        }

        return money - temp;
    }

}
