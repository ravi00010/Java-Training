package Day4;

import java.util.Scanner;

public class twoDarraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the arrays:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] array1 = new int[rows][cols];
        int[][] array2 = new int[rows][cols];
        int[][] sumArray = new int[rows][cols];

        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }

        System.out.println("The sum of the two arrays is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
