package school.lesson2;

/**
 * Написать метод, которому в качестве параметра передается целое число,
 * метод должен напечатать в консоль, положительное ли число передали или
 * отрицательное. Замечание: ноль считаем положительным числом.
 */
public class Task2 {
    public static void main(String[] args) throws Exception {
        positiveOrNegativeNum(Utils.numReader());
    }

    public static void positiveOrNegativeNum(int a) {
        if (a >= 0) {
            System.out.println("Число 'a' положительное");
        } else {
            System.out.println("Число 'a' отрицательное");
        }
    }
}

