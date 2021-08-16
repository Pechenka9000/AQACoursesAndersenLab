package school.lesson6.basicProgramVersion;

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
 */
public class MainClass {
    public static final int X_TASK_CONDITION = 4;
    public static final int Y_TASK_CONDITION = 4;
    public static final String INITIAL_VALUE = "500000";
    public static final String MISTAKE = "gg";
    public static void main(String[] args) {
        ArrayCreator array = new ArrayCreator(4, 4);
        // Обработка исключения размера массива класса 'MyArraySizeException':
        try {
            array.setMyException();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        String[][] stringArray = array.getMyArray();
        // Обработка ошибки при вводе некорректных данных координат при размещении в массив.
        try {
            array.setMistake(stringArray, 1, 2, MISTAKE);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Указанные координаты находятся за пределами массива;");
            System.err.println("Необходимо ввести координаты от 1 до X = " + X_TASK_CONDITION + "; Y = " + Y_TASK_CONDITION);
        } finally {
            array.showArray(stringArray);

        }
        // Обработка ошибки парсинга элементов к типу 'int' при подсчете суммы чисел:
        try {
            System.out.println(array.summer(stringArray));
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}

