package demo1.oops.excercise5;

import java.util.ArrayList;

public class Book {

    private String title;
    private String author;
    private String ISBN;

    public static ArrayList<Book> bookCollection = new ArrayList<Book>();

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static void add_Book(Book book){
        bookCollection.add(book);
    }

    public static void remove_Book(Book book){
        bookCollection.remove(book);
    }

    public static ArrayList<Book> get_BookCollection(){
        return bookCollection;
    }
}
