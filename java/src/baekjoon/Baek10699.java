package baekjoon;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Baek10699 {

    public static void main(String[] args) {
        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }
}
