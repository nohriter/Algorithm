package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baek2754 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Character, String> map = new HashMap<>();
        map.put('A', "4");
        map.put('B', "3");
        map.put('C', "2");
        map.put('D', "1");
        map.put('F', "0");
        map.put('+', "0.3");
        map.put('-', "-0.3");
        map.put('0', "0");

        String score = sc.nextLine();
        char a = score.charAt(0);
        if (a == 'F') System.out.println("0.0");
        else {
            char b = score.charAt(1);
            double v = Integer.parseInt(map.get(a)) + Double.parseDouble(map.get(b));
            System.out.println(v);
        }

    }
}
