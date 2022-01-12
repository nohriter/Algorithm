package this_is_coding_test.정렬;

public class Exam_계수정렬 {

    private static final int MAX_VALUE = 9;

    public static void main(String[] args) {
        int n = 15;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
        int[] count = new int[MAX_VALUE + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]] += 1;
        }

        for (int i = 0; i <= MAX_VALUE; i++) {
            for (int j = 0; j < count[i]; j++) {
                System.out.println(i);
            }
        }


    }

}
