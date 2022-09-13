package baekjoon;

import java.util.Scanner;

public class Baek1152 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        if (s.isBlank()) {
            System.out.println("0");
        } else {
            String[] split = s.trim().split(" ");
            System.out.println(split.length);
        }


    }
}

//    Scanner str = new Scanner(System.in);
//
//    String s = str.nextLine();
//		str.close();
//
//                  StringTokenizer st=new StringTokenizer(s," ");
//
//                System.out.println(st.countTokens());
