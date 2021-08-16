package school.lesson6.menuProgramVersion;

/**
 * Напишите метод, на вход которого подаётся двумерный строковый массив
 * размером 4х4. При подаче массива другого размера необходимо бросить
 * исключение MyArraySizeException.
 * Далее метод должен пройтись по всем элементам массива, преобразовать в
 * int и просуммировать. Если в каком-то элементе массива преобразование не
 * удалось (например, в ячейке лежит символ или текст вместо числа), должно быть
 * брошено исключение MyArrayDataException с детализацией, в какой именно
 * ячейке лежат неверные данные.
 * В методе main() вызвать полученный метод, обработать возможные
 * исключения MyArraySizeException и MyArrayDataException и вывести результат
 * расчета.
 * (Не совсем понял смысл обрабатывать базовую ошибку класса 'NumberFormatException',
 * поэтому придумал реализацию обработки ошибок процесса "парсинга").
 *
 * Данная версия программы релизована через "menu". Добавлено несколько дополнительных исключений.
 */
public class MainClass {
    public static final int X_TASK_CONDITION = 4;
    public static final int Y_TASK_CONDITION = 4;
    public static final String INITIAL_VALUE = "4500";
    public static void main(String[] args) {
        ArrayMenu.menu();
    }
}

