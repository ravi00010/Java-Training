package Day5;

public class recusionsum {
    static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return sum(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of first " + n + " natural numbers is: " + sum(n));
    }
}
