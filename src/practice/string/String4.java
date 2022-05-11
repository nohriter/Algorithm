package practice.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String4 {

    public static void solution(List<String> arrayList) {

        StringBuilder sb = new StringBuilder();

        for (String word : arrayList) {
            final String[] split = word.split("");
            for (int i = word.length()-1; i >= 0; i--) {
                sb.append(split[i]);
            }
            System.out.println(sb);
            sb.setLength(0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = Integer.parseInt(sc.nextLine());
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arrayList.add(sc.nextLine());
        }

        solution(arrayList);
    }


}
