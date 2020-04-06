package L2;
//Это класс для первого задания. Все необходимые методы описаны в классе Array
public class MainArray {
    public static void main(String[] args){
//        алгоритм отработал за
//        2838535 ms for bubbleSort
//        486689 ms for selectionSort
//        124686 ms for insertSort
        Array array = new Array(1000000);
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
