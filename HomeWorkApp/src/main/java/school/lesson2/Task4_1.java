package school.lesson2;

/**
 * Написать метод, который определяет, является ли год високосным, и возвращает
 * boolean (високосный - true, не високосный - false). Каждый 4-й год является
 * високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
public class Task4_1 {
    public static void main(String[] args) throws Exception {
        System.out.println(yearDefiner());
    }

    public static boolean yearDefiner() throws Exception {
        int year = Utils.numReader();
        return (year % 400) == 0 || ((year % 100) != 0 && (year % 4) == 0);
    }
}
