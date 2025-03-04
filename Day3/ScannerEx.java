package Day3;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();
        System.out.println("Are you married? (true/false):");
        boolean isMarried = sc.nextBoolean();
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(isMarried);
        sc.close();
    }
}
