package Level4.src;

import java.util.List;

public class Main {
    public static void main(String[] args) throws LibraryException {
        Library library = Library.getInstance();

        Book book1 = new Book("1984", "George Orwell", "12345", "Classic");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "67890", "Classic");
        library.addBook(book1);
        library.addBook(book2);

        AdminUser adminUser  = new AdminUser ("Alice Smith", "AS123");
        User regularUser  = new RegularUser ("John Doe", "JD123");
        library.addUser (adminUser );
        library.addUser (regularUser );

        System.out.println("Available Books:");
        for (Book book : library.getBorrowedBooks()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

        try {
            System.out.println("\n" + regularUser .getName() + " is trying to borrow '1984'.");
            library.borrowBook(regularUser , book1);
            System.out.println(regularUser .getName() + " successfully borrowed '1984'.");
        } catch (LibraryException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nBorrowed Books:");
        List<Book> borrowedBooks = library.getBorrowedBooks();
        for (Book book : borrowedBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

        System.out.println("\n" + regularUser .getName() + " is returning '1984'.");
        library.returnBook(regularUser , book1);
        System.out.println(regularUser .getName() + " successfully returned '1984'.");

        System.out.println("\nAvailable Books after return:");
        for (Book book : library.getBorrowedBooks()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

        System.out.println("\nGenerating borrowed books report:");
        adminUser.generateBorrowedBooksReport();
    }
}