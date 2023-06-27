package demo1.oops.excercise5;

import java.util.ArrayList;

public class BookMain5 {
    public static void main(String[] args){
        Book book1 = new Book("The C Programming", "Dinnis Ritchie", "9780131101630");
        Book book2 = new Book("An Introduction to Python", "Guido van", "9355423489");

        Book.add_Book(book1);
        Book.add_Book(book2);
        ArrayList<Book> bookCollection = Book.get_BookCollection();

        System.out.println("List of books: ");
        for (Book book: bookCollection){
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }

        Book.remove_Book(book1);
        System.out.println("After removing " + book1.getTitle()+ ": ");
        System.out.println("List of books: ");
        for (Book book: bookCollection){
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }

    }
}
