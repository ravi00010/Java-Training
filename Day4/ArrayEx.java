package Day4;

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
    }
}
