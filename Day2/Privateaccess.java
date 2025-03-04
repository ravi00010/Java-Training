package Day2;

class PrivateEx {
    private int secretcode = 222;

    void showcode() {
        System.out.println(secretcode);
    }
}

public class Privateaccess {
    public static void main(String[] args) {
        PrivateEx obj = new PrivateEx();
        obj.showcode();
    }
}
