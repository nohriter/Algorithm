package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 97; i < 123; i++) {
            sb.append(s.indexOf((char) i) +" ");
        }

        String trim = sb.toString().trim();

        System.out.println(trim);
    }

}
