package Day2;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the marks you got");
            int marks = sc.nextInt();
            String grade = "";
            switch (marks / 10) {
                case 9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
                default:
                    grade = "F";
            }
            System.out.println("Your grade is: " + grade);
        sc.close();
    }
}
