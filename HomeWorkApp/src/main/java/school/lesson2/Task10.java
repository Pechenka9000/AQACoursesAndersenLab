package school.lesson2;

/**
 * Написать метод, принимающий на вход два аргумента: len и initialValue,
 * и возвращающий одномерный массив типа int длиной len, каждая ячейка
 * которого равна initialValue;
 */
public class Task10 {
    public static void main(String[] args) {
        arrayCreator(5, 14);
    }

    public static int[] arrayCreator(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}

