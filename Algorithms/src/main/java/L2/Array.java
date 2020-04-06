package L2;

public class Array {
    private int length;
    private int[] arr;

    public Array(int length){
        this.length = length;
        arr = new int[length];
    }

    public int[] getArr(){
        return arr.clone();
    }

    public void remove(int element){
        for(int i = 0; i < length; i++){
            if(arr[i] == element){
                for(int j = i + 1; j < length; j++){
                    arr[j - 1] = arr[j];
                }
                length--;
                break;
            }
        }
    }

    public void add(int element){
        if(length < arr.length){
            arr[length] = element;
            length++;
            return;
        }
        int[] arr2 = new int[length + 1];
        for(int i = 0; i < length; i++){
            arr2[i] = arr[i];
        }
        arr2[length] = element;
        arr = arr2;
        length++;
    }

    public int search(int element){
        int i;
        boolean isFound = false;
        for(i = 0; i < length; i++){
            if(arr[i] == element) {
                isFound = true;
                break;
            }
        }
        if(isFound) return i;
        else return -1;
    }

    public void fillArr(){
        for(int i = 0; i < length; i++){
            arr[i] = (int)(Math.random() * 10);
        }
    }

    public void printArray(){
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void bubbleSort(){
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for(int i = 0; i < length - 1; i++) {
                if(arr[i] > arr[i + 1]) {
                    isSorted = false;
                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }

    }

    public void selectionSort() {
        for(int i = 0; i < length - 1; i++) {
            int min = arr[i];
            int min_i = i;
            for(int j = i + 1; j < length; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if(min_i != i) {
                int buf = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = buf;
            }
        }
    }

    public void insertSort(){
        for(int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

}
