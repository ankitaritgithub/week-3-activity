public class FibonacciSerie {
    static int fib(int n) {
        if (n < 2)
            return n;
        int a = fib(n - 1);
        int b = fib(n - 2);
        return a + b;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }

}
