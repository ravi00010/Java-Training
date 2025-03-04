package Day4;

public class string {
    public static void main(String[] args) {
        // String name = "Ravi ";
        // name = name + " welcome";
        // System.out.println(name);

        StringBuilder name = new StringBuilder(" Ravi");
        name.append(" welcome"); // editing the existing string
        System.out.println(name);

        StringBuffer name1 = new StringBuffer("manit ");
        name1.append(" bhai joginder ");
        System.out.println(name1);
        // string buffer is slower than string builder
        // threadsafe

        name1.insert(6, "is a");
        System.out.println(name1);

        name.replace(1, 4, "ankit ");
        System.out.println(name);

        name.delete(1, 4);
        System.out.println(name);

        name.reverse();
        System.out.println(name);

        int size = name1.length();
        System.out.println(size);

        char ch = name1.charAt(9);
        System.out.println(ch);

        name1.setCharAt(8, ch);
        System.out.println(name1);

        // key takeaways : faster, and efficient memory storage

    }
}
