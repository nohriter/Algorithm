package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class A_Very_Big_Sum {

    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();

        aVeryBigSum(list);
    }

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        Long sum = 0L;

        for(Long num : ar) {
            sum += num;
        }


        return sum;
    }

}
