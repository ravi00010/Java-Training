package Day6;

public class StudentInfo {
    String name;
    char ch;
    int roll;

    StudentInfo(String name, char ch, int roll) {
        this.name = name;
        this.ch = ch;
        this.roll = roll;
    }

    void show() {
        System.out.println(name + " " + ch + " " + roll);
    }

    public static void main(String[] args) {
        StudentInfo obj = new StudentInfo("Ravi", 'A', 001);
        obj.show();
    }
}
