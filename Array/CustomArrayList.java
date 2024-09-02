
import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList<E> {
    // initial capacity
    private static final int DEFAULT_CAPACITY = 10;
    // Underlying array to store the elements
    private Object[] elementData;

    // number of elements in the custom ArrayList
    private int size = 0;

    // Constructor to initialize the custom ArrayList with default  capacity
    public CustomArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    // Constructor to initialize the ArrayList with a specific initial capacity
    public CustomArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            elementData = new Object[DEFAULT_CAPACITY];
        } else {
            System.out.println("Illegal Capacity : "+initialCapacity);
            //throw IllegalArgumentException("Illegal Capacity : "+initialCapacity);
        }
    }

    // Method to get the size of the ArrayList
    public int size() {
        return size;
    }

    // Method to check if the ArrayList is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Helper of add(E element) : Method to ensure the ArrayList has enough capacity to add more elements
    public void ensureCapacity() {
        if (size == elementData.length) {
            int newCapacity = elementData.length + ((elementData.length)/2);
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
    }


    // Method to add an element to the end of the ArrayList
    public boolean add(E element) {
        ensureCapacity();
        elementData[size++] = element;
        return true;
    }

    // Method to add an element at a specific index
    public void add(int index, E element) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index : "+ index +", Size: "+size);
        }
        ensureCapacity();
        System.arraycopy(elementData, index, elementData, index+1, size-index);
        elementData[index] = element;
        size++;
    }

    // Method to remove an element from a specific index
    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index : "+ index +", Size: "+size);
        }
        E oldValue = (E) elementData[index]; // [10,20,30,40,50] size=5, capacity=5   | index = 2
        int numMoved = size - index - 1;  // numMoved = 5 - 2 - 1 = 2
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null; // clear to let GC do it's work
        return oldValue;
    }




    @Override
    public String toString() {
        return "CustomArrayList{" +
                "elementData=" + Arrays.toString(elementData) +
                '}';
    }

   
}