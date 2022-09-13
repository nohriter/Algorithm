package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek1009 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");

            int numA = Integer.parseInt(input[0]) % 10;
            int numB = Integer.parseInt(input[1]);
            int mul = 0;

            switch (numA) {
                case 1:
                case 5:
                case 6:
                    stringBuffer.append(numA);
                    break;
                case 2:
                case 3:
                case 7:
                case 8:
                    mul = numB % 4;
                    if(mul == 0) mul = 4;
                    stringBuffer.append((int)Math.pow(numA, mul) % 10);
                    break;
                case 4:
                case 9:
                    mul = numB % 2;
                    if(mul == 0) mul = 2;
                    stringBuffer.append(((int)Math.pow(numA, mul)) % 10);
                    break;
                case 0:
                    stringBuffer.append(10);
                    break;
            }
            stringBuffer.append("\n");
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(stringBuffer.toString().trim());
        bw.close();
    }

}
