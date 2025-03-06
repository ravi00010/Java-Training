package Day6;

class Student {
    void speak() {
        System.out.println("yes students are public speakers ");
    }
}

// child class
class Teacher extends Student {
    void teach() {
        System.out.println("yes they are teachers");
    }
}
// multilevel inheritance

class Principle extends Teacher {
    void Manage() {
        System.out.println("principle mam");
    }
}

// Hierarchical inheritance

class Teacher2 extends Student {
    void teach2() {
        System.out.println("another teacher");
    }
}

public class InheritanceEx {
    public static void main(String[] args) {
        Teacher obj = new Teacher();
        Principle obj1 = new Principle();
        Teacher2 obj2 = new Teacher2();
        obj2.teach2();
        obj1.Manage();
        obj1.teach();
        obj.speak();
        // obj.teach();

    }
}
// inheritance is oops concept
// that allows onr class to inherit properties
// and behaviour
