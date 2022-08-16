package algorithm_codingtest.basic.data_structure.chapter5_stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P13_2164 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        // 1. 맨위에 버려
        // 2. 맨위에 처음으로 넣어
        // 1장 남았을때까지

        while(queue.size() > 1) {
            queue.poll();
            queue.add(queue.poll());
        }

        System.out.println(queue.peek());

    }

}
