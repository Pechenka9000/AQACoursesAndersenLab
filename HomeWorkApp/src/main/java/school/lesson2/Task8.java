package school.lesson2;

/**
 * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
 * пройти по нему циклом, и числа меньшие6 умножить на 2.
 */
public class Task8 {
    public static void main(String[] args) {
        //По заданию не требуется, но для наглядности решил вывести на экран.
        Utils.arrayOut(arrayChanger(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}));
    }

    public static int[] arrayChanger(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        } return array;
    }
}
