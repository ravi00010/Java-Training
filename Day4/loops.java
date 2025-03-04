package Day4;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            System.out.println("While loop :");
            int i = 1;
            while (i <= n) {
                System.out.println(i);
                i++;
            }
        }
    }
}
