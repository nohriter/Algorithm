package this_is_coding_test.그리디;

import java.util.Arrays;
import java.util.Scanner;

public class Chap11_모험가_길드 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int adventurer = sc.nextInt();

        int[] horror = new int[adventurer];
        for (int i = 0; i < adventurer; i++) {
            horror[i] = sc.nextInt();
        }

        Arrays.sort(horror);

        int group = 0;
        int member = 0;

        for (int i = 0; i < adventurer; i++) {
            member++;
            if (member == horror[i]) {
                group++;
                member = 0;
            }
        }
        System.out.println(group);
    }

}
