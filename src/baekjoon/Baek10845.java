package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek10845 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> Q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int last = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.startsWith("push")) {
                String s1 = st.nextToken();
                Q.offer(Integer.parseInt(s1));
                last = Integer.parseInt(s1);
            } else if (s.equals("pop")) {
                if (!Q.isEmpty()) sb.append(Q.poll()).append("\n");
                else sb.append("-1\n");
            } else if (s.equals("size")) {
                sb.append(Q.size() + "\n");
            } else if (s.equals("empty")) {
                if (Q.isEmpty()) sb.append("1\n");
                else sb.append("0\n");
            } else if (s.equals("front")) {
                if (Q.isEmpty()) sb.append("-1\n");
                else sb.append(Q.peek() + "\n");
            } else if (s.equals("back")) {
                if (Q.isEmpty()) sb.append("-1\n");
                else sb.append(last + "\n");
            }
        }
        System.out.println(sb);
    }

}
