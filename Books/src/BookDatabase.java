import java.util.HashMap;
import java.util.Map;

public class BookDatabase {

    // create a private static instance of the class
    private static BookDatabase instance;

    // create a private constructor to prevent outside instantiation
    private BookDatabase() {
    }

    // create a public static method to get the instance of the class
    public static BookDatabase getInstance() {
        if (instance == null) {
            instance = new BookDatabase();
        }
        return instance;
    }

    // create a hashmap to store the book data
    private Map<Integer, Book> bookMap = new HashMap<Integer, Book>();

    // method to add book to the database
    public void addBook(Book book) {
        bookMap.put(book.getId(), book);
    }

    // method to remove book from the database
    public String removeBook(int bookId) {
        return "The " + bookMap.remove(bookId) + " has been removed.";
    }


    // method to display all books in the database
    public void displayAllBooks() {
        for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}