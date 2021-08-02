package school.lesson2;

/**
 * Написать метод, которому в качестве параметра передается целое число. Метод
 * должен вернуть true, если число отрицательное, и вернуть false если положительное.
 */
public class Task3 {
    public static void main(String[] args) throws Exception {
        System.out.println(positiveOrNegativeNum(Utils.numReader()));
    }

    public static boolean positiveOrNegativeNum(int x) {
        return (x >= 0) ? true : false;     // Можно упростить до 'return x>=0;', однако с целью показать
    }                                       // умение использовать тернарный оператор решил оставить.
}
