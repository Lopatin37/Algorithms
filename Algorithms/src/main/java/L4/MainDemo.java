package L4;


import java.util.HashMap;
import java.util.Map;

public class MainDemo {
    public static void main(String[] args){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.insertFirst("Sasha");
        myLinkedList.insertFirst("Dima");
        System.out.println(myLinkedList.toString());
        myLinkedList.insertLast("Artem");
        System.out.println(myLinkedList.toString());

        Map<Integer, String> hm = new HashMap<>();
        hm.put(1,"Artem");
        hm.put(2,"Dima");
        System.out.println(hm.get(2));
        hm.put(3,"Vika");
        System.out.println(hm.toString());





    }
}
