package school.lesson6.menuProgramVersion;

import school.lesson2.Utils;

public class ArrayMenu {

    public static void menu() {
        for ( ; ; ) {
            System.out.println("Установите размер двумерного массива [i][j]: ");
            System.out.println("Нажмите 'q' для выхода.");
            String sizeX = null;
            try {
                sizeX = Utils.stringReader();
            } catch (Exception e) {
                e.printStackTrace();
            }
            // Проверка корректности введённых данных(если введено "q" - завершение программы):
            dataChecker(sizeX);
            String sizeY = null;
            try {
                sizeY = Utils.stringReader();
            } catch (Exception e) {
                e.printStackTrace();
            }
            // Проверка корректности введённых данных(если введено "q" - завершение программы):
            dataChecker(sizeY);
            ArrayCreator array = new ArrayCreator(Integer.parseInt(sizeX), Integer.parseInt(sizeY));
            try {
                array.setMyException();
            } catch (MyArraySizeException e) {
                e.printStackTrace();
                break;
            }
            String[][] stringArray = array.getMyArray();
            System.out.println("Введите НЕ число для создания ошибки: ");
            String mistake = null;
            try {
                mistake = Utils.stringReader();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Задайте координаты [i][j] для размещения ошибки в массиве: ");
                System.out.println("Нажмите 'q' для выхода.");
            String mistakeCoordinateX = null;
            try {
                mistakeCoordinateX = Utils.stringReader();
            } catch (Exception e) {
                e.printStackTrace();
            }
            // Проверка корректности введённых данных(если введено "q" - завершение программы):
                dataChecker(mistakeCoordinateX);
            String mistakeCoordinateY = null;
            try {
                mistakeCoordinateY = Utils.stringReader();
            } catch (Exception e) {
                e.printStackTrace();
            }
            // Проверка корректности введённых данных(если введено "q" - завершение программы):
                dataChecker(mistakeCoordinateY);
            try {
                array.setMistake(stringArray, Integer.parseInt(mistakeCoordinateX)-1, Integer.parseInt(mistakeCoordinateY)-1, mistake);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Utils.stringArrayOut2(stringArray);
            try {
                System.out.println(array.summer(stringArray));
            } catch (MyArrayDataException e) {
                e.printStackTrace();
            }
        }
    }

    public static void dataChecker(String firstParam)  {
        if (String.valueOf(firstParam).equals("q")) {
            System.out.println("Завершение программы...");
            System.exit(0);
        } else {
            try {
                Integer.parseInt(firstParam);
            } catch (NumberFormatException e) {
                try {
                    throw new MyArrayDataException("Введён неверный формат данных для задания размера массива");
                } catch (MyArrayDataException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
