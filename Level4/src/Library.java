package Level4.src;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library instance;
    private List<Book> books;
    private List<User> users;
    private List<Transaction> transactions;
    private Catalog catalog;

    private Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.transactions = new ArrayList<>();
        this.catalog = new Catalog();
    }

    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
        catalog.addBook(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void borrowBook(User user, Book book) throws LibraryException {
        if (!book.isAvailable()) {
            throw new LibraryException("Book is not available");
        }
        book.setAvailable(false);
        user.borrowBook(book);
        transactions.add(new Transaction(user, book, "Borrow"));
    }

    public void returnBook(User user, Book book) {
        book.setAvailable(true);
        user.returnBook(book);
        transactions.add(new Transaction(user, book, "Return"));
    }

    public Catalog getCatalog() {
        return catalog;
    }
}
