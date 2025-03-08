package FinalTest;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];

        System.out.println("Enter elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("The sum of the two matrices is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
