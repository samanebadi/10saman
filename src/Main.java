
package library.management;

public class Main {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        Book book = new Book("1984", "ISBN001");
        manager.addBook(book);

        System.out.println("Is book available? " + manager.isBookAvailable("ISBN001"));

        manager.addToWaitlist("ISBN001", "mem1");
        manager.addToWaitlist("ISBN001", "mem2");

        System.out.println("Next in waitlist: " + manager.getNextFromWaitlist("ISBN001"));
        System.out.println("Has waitlist? " + manager.hasWaitlist("ISBN001"));
    }
}
