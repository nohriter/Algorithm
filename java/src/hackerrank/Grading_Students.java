package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Grading_Students {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(44);
        list.add(84);
        list.add(94);
        list.add(21);
        list.add(0);
        list.add(18);
        list.add(100);
        list.add(18);
        list.add(62);
        list.add(0);
        System.out.println(gradingStudents(list));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        for (int i = 0; i < grades.size(); i++) {
            if(grades.get(i) >= 38) {
                int rest = grades.get(i) % 5;
                if(rest > 2) {
                    int temp = grades.get(i);
                    grades.set(i, temp+(5-rest));
                }
            }
        }

        return grades;
    }

}
