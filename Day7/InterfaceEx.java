package Day7;

//public
interface Student {
    // automatically
    // public static final
    int num = 80;

    // take it as final int
    void speak();
    // abstract methods
}

class Trainer implements Student {
    // must implement all the methods of interface
    public void speak() {
        System.out.println("Training is going on");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        Trainer t = new Trainer();
        t.speak();
    }
}
