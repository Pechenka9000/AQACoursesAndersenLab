package school.lesson6.basicProgramVersion;

import java.util.stream.Stream;

public class ArrayCreator {
    private int sizeX;
    private int sizeY;
    private final int S = MainClass.INITIAL_VALUE.length() - MainClass.MISTAKE.length();
    private String spaceMistake;

    public ArrayCreator(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public void showArray(String[][] stringArray) {
        for (int i = 0; i < sizeX; i++) {
            System.out.print(i);
            Stream.generate(() -> " ").limit(MainClass.INITIAL_VALUE.length()).forEach(System.out::print);
        }
        System.out.println();
        for (int i = 0; i < sizeY; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < sizeX; j++) {
                System.out.print(stringArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void setMistake(String[][] myArray , int coordinateX, int coordinateY, String mistake) {
        myArray[coordinateY - 1][coordinateX - 1] = mistake;
    }

    public String[][] getMyArray() {
        String [][] myArray = new String[sizeX][sizeY];
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
            myArray[i][j] = MainClass.INITIAL_VALUE;
            }
        }
        return myArray;
    }

    public void setMyException() throws MyArraySizeException {
        if(sizeX != MainClass.X_TASK_CONDITION & sizeY != MainClass.Y_TASK_CONDITION) {
            throw new MyArraySizeException("Параметры 'sizeX' и 'sizeY' для задания размера массива не соответствуют условию ");
        }
        if (sizeX != MainClass.X_TASK_CONDITION) {
            throw new MyArraySizeException("Параметр 'sizeX' для задания размера массива не соответствует условию ");
        } else {
            if (sizeY != MainClass.Y_TASK_CONDITION) {
                throw new MyArraySizeException("Параметр 'sizeY' для задания размера массива не соответствует условию ");
            }
        }
    }

    public int summer (String[][] myArray) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                try {
                    sum += Integer.parseInt(myArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException((String.format("Элемент '%s' в ячейке [%s][%s] не может быть преобразован в целое число", myArray[i][j], j+1, i+1)), e);
                }
            }
        } return sum;
    }
}
