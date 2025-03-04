package Day2;

class DefaultEx {
    int number = 30;
}

public class Deafultaccess {
    public static void main(String[] args) {
        DefaultEx obj = new DefaultEx();
        System.out.println(obj.number);
    }
}
