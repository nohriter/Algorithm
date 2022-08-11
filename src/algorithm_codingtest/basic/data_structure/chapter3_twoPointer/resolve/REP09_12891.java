package algorithm_codingtest.basic.data_structure.chapter3_twoPointer.resolve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class REP09_12891 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        char[] arr = st.nextToken().toCharArray();

        st = new StringTokenizer(br.readLine());
        Map<Character, Integer> ANSWER = new HashMap<>();
        ANSWER.put('A', Integer.parseInt(st.nextToken()));
        ANSWER.put('G', Integer.parseInt(st.nextToken()));
        ANSWER.put('C', Integer.parseInt(st.nextToken()));
        ANSWER.put('T', Integer.parseInt(st.nextToken()));




    }


    private static boolean check(Map<Character, Integer> DNA, Map<Character, Integer> ANSWER) {
        if (DNA.get('A') < ANSWER.get('A')) {
            return false;
        }
        if (DNA.get('C') < ANSWER.get('C')) {
            return false;
        }
        if (DNA.get('G') < ANSWER.get('G')) {
            return false;
        }
        if (DNA.get('T') < ANSWER.get('T')) {
            return false;
        }

        return true;
    }

    private static Map<Character, Integer> createMap() {
        Map<Character, Integer> DNA = new HashMap<>();
        DNA.put('A', 0);
        DNA.put('C', 0);
        DNA.put('G', 0);
        DNA.put('T', 0);

        return DNA;
    }

}
