package school.lesson2;

import java.util.Arrays;

/**
 * Написать метод, которому на вход подается одномерный массив и число n (может
 * быть положительным, или отрицательным), при этом метод должен сместить все
 * элементы массива на n позиций. Элементы смещаются циклично. Для усложнения
 * задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1
 * (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
 * При каком n в какую сторону сдвиг можете выбирать сами.
 * P.s. Отрицательное число - сдвиг влево. Положительное - сдвиг вправо.
 * P.s.s. Пока решил не разбивать на блоки воизбежание путаницы в коде.
 */
public class Task13 {
    public static void main(String[] args) {
        arrayTrain(new int[]{1,2,3,4,5},1);
    }

    public static void arrayTrain(int[] array, int n) {
        if (n < 0) {
            n = -n;
            for (int i = 1; i <= n; i++) {
                int a = array[0];
                for (int x = 0; x < array.length; x++) {
                    if (x == array.length - 1) {
                        array[x] = a;
                    } else {
                        array[x] = array[x+1];
                    }
                }
            }
            System.out.println(Arrays.toString(array));
        } else {
            for (int z = 1; z <= n; z++) {
                int b = array[array.length-1];
                for (int y = array.length-1; y >=0; y--) {
                    if (y == 0) {
                        array[y] = b;
                    } else {
                        array[y] = array[y-1];
                    }
                }
            } System.out.println(Arrays.toString(array));
        }
    }
}

