package Day5;

public class maximaum {
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int max = max(10, 9);
        System.out.println("Max is: " + max);
    }
}
