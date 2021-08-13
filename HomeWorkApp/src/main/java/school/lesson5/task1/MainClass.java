package school.lesson5.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Написать метод, который меняет два элемента массива местами
 * (массив может быть любого ссылочного типа);
 */

public class MainClass {
    public static void main(String[] args) throws Exception {
        List<Integer>list = new ArrayList<>();
        for(int i = 0; i < 15; i++) {
            list.add(i);
        }
        System.out.println(swapElements(list, 3, 7 )); // Вывел в консоль для наглядности;
    }

    public static <T> List<T> swapElements(List<T> list, int index1, int index2) {
        T firstElement = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, firstElement);
        return list;
    }
}
