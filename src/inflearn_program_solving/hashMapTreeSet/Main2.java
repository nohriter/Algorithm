package inflearn_program_solving.hashMapTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String a = scanner.next();
        final String b = scanner.next();
        System.out.println(solution(a, b));
    }

    private static String solution(String a, String b) {
        String answer = "YES";

        final HashMap<Character, Integer> map = new HashMap<>();

        for (char c : a.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : b.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) return "NO";
            map.put(c, map.get(c) - 1);
        }

        return answer;
    }

}
