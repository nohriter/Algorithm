package inflearn_program_solving.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class String7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String input = sc.nextLine();

        solution(input);
    }

    public static void solution(String input) {
        final List<String> A = Arrays.asList(input.toLowerCase(Locale.ROOT).split(""));
        final List<String> B = new ArrayList<>(A);
        Collections.reverse(A);

        String answer = "YES";

        for (int i = 0; i < A.size(); i++) {
            if(!(A.get(i).equals(B.get(i)))) {
                answer = "NO";
            }
        }

        System.out.println(answer);
    }

}
