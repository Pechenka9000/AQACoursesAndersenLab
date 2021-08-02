package school.lesson2;

/**
 * Создать квадратный двумерный целочисленный массив (количество строк и
 * столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные
 * элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу:
 * индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n].
 */
public class Task9 {
    public static void main(String[] args) {
        int[][] array = arrayChanger(Utils.arrayCreator2(11,11));
        Utils.arrayOut2(array);     //По заданию не требуется, но для наглядности решил добавить вывод в консоль
    }

    public static int[][] arrayChanger (int[][] array) {
        int y = 10;
        for (int i = 0; i < array.length; i++, y--) {
            array[i][i] = 1;
            array[i][y] = 1;
        } return array;
    }
}
