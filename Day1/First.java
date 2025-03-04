package Day1;

public class First {
    public static void main(String[] args) {
        int a = 10;
        int g = 10;
        float b = 20.0f;
        char c = 'a';
        boolean d = true;
        String s = "Hello";

        float sum, multiply, sub, divide;
        sum = a + b;
        multiply = a * b;
        sub = a - b;
        divide = b / a;

        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Division: " + divide);
        System.out.println("Multiplication: " + multiply);
        System.out.println("Boolean Value: " + d);
        System.out.println("String: " + s);
        System.out.println("Character: " + c);

        // Operators

        a++;
        System.out.println("After a++: " + a);
        a -= 3;
        System.out.println("After a -= 3: " + a);
        a *= 3;
        System.out.println("After a *= 3: " + a);
        a /= 2;
        System.out.println("After a /= 2: " + a);
        a %= 3;
        System.out.println("After a %= 3: " + a);
        a = a & 3;
        System.out.println("After a &= 3: " + a);
        a |= 10;
        System.out.println("After a |= 10: " + a);
        a ^= 3;
        System.out.println("After a ^= 3: " + a);
        a >>= 3;
        System.out.println("After a >>= 3: " + a);

        // Comparison operator
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical Operator
        d = a > b && a >= g;
        System.out.println(d);
        d = a > b || a >= g;
        System.out.println(d);
        d = !(a > b || a >= g);
        System.out.println(d);

        if (a % 9 == 0) {
            System.out.println("HU");
            ;
        } else {
            System.out.println("Hi");
        }
    }
}
