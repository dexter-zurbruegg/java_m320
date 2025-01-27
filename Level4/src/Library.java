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

    public List<User> searchUsersByName(String name) {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                result.add(user);
            }
        }
        return result;
    }

    public User searchUserById(String userId) {
        for (User user : users) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    public List<Book> getBorrowedBooks() {
        List<Book> borrowedBooks = new ArrayList<>();
        for (Book book : books) {
            if (!book.isAvailable()) {
                borrowedBooks.add(book);
            }
        }
        return borrowedBooks;
    }

    public List<Transaction> getUserActivity(User user) {
        List<Transaction> userTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getUser().equals(user)) {
                userTransactions.add(transaction);
            }
        }
        return userTransactions;
    }
}