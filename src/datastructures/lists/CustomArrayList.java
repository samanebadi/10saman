
package datastructures;

import java.util.Arrays;

public class CustomArrayList<T> {
    private Object[] array;
    private int size;

    public CustomArrayList() {
        array = new Object[10];
        size = 0;
    }

    public void add(T element) {
        if (size == array.length) {
            array = Arrays.copyOf(array, size * 2);
        }
        array[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();
        return (T) array[index];
    }

    public int size() {
        return size;
    }
}
