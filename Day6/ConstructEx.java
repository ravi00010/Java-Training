package Day6;

public class ConstructEx {

    String name;
    int num;
    // a constructor is a special method that is usec to initialize objects
    // it is automatically called when an object is created
    // 1.same name as the class
    // 2.no return type
    // 4.parametrized
    // overloading is possible
    // types: default constructor and parametrized constructor

    // constructor method
    ConstructEx() {
        // System.out.println("hi welcome");
        // default constructor
        name = "ravi";
        num = 123456789;
    }

    // parametrized constructor

    ConstructEx(String a, int b) {
        name = a;
        num = b;
    }

    void show() {
        System.out.println(name + " " + num);
    }

    public static void main(String[] args) {
        /*
         * int a ; // Not declared
         * System.out.println(a);
         */
        ConstructEx obj = new ConstructEx();
        ConstructEx obj1 = new ConstructEx("ramya", 1234567);
        System.out.println(obj);
        obj.show();
        obj1.show();
    }
}
