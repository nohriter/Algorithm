package this_is_coding_test.구현;

import java.util.Scanner;

public class Chap04_상하좌우 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        sc.nextLine();
        String[] move = sc.nextLine().split(" ");

        int x = 1;
        int y = 1;

        for (int i = 0; i < move.length; i++) {
            if (move[i].equals("R") && y < size + 1) {
                y++;
                continue;
            }
            if (move[i].equals("L") && y > 1) {
                y--;
                continue;
            }
            if (move[i].equals("U") && x > 1) {
                x--;
                continue;
            }
            if (move[i].equals("D") && x < size + 1) {
                x++;
                continue;
            }
        }

        System.out.println(x + " " + y);
    }

}
