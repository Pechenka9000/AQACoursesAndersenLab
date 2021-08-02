package school.lesson2;

import java.util.Arrays;

/**
 * Задать одномерный массив и найти в нем
 * минимальный и максимальный элементы.
 */
public class Task10_1 {
    public static void main(String[] args) {
        int[] array = Utils.arrayCreatorRandoms(10, 31);
        arraysOut(array);
    }

    public static int arrayMin(int[] array){
        Arrays.sort(array);
        return array[0];
    }

    public static int arrayMax(int[] array){
        Arrays.sort(array);
        return array[9];
    }

    public static void arraysOut(int[] array){
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("min: " + arrayMin(array) + " max: " + arrayMax(array));
    }
}

