package inflearn_program_solving.hashMapTreeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = Integer.parseInt(scanner.nextLine());
        final char[] select = scanner.nextLine().toCharArray();
        solution(n, select);
    }

    private static void solution(int n, char[] select) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c: select) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int max = Integer.MIN_VALUE;
        char answer = ' ';

        for (char c : map.keySet()) {
            if(map.get(c) > max) {
                max = map.get(c);
                answer = c;
            }
        }

        System.out.println(answer);
    }

}
