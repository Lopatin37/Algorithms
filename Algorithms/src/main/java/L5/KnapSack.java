package L5;

import java.util.ArrayList;
class Knapsack
{
    public static int targetWeight = 20;
    public static int[] items = {11, 8, 7, 6, 5};
    public int startIndex = 0;
    public static void main(String[] args)
    {
        for(int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println("");
        System.out.println("---------------------------");
        ArrayList<Integer> resultItems = knapsack(targetWeight, 0);
        System.out.println("Solution:");
        for (Integer item : resultItems) {
            System.out.print(item + " ");
        }
    }
    public static ArrayList<Integer> knapsack(int pack, int startIndex)  // целевой вес, сам массив и индекс, с которого начинаются остальные элементы (возвращаемый тип - массив)
    {
        for(int i = startIndex; i < items.length; i++) {
            int item = items[i];                                 // сохраняем для наглядности текущий предмет
            if(startIndex == items.length - 1) {                 // если дошли до конца -
                return new ArrayList<>();                        // возвращаем пустой массив
            } else if(item > pack) {                             // если предмет весит больше, чем нужно -
                continue;                                        // продолжаем перебор
            } else if(item == pack) {                            // если же предмет именно такой, как надо -
                ArrayList<Integer> resultItems = new ArrayList<>();
                resultItems.add(item);                           // кладем его в результирующий массив
                return resultItems;                              // и возвращаем
            }
            ArrayList<Integer> resultItems = knapsack(pack - item, i + 1);       // берем текущий элемент массива как элемент, к которому будем подбирать остальные
            if(!resultItems.isEmpty()) {              // если из перебора вернулся не ноль -
                resultItems.add(item);                // кладем полученное число в результирующий массив
                return resultItems;                   // возвращаем массив
            }
        }
        return new ArrayList<>();                    // если ничего не подобрали - возвращаем пустой массив
    }
}
