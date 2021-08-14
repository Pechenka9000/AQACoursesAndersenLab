package school.lesson6;

import school.lesson2.Utils;

public class ArrayMenu {

    public static void menu() throws Exception {
        for ( ; ; ) {
            System.out.println("Установите размер двумерного массива [i][j]: ");
            System.out.println("Нажмите 'q' для выхода.");
            String sizeX = Utils.stringReader();
            // int sizeX = Utils.numScanner();
            // int sizeY = Utils.numScanner();
            if (String.valueOf(sizeX).equals("q")) {
                System.out.println("Завершение программы...");
                System.exit(0);
            } else {
                String sizeY = Utils.stringReader();
                if (String.valueOf(sizeY).equals("q")) {
                    System.out.println("Завершение программы...");
                    System.exit(0);
                } else {
                    try {
                        int sizex = Integer.parseInt(sizeX);
                        int sizey = Integer.parseInt(sizeY);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Введён неверный формат данных для задания размера массива");
                    }
                    ArrayCreator array = new ArrayCreator(Integer.parseInt(sizeX), Integer.parseInt(sizeY));
                    try {
                        array.setMyException();
                    } catch (MyArraySizeException e) {
                        e.printStackTrace();
                        break;
                    }
                    String[][] stringArray = array.getMyArray();
                    System.out.println("Введите НЕ число для создания ошибки: ");
                    try {
                        String mistake = Utils.stringReader();
                        System.out.println("Задайте координаты [i][j] для размещения ошибки в массиве: ");
                        int mistakeCoordinateX = Utils.numScanner();
                        int mistakeCoordinateY = Utils.numScanner();
                        array.setMistake(stringArray, mistakeCoordinateX, mistakeCoordinateY, mistake);
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
        }
    }
}
