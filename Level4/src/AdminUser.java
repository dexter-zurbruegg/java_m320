package Level4.src;

import java.util.List;

public class AdminUser extends User {
    public AdminUser(String name, String userId) {
        super(name, userId, "Admin");
    }

    public void addBook(Book book) {
        Library.getInstance().addBook(book);
    }

    public void removeBook(Book book) {
        Library.getInstance().removeBook(book);
    }

    public void removeUser(User user) {
        Library.getInstance().removeUser(user);
    }

    public void generateBorrowedBooksReport() {
        List<Book> borrowedBooks = Library.getInstance().getBorrowedBooks();
        System.out.println("Borrowed Books Report:");
        for (Book book : borrowedBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}