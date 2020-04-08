package L3;

import java.util.ArrayList;

public class Main {
    public  static void main(String[] args){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.isFull());
        System.out.println(stack.isEmpty());
        System.out.println(stack.getSize());

        System.out.println();

        Queue queue = new Queue();
        queue.insert("1");
        queue.insert("2");
        queue.insert("3");
        queue.insert("4");
        System.out.println(queue.peek());
        System.out.println(queue.getSize());
        queue.remove();
        System.out.println(queue.getSize());
        System.out.println(queue.peek());

        System.out.println();

        Dequeue dequeue = new Dequeue();
        dequeue.insertLast("1");
        System.out.println(dequeue.peekFirst() + " " + dequeue.peekLast());
        dequeue.insertFirst("2");
        System.out.println(dequeue.peekFirst() + " " + dequeue.peekLast());
        dequeue.removeLast();
        System.out.println(dequeue.peekFirst() + " " + dequeue.peekLast());

        System.out.println(ReverseString.reverse("Hello World!*"));









    }


}
