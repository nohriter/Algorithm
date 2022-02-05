package baekjoon;

import java.util.*;

public class Baek9093 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        Stack<Character> stack = new Stack<Character>();
        sc.nextLine();

        while(num-- > 0) {
            String input = sc.nextLine()+" ";
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' ') {
                    while(!stack.isEmpty()) {
                        System.out.print(stack.pop());
                    }
                    System.out.print(" ");
                } else
                    stack.push(input.charAt(i));
            }
            System.out.println();
        }

        sc.close();
        return;
    }
}
