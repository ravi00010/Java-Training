package Day5;

public class EmailEx {
    public static void sendEmail(String name, String company) {
        String emaildraft = "dear " + name + " welcome to " + company + "!";
        System.out.println(emaildraft);
    }

    public static void main(String[] args) {
        sendEmail("Ravi", "Google");

    }
}
