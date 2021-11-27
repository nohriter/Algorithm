package leetcode;

import java.util.ArrayList;

public class Reverse_Integer {
    public static void main(String[] args) {
        reverse(-123);
    }

    public static int reverse(int x) {
        ArrayList<String> temp = reverseNum(x);
        String tempAnswer = "";

        if (temp.get(temp.size() - 1).equals("-")) {
            temp.add(0, temp.remove(temp.size() - 1));
        }

        for (String a : temp) {
            tempAnswer += a;
        }

        Long subAnswer = Long.parseLong(tempAnswer);

        if (subAnswer < Integer.MIN_VALUE || Integer.MAX_VALUE < subAnswer) {
            return 0;
        }

        int answer = Integer.parseInt(tempAnswer);

        return answer;
    }

    private static ArrayList<String> reverseNum(int x) {
        String str = x + "";
        String[] split = str.split("");
        ArrayList<String> temp = new ArrayList<>();

        for (int i = split.length - 1; i >= 0; i--) {
            temp.add(split[i]);
        }
        return temp;
    }
}
