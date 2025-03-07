package Day7;

abstract class DataBase {
    abstract void connecting();

    void disconnect() {
        System.out.println("disconnected");
    }
}

class Mydata extends DataBase {
    @Override
    void connecting() {
        // code block for connecting
        System.out.println("connected to database");
    }

}

public class Abstract2Ex {
    public static void main(String[] args) {
        Mydata db = new Mydata();
        db.connecting();
    }

}
