package Level4.src;

import java.util.Date;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;
    private Date dueDate;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
        this.dueDate = null;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public double calculateFine() {
        if (dueDate == null || isAvailable) {
            return 0.0;
        }
        Date currentDate = new Date();
        if (currentDate.after(dueDate)) {
            long diff = currentDate.getTime() - dueDate.getTime();
            long daysOverdue = diff / (24 * 60 * 60 * 1000);
            return daysOverdue * 5; // $5 fine per day
        }
        return 0.0;
    }
}