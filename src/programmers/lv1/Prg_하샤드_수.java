package programmers.lv1;

public class Prg_하샤드_수 {
    public static void main(String[] args) {
        System.out.println(solution(18));
    }

    public static boolean solution(int x) {
        String str = x + "";

        String[] split = str.split("");

        int temp = 0;
        for (int i = 0; i < split.length; i++) {
            temp += Integer.parseInt(split[i]);
            System.out.println(temp);
        }
        System.out.println((x % temp));

        if (x % temp == 0) {
            return true;
        }

        return false;
    }
}
