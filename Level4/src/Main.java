package Level4.src;

public class Main {
    public static void main(String[] args) throws LibraryException {
        Library library = Library.getInstance();

        Book book = new Book("1984", "George Orwell", "12345", "Classic");
        library.addBook(book);

        User user = new User("John Doe", "JD123", "Admin");
        library.addUser(user);

        book.addObserver(user);

        book.setAvailable(true);
    }
}