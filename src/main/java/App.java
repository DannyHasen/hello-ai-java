public class App {
    public static int fib(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = (args.length > 0) ? Integer.parseInt(args[0]) : 10;
        System.out.println("fib(" + n + ") = " + fib(n));
        System.out.println("Second commit test!");
    }
}
