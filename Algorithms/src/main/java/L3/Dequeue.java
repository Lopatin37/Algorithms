package L3;

public class Dequeue<T> {
    private int firstElement;
    private int lastElement;
    private T[] dequeue;
    private final int DEFAULT_CAPACITY = 10;
    private int capacity;

    public Dequeue(){
        capacity = DEFAULT_CAPACITY;
        dequeue = (T[]) new Object[capacity];
        firstElement = (int)capacity/2;
        lastElement = firstElement;
    }

    public Dequeue(int capacity) {
        this.capacity = capacity;
        dequeue = (T[]) new Object[capacity];
        firstElement = (int)capacity/2;
        lastElement = firstElement;
    }

    public void insertFirst(T element){
        if(isFull()) {
            throw new IndexOutOfBoundsException("Dequeue is full");
        }
        if(firstElement != 0) {
            dequeue[--firstElement] = element;
        }
        if(firstElement == 0 && lastElement < capacity - 1) {
            for(int i = lastElement; i >= firstElement; i--) {
                dequeue[i + 1] = dequeue[i];
            }
            lastElement++;
            dequeue[firstElement] = element;
        }
        if(dequeue[lastElement] == null) lastElement--;
    }

    public void insertLast(T element) {
        if(isFull()) {
            throw new IndexOutOfBoundsException("Dequeue is full");
        }
        if(lastElement < capacity - 1) {
            dequeue[++lastElement] = element;
        }
        if(lastElement == capacity - 1 && firstElement > 0) {
            for(int i = firstElement; i <= lastElement; i++) {
                dequeue[i - 1] = dequeue[i];
            }
            firstElement--;
            dequeue[lastElement] = element;
        }
        if(dequeue[firstElement] == null) firstElement++;
    }

    public void removeFirst() {
        if(isEmpty()) {
            throw new IndexOutOfBoundsException("Dequeue if empty");
        }
        dequeue[firstElement] = null;
        firstElement++;
    }

    public void removeLast() {
        dequeue[lastElement] = null;
        lastElement--;
    }

    public T peekFirst() {
        if(isEmpty()) {
            throw new IndexOutOfBoundsException("Dequeue is empty");
        }
        return dequeue[firstElement];
    }

    public T peekLast() {
        if(isEmpty()) {
            throw new IndexOutOfBoundsException("Dequeue is empty");
        }
        return dequeue[lastElement];
    }

    public boolean isEmpty() {
        if(dequeue[firstElement] == null && dequeue[lastElement] == null) return true;
        return false;
    }

    public boolean isFull() {
        if(dequeue[firstElement] != null && firstElement == 0) {
            if(dequeue[lastElement] != null && lastElement == capacity - 1) {
                return true;
            }
        }
        return false;
    }
}
