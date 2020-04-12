package L3;

import java.util.EmptyStackException;

public class Queue<T>{
    private int firstElement;
    private int lastElement;
    private T[] queue;
    private final int DEFAULT_CAPACITY = 10;
    private int capacity;

    public Queue(){
        capacity = DEFAULT_CAPACITY;
        queue = (T[]) new Object[capacity];
        firstElement = 0;
        lastElement = -1;
    }

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = (T[]) new Object[capacity];
        firstElement = 0;
        lastElement = -1;
    }

    public void insert(T element) {
        if(lastElement == capacity - 1) {
            throw new IndexOutOfBoundsException("Queue is full");
        }
        queue[++lastElement] = element;
    }

    public void remove() {
        if(lastElement == -1) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        for(int i = 1; i <= lastElement; i++) {
            queue[i - 1] = queue[i];
        }
        queue[lastElement] = null;
        lastElement--;
        if(lastElement == -1) firstElement = -1;
    }

    public T peek(){
        if(lastElement < 0) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        return queue[firstElement];
    }

    public boolean isEmpty(){
        return firstElement < 0;
    }

    public boolean isFull(){
        return lastElement == capacity - 1;
    }

    public int getSize(){
        return lastElement + 1;
    }
}
