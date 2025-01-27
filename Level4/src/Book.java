package Level4.src;

import java.util.Date;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;
    private Date dueDate;
    private String category;
    private double rating;
    private int borrowCount;

    public Book(String title, String author, String ISBN, String category) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
        this.dueDate = null;
        this.category = category;
        this.rating = 0.0;
        this.borrowCount = 0;
    }

    // Getters and setters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
    public Date getDueDate() { return dueDate; }
    public void setDueDate(Date dueDate) { this.dueDate = dueDate; }
    public String getCategory() { return category; }
    public double getRating() { return rating; }
    public int getBorrowCount() { return borrowCount; }

    public void updateRating(double newRating) {
        this.rating = (this.rating * borrowCount + newRating) / (borrowCount + 1);
    }

    public void incrementBorrowCount() {
        this.borrowCount++;
    }

    public double calculateFine() {
        if (dueDate == null || isAvailable) {
            return 0.0;
        }
        Date currentDate = new Date();
        if (currentDate.after(dueDate)) {
            long diff = currentDate.getTime() - dueDate.getTime();
            long daysOverdue = diff / (24 * 60 * 60 * 1000);
            return daysOverdue * 5;
        }
        return 0.0;
    }
}