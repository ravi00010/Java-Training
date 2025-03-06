package Day6;

public class Books {

    String title;
    String author;
    int price;

    Books(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Coping constructor
    public Books(Books newbook) {
        title = newbook.title;
        author = newbook.author;
        price = newbook.price;
    }

    void show() {
        System.out.println(title + " " + author + " " + price);
    }

    public static void main(String[] args) {
        Books b1 = new Books("Java Programming", "James Gosling", 500);
        Books b2 = new Books(b1);
        b2.show();

    }
}
