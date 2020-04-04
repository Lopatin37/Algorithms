package L2;

public class MainArray {
    public static void main(String[] args){
        Array array = new Array(100000);
        array.fillArr();
        long time = System.currentTimeMillis();
        array.bubbleSort();
        System.out.println(System.currentTimeMillis() - time + " ms for bubbleSort");

        array.fillArr();
        time = System.currentTimeMillis();
        array.selectionSort();
        System.out.println(System.currentTimeMillis() - time + " ms for selectionSort");

        array.fillArr();
        time = System.currentTimeMillis();
        array.insertSort();
        System.out.println(System.currentTimeMillis() - time + " ms for insertSort");
    }
}
