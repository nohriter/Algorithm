package inflearn_program_solving;

import java.util.Scanner;

public class String3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String input = sc.nextLine();

        final String[] split = input.split(" ");

        System.out.println(solution(split));
    }

    public static String solution(String[] split) {
        int max = split[0].length();

        String answer = split[0];

        for (String s : split) {
            if(s.length() > max) {
                max = s.length();
                answer = s;
            }
        }

        return answer;
    }

}
