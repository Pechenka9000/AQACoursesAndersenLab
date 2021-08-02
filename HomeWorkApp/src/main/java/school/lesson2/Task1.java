package school.lesson2;

/**
 * Написать метод, принимающий на вход два целых числа и проверяющий, что их
 * сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
 * в противном случае – false.
 */
public class Task1 {
     public static void main(String[] args) {
        twoIntegers(25, 17);
     }

     public static boolean twoIntegers(int x, int y) {
         boolean b;
         int s = x + y;
         b = s >= 10 & s <= 20;
         return b;
     }
}
