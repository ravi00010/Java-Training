package Day5;

public class MethodEx {

    // method
    public static int add(int a, int b) {
        return a + b;
    }

    // static keyword can be accessed without creating an object of the class
    public static void main(String[] args) {
        int sum = add(10, 20);
        System.out.println("Sum is: " + sum);
    }
}
