package this_is_coding_test.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedMap;
import java.util.TreeMap;

public class Chap06_성적이_낮은순서대로 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        SortedMap<Integer, String> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            map.put(Integer.parseInt(s[1]), s[0]);
        }

        map.keySet().forEach(key -> {
            System.out.println(key + " -> " + map.get(key));
        });
    }
}
