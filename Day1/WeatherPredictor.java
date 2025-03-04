package Day1;

import java.util.Scanner;

public class WeatherPredictor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the temperature");
            double temperature = sc.nextDouble();

            if (temperature > 30) {
                System.out.println("Weather Condition: Hot");
            } else if (temperature >= 20 && temperature <= 30) {
                System.out.println("Weather Condition: Warm");
            } else if (temperature >= 10 && temperature < 20) {
                System.out.println("Weather Condition: Moderate");
            } else {
                System.out.println("Weather Condition: Cold");
            }
        }

    }
}