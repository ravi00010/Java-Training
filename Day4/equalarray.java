package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class equalarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[5];

        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < 5; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < 5; i++) {
            array2[i] = sc.nextInt();
        }

        if (areArraysEqual(array1, array2)) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }

        sc.close();
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
}
