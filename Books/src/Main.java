public class Main {
    public static void main(String[] args) {
        // get instance of the book database
        BookDatabase bookDatabase = BookDatabase.getInstance();

        System.out.println("list of your Books: \n");

        // add books to the database
        bookDatabase.addBook(new Book(1, "Genesis"));
        bookDatabase.addBook(new Book(2, "Exodus"));
        bookDatabase.addBook(new Book(3, "Leviticus"));
        bookDatabase.addBook(new Book(4, "1 John"));
        bookDatabase.addBook(new Book(5, "1 Peter"));


        // display all books in the database
        bookDatabase.displayAllBooks();

        // remove a book from the database
        System.out.println("================================================\n");
        System.out.println(bookDatabase.removeBook(3));


        // updated remaining available books
        System.out.println("\nUpdated remaining available books\n");

        // display all books in the database again
        bookDatabase.displayAllBooks();


    }
}