package baekjoon;


import java.util.Scanner;

public class Baek10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();

			int floor = N % H;
			int number = N / H + 1;

			int room;

			if (floor == 0) {
				room = (H * 100) + number;
			} else {
				room = (floor * 100) + number;
			}
		}

	}
}
