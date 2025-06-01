
package datastructures;

import java.util.LinkedList;

public class CustomQueue<T> {
    private LinkedList<T> list;

    public CustomQueue() {
        list = new LinkedList<>();
    }

    public void add(T item) {
        list.addLast(item);
    }

    public T poll() {
        return list.isEmpty() ? null : list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public T peek() {
        return list.peekFirst();
    }
}
