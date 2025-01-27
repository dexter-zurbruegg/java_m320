package Level4.src;

import java.util.List;

public class AdminUser extends User {
    public AdminUser(String name, String userId) {
        super(name, userId);
    }

    public void addBook(Book book) {
        Library.getInstance().addBook(book);
    }

    public void removeBook(Book book) {
        Library.getInstance().removeBook(book);
    }

    public void collectFine(User user, double amount) {
        user.payFine(amount);
    }

    public void generateBorrowedBooksReport() {
        List<Book> borrowedBooks = Library.getInstance().getBorrowedBooks();
        System.out.println("Borrowed Books Report:");
        for (Book book : borrowedBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}