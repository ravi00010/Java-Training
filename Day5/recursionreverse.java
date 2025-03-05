package Day5;

public class recursionreverse {
    static void reverse(String s) {
        if (s.length() == 0) {
            return;
        } else {
            reverse(s.substring(1));
            System.out.print(s.charAt(0));
        }
    }

    public static void main(String[] args) {
        String s = "Ravi";
        reverse(s);
    }
}
