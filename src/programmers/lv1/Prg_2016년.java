package programmers.lv1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Prg_2016년 {

    public static void main(String[] args) {
        solution(3, 7);
    }

    static public String solution(int a, int b) {
        String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        LocalDate date = LocalDate.of(2016, a, b);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        int value = dayOfWeek.getValue();

        return day[value - 1];
    }
}
