package programmers.lv1;

public class Prg_문자열_내_p와_y의_개수 {

    public static void main(String[] args) {
        solution("pPoooyY");
    }

    public static boolean solution(String s) {
        char[] chars = s.toCharArray();

        int p = 0;
        int y = 0;

        for (int i = 0; i < chars.length; i++) {
            String c = Character.toLowerCase(chars[i]) +"";
            if(c.equals("p")) {
                p++;
            }
            if(c.equals("y")) {
                y++;
            }
        }
        if(p == y) {
            return true;
        }

        return false;
    }

}
