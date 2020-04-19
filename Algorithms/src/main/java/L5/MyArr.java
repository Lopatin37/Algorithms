package L5;

import java.util.Arrays;

class MyArr{
    private int[] arr;
    private int size;

    public MyArr(int size) {
        this.size = 0;
        this.arr = new int[size];
    }

    public int binaryFind(int search) throws Exception {
        Arrays.sort(arr);
        return recBinaryFind(search, 0, size-1);
    }

    private int recBinaryFind(int searchKey, int low, int high) throws Exception
    {
        int curIn;
        curIn = (low + high ) / 2;
        if (arr[curIn] == searchKey) {
            System.out.println("true");
            return curIn;
        }
        else
        if(low > high)
            throw new Exception("Wrong element");
        else{
            if(arr[curIn] < searchKey)
                return recBinaryFind(searchKey, curIn+1, high);
            else
                return recBinaryFind(searchKey, low, curIn-1);
        }
    }

    public void insert(int value){
        int i;
        for(i=0;i<this.size;i++){
            if (this.arr[i]>value)
                break;
        }
        for(int j=this.size;j>i;j--){
            this.arr[j] = this.arr[j-1];
        }
        this.arr[i] = value;
        this.size++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i] + " ");
        }
        return stringBuilder.toString();
    }
}

class MyArrApp {
    public static void main(String[] args) throws Exception
    {
        MyArr arr = new MyArr(5);
        arr.insert(1);
        arr.insert(-2);
        arr.insert(3);
        arr.insert(6);
        arr.insert(-1);
        System.out.println(arr);
        int search = -3;

        System.out.println(arr.binaryFind(search));
    }
}
