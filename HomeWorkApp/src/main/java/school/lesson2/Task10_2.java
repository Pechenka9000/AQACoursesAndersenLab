package school.lesson2;

/**
 *  Написать метод, в который передается не пустой одномерный
 *  целочисленный массив, метод должен вернуть true, если в
 *  массиве есть место, в котором сумма левой и правой части массива равны.
 */
public class Task10_2 {
    public static void main(String[] args) {
        System.out.println(arrayChecker(new int[]{1, 2, 1, 4})); // Вывод результата сравнения на экран.
    }

    public static boolean arrayChecker(int[] array) {  // Работает для массива любой длины.
        int sum1 = 0;
        int x, y;
        for (x = 0; x < array.length; x++) {
            sum1 += array[x];
            int sum2 = 0;
            for(y = array.length-1; y > x; y--) {
                sum2 += array[y];
            } if(sum1 == sum2) return true;
        } return false;
    }
}



