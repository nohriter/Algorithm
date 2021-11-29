package programmers.lv1;

public class Prg_최대공약수와_최소공배수 {
    public static void main(String[] args) {
        System.out.println(solution(6, 18));
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = min(n, m);
        answer[1] = max(n, m);

        System.out.println("answer[0] = " + answer[0]);
        System.out.println("answer[1] = " + answer[1]);

        return answer;
    }

    private static int max(int n, int m) {
        return (n * m) / min(n, m);
    }

    private static int min(int n, int m) {
        int r;

        while (n != 0) {
            r = m % n;
            m = n;
            n = r;
        }

        return m;
    }
}
