package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome_Number {
    public static void main(String[] args) {
        isPalindrome(121);
    }

    public static boolean isPalindrome(int x) {
        String str = x + "";
        String[] split = str.split("");
        List<String> origin = Arrays.asList(split);
        ArrayList<String> reverse = new ArrayList<>();
        for (int i = split.length - 1; i >= 0; i--) {
            reverse.add(split[i]);
        }

        for (int i = 0; i < origin.size(); i++) {
            if(!origin.get(i).equals(reverse.get(i))) {
                return false;
            }
        }

        return true;
    }

}
