package FinalTest;

import java.util.Scanner;

public class FibonacciSeries {
    static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the number");
        n = sc.nextInt();

        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        sc.close();
    }
}
