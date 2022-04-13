package inflearn_program_solving.section3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    public static void solution(int[] firsts, int[] seconds) {
        int p1 = 0;
        int p2 = 0;
        final ArrayList<Integer> answer = new ArrayList<>();

        while (p1 < firsts.length && p2 < seconds.length) {
            if (firsts[p1] < seconds[p2]) {
                p1++;
            } else if (firsts[p1] > seconds[p2]) {
                p2++;
            } else {
                answer.add(firsts[p1]);
                p1++;
                p2++;
            }
        }

        for (Integer integer : answer) {
            System.out.print(integer +" ");
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int first = scanner.nextInt();
        int[] firsts = new int[first];
        for (int i = 0; i < first; i++) {
            firsts[i] = scanner.nextInt();
        }

        final int second = scanner.nextInt();
        int[] seconds = new int[first];
        for (int i = 0; i < first; i++) {
            seconds[i] = scanner.nextInt();
        }

        Arrays.sort(firsts);
        Arrays.sort(seconds);

        solution(firsts, seconds);
    }

}
