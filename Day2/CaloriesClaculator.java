package Day2;

import java.util.Scanner;

public class CaloriesClaculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String activity;
            System.out.println("Enter the activity you did");
            activity = sc.nextLine();
            System.out.println("Enter the time you did the activity in minutes");
            float time = sc.nextFloat();
            double calories_burned = 0;
            if (activity.equals("Running")) {
                calories_burned = 10 * time;
            } else if (activity.equals("Swimming")) {
                calories_burned = 8 * time;
            } else if (activity.equals("Cycling")) {
                calories_burned = 6 * time;
            } else if (activity.equals("Walking")) {
                calories_burned = 12 * time;
            } else {
                System.out.println("Invalid activity");
            }
            System.out.println("Calories burned: " + calories_burned);
        }
    }
}
