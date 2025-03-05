package Day5;

public class FactorialEX {
    static int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return fact(n - 1) * n;
        }
    }

    public static void main(String[] args) {
        int result = fact(5);
        System.out.println("Factorial is: " + result);
    }
}
