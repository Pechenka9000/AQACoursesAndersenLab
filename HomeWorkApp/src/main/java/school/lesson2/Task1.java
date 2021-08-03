package school.lesson2;

/**
 * Написать метод, принимающий на вход два целых числа и проверяющий, что их
 * сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
 * в противном случае – false.
 */
public class Task1 {
     public static void main(String[] args) {
        System.out.println(twoIntegers(5, 7));
     }

     public static boolean twoIntegers(int x, int y) {
         return (x+y)>=10&(x+y)<=20;
     }
}
