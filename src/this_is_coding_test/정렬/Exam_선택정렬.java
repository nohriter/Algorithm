package this_is_coding_test.정렬;

import java.util.Arrays;

public class Exam_선택정렬 {

    public static void main(String[] args) {

        int[] array = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int i = 0; i < array.length; i++) {
            int min_index = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[min_index] > array[j]) {
                    min_index = j;
                }
            }

            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }

        System.out.println(Arrays.toString(array));

    }

}
