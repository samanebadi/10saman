
package library.management;

import java.util.Date;

public class Transaction {
    private String memberId;
    private String isbn;
    private String action;
    private Date timestamp;

    public Transaction(String memberId, String isbn, String action) {
        this.memberId = memberId;
        this.isbn = isbn;
        this.action = action;
        this.timestamp = new Date();
    }

    public String getMemberId() { return memberId; }
    public String getIsbn() { return isbn; }
    public String getAction() { return action; }
    public Date getTimestamp() { return timestamp; }
}
