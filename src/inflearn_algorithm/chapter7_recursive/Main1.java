package inflearn_algorithm.chapter7_recursive;

public class Main1 {
    public void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }

    public void solution(int n) {
        DFS(n);
    }

    public static void main(String[] args) {
        Main1 T = new Main1();
        T.solution(3);
        //System.out.println(T.solution(3));
    }
}
