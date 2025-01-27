package Level4.src;

import java.util.Date;

public class Transaction {
    private User user;
    private Book book;
    private Date transactionDate;
    private String transactionType;

    public Transaction(User user, Book book, String transactionType) {
        this.user = user;
        this.book = book;
        this.transactionDate = new Date();
        this.transactionType = transactionType;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }
}
