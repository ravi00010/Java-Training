package Day4;

import java.util.Scanner;

public class accesspin {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int pin = 2103;
            int i = 0;
            while (i < 3) {
                System.out.println("Enter the pin: ");
                int n = sc.nextInt();
                if (pin == n) {
                    System.out.println("Access Granted");
                } else {
                    System.out.println("Access Denied");
                }
                i++;
            }
        }
    }
}
