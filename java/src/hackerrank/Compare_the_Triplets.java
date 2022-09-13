package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Compare_the_Triplets {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        compareTriplets(a, b);
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        int aCount = 0;
        int bCount = 0;

        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i)) {
                aCount ++;
            } else if(a.get(i) < b.get(i)) {
                bCount ++;
            }
        }

        List<Integer> answer = new ArrayList<>();
        answer.add(aCount);
        answer.add(bCount);

        return answer;
    }
}
