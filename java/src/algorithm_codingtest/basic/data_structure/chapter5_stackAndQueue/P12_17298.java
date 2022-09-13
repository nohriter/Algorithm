package algorithm_codingtest.basic.data_structure.chapter5_stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P12_17298 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] answer = new int[N];

        Stack<Integer> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        stack.push(0);

        for (int i = 1; i < N; i++) {
            while (!stack.empty() && A[i] > A[stack.peek()]) {
                answer[stack.pop()] = A[i];
            }

            stack.push(i);
        }

        while (!stack.empty()) {
            answer[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(answer[i]).append(' ');
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i] + " ");
        }
    }

}
