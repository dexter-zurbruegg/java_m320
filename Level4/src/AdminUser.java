package Level4.src;

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
}


