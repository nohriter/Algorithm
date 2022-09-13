package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baek3052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            int v = n % 42;
            map.put(String.valueOf(v), v);
        }

        System.out.println(map.size());
    }
}
