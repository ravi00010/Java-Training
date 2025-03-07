package Day7;

abstract class Trainer {
    abstract void Teach();
    // abstract don't have implementation deatils
}

class Student extends Trainer {
    // child class only havind the implementation details(methods)
    void Teach() {
        System.out.println("training is going on");
    }
}

public class AbstractEX {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.Teach();
    }
}
