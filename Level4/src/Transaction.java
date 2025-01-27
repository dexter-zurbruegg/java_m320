package Level4.src;

import java.util.Date;

public class Transaction {
    private User user;
    private Book book;
    private Date transactionDate;
    private String transactionType;
    private double finePaid;
    private String status;

    public Transaction(User user, Book book, String transactionType) {
        this.user = user;
        this.book = book;
        this.transactionDate = new Date();
        this.transactionType = transactionType;
        this.finePaid = 0.0;
        this.status = "Pending";
    }

    public User getUser() { return user; }
    public Book getBook() { return book; }
    public Date getTransactionDate() { return transactionDate; }
    public String getTransactionType() { return transactionType; }
    public double getFinePaid() { return finePaid; }
    public String getStatus() { return status; }

    public void setFinePaid(double finePaid) {
        this.finePaid = finePaid;
    }

    public void markAsCompleted() {
        this.status = "Completed";
    }
}