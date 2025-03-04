package Day4;

//import java.lang.reflect.Array;

public class ArrayEx {
    // array is a collection of elements of same data type stored in continous
    // memory loction.
    // easier to manage large amount of data efficiently
    public static void main(String[] args) {
        // declaration
        // int[] num = new int [8];
        // initialization
        int[] num = { 1, 2, 3, 4, 5, 6, 7 };
        // using for loop
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        System.out.println("reverse:");

        for (int i = num.length; i > 0; i--) {
            System.out.println(num[i - 1]);
        }

        // using for each loop
        for (int i : num) {
            System.out.println(i);
        }

        // 2D array

        /*
         * int[][] twodimentional = {
         * { 1, 2, 3 },
         * { 4, 5, 6 }
         * };
         * 
         * // 3D array
         * int[][][] threedimentional = {
         * {
         * 
         * }
         * };
         */

        // jagged array
        // 2D array where each row can have different number of columns

        int[][] jagged = new int[3][];
        jagged[0] = new int[] { 1, 2 };
        jagged[1] = new int[] { 1, 2, 3 };
        jagged[2] = new int[] { 1, 2, 3, 4 };

    }
}
