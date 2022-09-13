package this_is_coding_test.dfsBfs;

public class RecursiveFunction {

    public static void main(String[] args) {
        int recursive = recursive(10);

        System.out.println(recursive);
    }

    private static int recursive(int n) {
        System.out.println(n);

        while (n <= 1) {
            return 1;
        }

        return n * recursive(n-1);
    }

}
