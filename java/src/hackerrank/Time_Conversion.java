package hackerrank;

public class Time_Conversion {
    public static void main(String[] args) {
        timeConversion("12:40:22AM");
    }

    public static String timeConversion(String s) {
        String[] times = s.split(":");
        int hour = Integer.parseInt(times[0]);
        String secondType = times[2];
        String type = secondType.substring(2);
        String second = secondType.substring(0,2);
        times[2] = second;

        if(hour == 12 && type.equals("AM")) {
            String temp = "00";
            times[0] = temp;
        }

        if(hour != 12 &&type.equals("AM")){
            if(hour > 12) {
                hour -= 12;
                times[0] = hour+"";
            }
        }

        //PM
        if(hour == 12 && type.equals("PM")){
            String temp = "12";
            times[0] = temp;
        }

        if(hour != 12 && type.equals("PM")){
            if(hour < 12) {
                hour += 12;
                times[0] = hour+"";
            }
        }

        return times[0] +":"+ times[1] +":"+ times[2];
    }

}
