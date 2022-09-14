package baekjoon;

import java.util.Scanner;

public class Baek1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");
		int x = Integer.parseInt(arr[0]);
		int y = Integer.parseInt(arr[1]);
		int w = Integer.parseInt(arr[2]);
		int h = Integer.parseInt(arr[3]);

		int a = x;
		int b = w - x;
		int c = y;
		int d = h-y;

		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;

		System.out.println(min);

	}

}
