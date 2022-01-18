package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek10815 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] beforeAArray = br.readLine().split(" ");
        int[] aArray = new int[n];


        for (int i = 0; i < beforeAArray.length; i++) {
            aArray[i] = Integer.parseInt(beforeAArray[i]);
        }

        Arrays.sort(aArray);

        int m = Integer.parseInt(br.readLine());
        String[] beforeComArray = br.readLine().split(" ");
        int[] compareArray = new int[m];

        for (int j = 0; j < beforeComArray.length; j++) {
            compareArray[j] = Integer.parseInt(beforeComArray[j]);
        }

        for (int i = 0; i < compareArray.length; i++) {
            int flag = 0;

            int max = n;
            int min = 0;
            int middle;

            while (max - min > 1) {
                middle = (min + max) / 2;

                if (compareArray[i] == aArray[0]) {
                    flag = 1;
                    break;
                }

                if (compareArray[i] == aArray[middle]) {
                    flag = 1;
                    break;
                }
                if (compareArray[i] > aArray[middle]) {
                    min = middle;
                } else if (compareArray[i] < aArray[middle]) {
                    max = middle;
                }

            }
            System.out.print(flag + " ");

        }
    }
}


