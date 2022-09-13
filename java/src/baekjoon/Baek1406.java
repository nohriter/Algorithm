package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baek1406 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = "";

        String str = br.readLine();
        Stack<Character> L = new Stack<>();
        Stack<Character> R = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            L.push(str.charAt(i));
        }

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            String s = br.readLine();

            if (s.equals("L")) {
                if (!L.isEmpty()) {
                    R.push(L.pop());
                }
            } else if (s.equals("D")) {
                if (!R.isEmpty()) {
                    L.push(R.pop());
                }
            } else if (s.equals("B")) {
                if (!L.isEmpty()) {
                    L.pop();
                }
            } else {
                L.push(s.charAt(2));
            }
        }
        // 핵심
        while (!L.isEmpty()) {
            R.push(L.pop());
        }

        StringBuilder sb = new StringBuilder();

        while (!R.isEmpty()) {
            sb.append(R.pop());
        }

        System.out.println(sb);
    }

}
