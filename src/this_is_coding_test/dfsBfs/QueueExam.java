package this_is_coding_test.dfsBfs;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

}
