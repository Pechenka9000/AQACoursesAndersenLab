package school.lesson2;

/**
 * Написать метод, которому в качестве аргументов передается строка и число, метод
 * должен отпечатать в консоль указанную строку, указанное количество раз.
 */
public class Task4 {
    public static void main(String[] args) throws Exception {
        stringsPrinter();
    }

    public static void stringsPrinter() throws Exception {
        System.out.println("Введите строку: ");
        String s = Utils.stringReader();
        System.out.println("Сколько раз вы хотите напечатать строку? ");
        int n = Integer.parseInt(Utils.stringReader());
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }
}
