package school.lesson6.basicProgramVersion;

import school.lesson2.Utils;

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

    public static void main(String[] args) throws Exception {
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
            array.setMistake(stringArray, 3, 3, "pz");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Указанные координаты находятся за пределами массива");
        }
        Utils.stringArrayOut2(stringArray);
        // Обработка ошибки парсинга элементов к типу 'int' при подсчете суммы чисел:
        try {
            System.out.println(array.summer(stringArray));
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}

