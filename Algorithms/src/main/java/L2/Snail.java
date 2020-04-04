package L2;

//заполняет матрицу по спирали
public class Snail {
    public static void main(String[] args){
        Snail snail = new Snail();
        snail.fillSnail();
        snail.print();
    }
    private int line;
    private int column;
    private int[][] arr;
    private int current_i;
    private int current_j;
    private int number;
    public Snail(){
        line = (int)(Math.random() * 2 + 5);
        column = (int)(Math.random() * 2 + 5);
        current_i = 0;
        current_j = 0;
        number = 2;
        arr = new int[line][column];
        for(int i = 0; i < line; i++)
            for(int j = 0; j < column; j++)
                arr[i][j] = -1;
    }

    public void fillSnail(){
        if(line > 0 && column > 0) {
            arr[0][0] = 1;
        }
        while(number <= line * column) {
            fillRight();
            fillBottom();
            fillLeft();
            fillTop();
        }
    }

    public void fillRight() {
        current_j++;
        while(current_j < column && arr[current_i][current_j] == -1){
            arr[current_i][current_j] = number;
            number++;
            current_j++;
        }
        current_j--;
    }

    public void fillLeft() {
        current_j--;
        while(current_j >= 0 && arr[current_i][current_j] == -1){
            arr[current_i][current_j] = number;
            number++;
            current_j--;
        }
        current_j++;
    }

    public void fillTop() {
        current_i--;
        while (current_i >= 0 && arr[current_i][current_j] == -1) {
            arr[current_i][current_j] = number;
            number++;
            current_i--;
        }
        current_i++;
    }

    public void fillBottom() {
        current_i++;
        while (current_i < line && arr[current_i][current_j] == -1) {
            arr[current_i][current_j] = number;
            number++;
            current_i++;
        }
        current_i--;
    }

    public void print(){
        for(int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
