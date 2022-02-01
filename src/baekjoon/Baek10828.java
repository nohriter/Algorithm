package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Baek10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new Stack();

        int N = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sb.append(br.readLine() + "\n");
        }

        sb.


    }
}
//
//for (int i = 0; i < N; i++) {
//        String input = br.readLine();
//        String[] commands = input.split(" ");
//        input = commands[0];
//        switch (input) {
//        case "push":
//        stack.push(commands[1]);
//        break;
//        case "top":
//        if (stack.empty()) {
//        System.out.println("-1");
//        } else {
//        System.out.println(stack.peek());
//        }
//        break;
//        case "pop":
//        if (stack.empty()) {
//        System.out.println("-1");
//        } else {
//        System.out.println(stack.pop());
//        }
//        break;
//        case "size":
//        System.out.println(stack.size());
//        break;
//        case "empty":
//        if (stack.empty()) {
//        System.out.println("1");
//        } else {
//        System.out.println("0");
//        }
//        break;
//        }
//        }
