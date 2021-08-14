package school.lesson6;

import school.lesson2.Utils;

import java.util.Arrays;

public class ArrayCreator {
    private int size;
    private String [][] myArray;

    public int getSize() {
        return size;
    }

    public ArrayCreator(int size) {
        this.size = size;
    }

    public String[][] setMistake(String[][] myArray ,int a, int b, String mistake) {
        myArray[a][b] = mistake;
        return myArray;
    }

    public String[][] getMyArray() {
        try {
            setMyException();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        String [][] myArray = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
            myArray[i][j] = "45";
            }
        }
        return myArray;
    }

    public void setMyException() throws MyArraySizeException {
        if (size != 4) {
            throw new MyArraySizeException("Размер массива не удовлетворяет условию");

        }
    }

    public int summer (String[][] myArray) {
        int sum = 0;
        for (String[] strings : myArray) {
            for (int j = 0; j < myArray.length; j++) {
                sum += Integer.parseInt(strings[j]);
            }
        }
        return sum;
    }

}
