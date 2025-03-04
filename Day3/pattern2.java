package Day3;

public class pattern2 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 3 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
