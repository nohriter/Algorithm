package algorithm_codingtest.basic.data_structure.chapter5_stackAndQueue;

import java.io.BufferedWriter;
import java.util.Scanner;
import java.util.Stack;

public class P11_1874 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int num = 1;
        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        boolean result = true;

        for (int i = 0; i < N; i++) {
            int su = A[i];

            if (su >= num) {
                while (su >= num) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int n = stack.peek();

                if (su < n) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    stack.pop();
                    sb.append("-\n");
                }

            }
        }
        if(result) System.out.println(sb);
    }
}
