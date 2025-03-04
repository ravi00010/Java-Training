package Day3;

public class CommanEx {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("enter provide your name and age as command line arguments");
            return;
        }

        String name = args[0];
        int age = Integer.parseInt(args[1]);

        System.out.println("Hello " + name + " , you are " + age + " years old.");
    }
}
