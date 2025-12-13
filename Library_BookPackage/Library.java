package Library_BookPackage;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>(); 
    }

    public void addBook(Book addBook) {
        books.add(addBook); 
    }

    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " - " + book.getAuthor() + " - " + book.getYear());
        }
    }
}
