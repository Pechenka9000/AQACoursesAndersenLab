package school.lesson5.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Написать метод, который меняет два элемента массива местами
 * (массив может быть любого ссылочного типа);
 * (Условие не уточняет, поэтому решил выполнить задачу в общем виде).
 */

public class MainClass {
    public static void main(String[] args) throws Exception {
        System.out.println(swapElements(new ArrayList<Integer>(), 3, 7 ));
    }

    public static <T> List<T> swapElements(List<T> list, int index1, int index2) {
        T firstElement = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, firstElement);
        return list;
    }
}
