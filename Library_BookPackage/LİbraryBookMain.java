package Library_BookPackage;

public class LÝbraryBookMain {

	public static void main(String[] args) {
		Book book1 = new Book("Harry Potter", "J.K. Rowling", 1997);
		Book book2 = new Book("Lord of the Rings", "J.R.R. Tolkien", 1954);
		Book book3 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
		Book book4 = new Book("1984", "George Orwell", 1949);
		Book book5 = new Book("Pride and Prejudice", "Jane Austen", 1813);
		Library library = new Library();
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book4);
		library.addBook(book5);
		library.printAllBooks();

	}

}
