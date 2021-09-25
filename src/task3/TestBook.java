package task3;
import java.lang.*;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Gribaedov", 437);
        Book b2 = new Book("Lomonosov", 720);
        Book b3 = new Book("Lermantov");
        b3.setPage(373);
        System.out.println(b1);
        b1.intoPageGram();
        b2.intoPageGram();
        b3.intoPageGram();
    }
}
