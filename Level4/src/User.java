package Level4.src;

import java.util.ArrayList;
import java.util.List;

public class User implements Observer {
    private String name;
    private String userId;
    private List<Book> borrowedBooks;
    private double totalFines;
    private String role;
    private List<String> preferences;

    public User(String name, String userId, String role) {
        this.name = name;
        this.userId = userId;
        this.borrowedBooks = new ArrayList<>();
        this.totalFines = 0.0;
        this.role = role;
        this.preferences = new ArrayList<>();
    }

    // Getters and setters
    public String getName() { return name; }
    public String getUserId() { return userId; }
    public List<Book> getBorrowedBooks() { return borrowedBooks; }
    public double getTotalFines() { return totalFines; }
    public String getRole() { return role; }
    public List<String> getPreferences() { return preferences; }

    public void addPreference(String category) {
        if (!preferences.contains(category)) {
            preferences.add(category);
        }
    }

    public void addFine(double fine) {
        this.totalFines += fine;
    }

    public void payFine(double amount) {
        if (amount > totalFines) {
            totalFines = 0.0;
        } else {
            totalFines -= amount;
        }
    }

    public void borrowBook(Book book) throws LibraryException {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for " + name + ": " + message);
    }
}

