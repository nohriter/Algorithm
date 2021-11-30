package leetcode;

import java.util.ArrayList;

public class Roman_to_Integer {
    public static void main(String[] args) {
        romanToInt("MCMXCIV");
    }

    public static int romanToInt(String s) {
        String[] split = s.split("");
        ArrayList<Integer> romans = toInto(split);
        int sum = calculate(romans);
        System.out.println(sum);
        return 0;
    }

    private static int calculate(ArrayList<Integer> romans) {
        int sum = 0;
        System.out.println(romans);

        for (int i = 0; i < romans.size(); i++) {
            System.out.println();
        }

        return sum;
    }

    private static ArrayList<Integer> toInto(String[] split) {
        ArrayList<Integer> romans = new ArrayList<>();

        for (String str : split) {
            switch (str) {
                case "I":
                    romans.add(1);
                    break;
                case "V":
                    romans.add(5);
                    break;
                case "X":
                    romans.add(10);
                    break;
                case "L":
                    romans.add(50);
                    break;
                case "C":
                    romans.add(100);
                    break;
                case "D":
                    romans.add(500);
                    break;
                case "M":
                    romans.add(1000);
            }
        }
        return romans;
    }
}


