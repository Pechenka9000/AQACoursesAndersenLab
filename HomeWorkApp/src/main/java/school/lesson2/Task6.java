package school.lesson2;

/**
 * Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла
 * и условия заменить 0 на 1, 1 на 0.
 */
public class Task6 {
    public static void main(String[] args){
        int[] array = Utils.arrayCreatorRandoms(10, 2); //Массив длиной 10, заполненный значениями от 0 до 1.
        Utils.arrayOut(array);
        arrayChanger(array);
        Utils.arrayOut(array);
    }

    public static void arrayChanger(int[] array) {
        for (int z = 0; z < array.length; z++) {
            if (array[z] == 0) {
                array[z] = 1;
            } else {
                array[z] = 0;
            }
        }
    }
}