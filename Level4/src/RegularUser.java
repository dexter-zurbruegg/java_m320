package Level4.src;

public class RegularUser extends User {
    public RegularUser(String name, String userId) {
        super(name, userId);
    }

    public void borrowBook(Book book) throws LibraryException {
        Library.getInstance().borrowBook(this, book);
    }

    public void returnBook(Book book) {
        Library.getInstance().returnBook(this, book);
    }
}