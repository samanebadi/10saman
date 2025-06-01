
package library.management;

import datastructures.CustomQueue;

public class Book {
    private String title;
    private String isbn;
    private boolean isAvailable;
    private CustomQueue<String> waitlist;

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
        this.isAvailable = true;
        this.waitlist = new CustomQueue<>();
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public void addToWaitlist(String memberId) {
        waitlist.add(memberId);
    }

    public String getNextInWaitlist() {
        return waitlist.poll();
    }

    public boolean hasWaitlist() {
        return !waitlist.isEmpty();
    }
}
