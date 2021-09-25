package task3;
import java.lang.*;

public class Book {
    private String author;
    private int page;

    public Book(String a, int p) {
        author = a;
        page = p;
    }

    public Book(String a) {
        author = a;
        page = 100;
    }

    public Book() {
        author = "Pushkin";
        page = 100;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor(String author) {
        return author;
    }
    public int getPage() {
        return page;
    }

    public String toString(){
        return this.author+", pages "+this.page;
    }

    public void intoPageGram(){
        System.out.println(author+"'s book has "+page+" pages, which is equal to "+page*2+" grams");
    }
}
