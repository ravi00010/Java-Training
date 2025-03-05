package Day1;

class Greatest {

    static int gcd(int a, int b) {

        if (b == 0)
            return a;

        else
            return gcd(b, Math.abs(a - b));
    }

    public static void main(String[] args) {
        int a = 30, b = 20;
        System.out.println("GCD = " + gcd(a, b));
    }
}