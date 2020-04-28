package L7;

public class Queue {
    private int firstElement;
    private int lastElement;
    private int[] queueArr;
    private int maxSize;


    public Queue(int size) {
        maxSize = size;
        queueArr = new int[maxSize];
        firstElement = 0;
        lastElement = -1;
    }

    public void insert(int element) {
        if(lastElement == maxSize - 1) {
            throw new IndexOutOfBoundsException("Queue is full");
        }
        queueArr[++lastElement] = element;
        if(firstElement == -1) firstElement++;
    }

    public int remove() {
        if(lastElement == -1) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        int element = queueArr[firstElement];
        for(int i = 1; i <= lastElement; i++) {
            queueArr[i - 1] = queueArr[i];
        }
        queueArr[lastElement] = -1;
        lastElement--;
        if(lastElement == -1) firstElement = -1;
        return element;
    }

    public int peek(){
        if(lastElement < 0) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        return queueArr[firstElement];
    }

    public boolean isEmpty(){
        return firstElement < 0;
    }

    public boolean isFull(){
        return lastElement == maxSize - 1;
    }

    public int getSize(){
        return lastElement + 1;
    }
}
