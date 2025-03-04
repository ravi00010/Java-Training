package Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferEx {
    public static void main(String[] args) throws IOException {
        InputStreamReader name = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(name);

        System.out.println("Enter your name:");
        String myname = br.readLine();

        System.out.println("Enter your age:");
        int age = Integer.parseInt(br.readLine());

        System.out.println("HEllo " + myname + "!");
        System.out.println("You are " + age + " years old.");

        br.close();
    }
}
