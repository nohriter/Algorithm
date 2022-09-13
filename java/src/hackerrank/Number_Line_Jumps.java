package hackerrank;

public class Number_Line_Jumps {

    public static void main(String[] args) {
        kangaroo(1, 2, 4, 8);
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        String answer = "NO";
        int a = x1;
        int b = x2;
        while(true) {
            a += v1;
            b += v2;

            if(a == b) {
                answer = "YES";
                break;
            }

        }
        System.out.println("answer = " + answer);
        return answer;
    }

}
