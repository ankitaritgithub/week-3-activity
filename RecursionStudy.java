public class RecursionStudy {
    static void printDescending(int n) {
        if (n < 1)
            return;
        System.out.println(n);
        printDescending(n - 1);
    }

    public void main(String[] args) {
        int n = 5;
        printDescending(n);
    }
}
