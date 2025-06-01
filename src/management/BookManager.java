
package library.management;

import datastructures.CustomHashMap;

public class BookManager {
    private CustomHashMap<String, Book> books;

    public BookManager() {
        books = new CustomHashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public Book getBookByIsbn(String isbn) {
        return books.get(isbn);
    }

    public boolean isBookAvailable(String isbn) {
        Book book = books.get(isbn);
        return book != null && book.isAvailable();
    }

    public void addToWaitlist(String isbn, String memberId) {
        Book book = books.get(isbn);
        if (book != null) {
            book.addToWaitlist(memberId);
        }
    }

    public String getNextFromWaitlist(String isbn) {
        Book book = books.get(isbn);
        return (book != null) ? book.getNextInWaitlist() : null;
    }

    public boolean hasWaitlist(String isbn) {
        Book book = books.get(isbn);
        return book != null && book.hasWaitlist();
    }
}
