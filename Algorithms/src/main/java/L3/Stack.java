package L3;

import java.util.EmptyStackException;

public class Stack<T>{
    private int mark;
    private T[] stack;
    private final int DEFAULT_CAPACITY = 10;
    private int capacity;

    public Stack(){
        capacity = DEFAULT_CAPACITY;
        stack = (T[]) new Object[capacity];
        mark = -1;
    }

    public Stack(int capacity) {
        this.capacity = capacity;
        stack = (T[]) new Object[capacity];
        mark = -1;
    }

    public void push(T element) {
        if(mark == capacity - 1) {
            throw new StackOverflowError("Stack is full");
        }
        mark++;
        stack[mark] = element;
    }

    public void pop() {
        if(mark < 0) {
            throw new EmptyStackException();
        }
        stack[mark] = null;
        mark--;
    }

    public T peek(){
        if(mark < 0) {
            throw new EmptyStackException();
        }
        return stack[mark];
    }

    public boolean isEmpty(){
        return mark < 0;
    }

    public boolean isFull(){
        return mark == capacity - 1;
    }

    public int getSize(){
        return mark + 1;
    }
}
