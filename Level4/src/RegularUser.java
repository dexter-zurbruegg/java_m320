package Level4.src;

public class RegularUser extends User {
    public RegularUser(String name, String userId) {
        super(name, userId);
    }

    @Override
    public void borrowBook(Book book) throws LibraryException {
        Library.getInstance().borrowBook(this, book);
        super.borrowBook(book);
    }

    @Override
    public void returnBook(Book book) {
        double fine = book.calculateFine();
        if (fine > 0) {
            System.out.println("Fine to be paid: $" + fine);
        }
        Library.getInstance().returnBook(this, book);
        super.returnBook(book);
    }

    public void viewBorrowedBooks() {
        System.out.println("Books borrowed by " + getName() + ":");
        for (Book book : getBorrowedBooks()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}