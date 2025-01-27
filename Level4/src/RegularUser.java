package Level4.src;

import java.util.List;

public class RegularUser extends User {
    public RegularUser(String name, String userId) {
        super(name, userId, "Regular");
    }

    @Override
    public void borrowBook(Book book) throws LibraryException {
        Library library = Library.getInstance();
        library.borrowBook(this, book);
        super.borrowBook(book);
    }

    @Override
    public void returnBook(Book book) {
        double fine = book.calculateFine();
        if (fine > 0) {
            System.out.println("Fine to be paid: $" + fine);
        }
        Library library = Library.getInstance();
        library.returnBook(this, book);
        super.returnBook(book);
    }

    public void viewRecommendations() {
        Catalog catalog = Library.getInstance().getCatalog();
        for (String preference : getPreferences()) {
            List<Book> recommendedBooks = catalog.searchByCategory(preference);
            System.out.println("Recommended books in " + preference + ":");
            for (Book book : recommendedBooks) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}