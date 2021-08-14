package school.lesson6;

public class ArrayCreator {
    private int size;

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

    public int summer (String[][] myArray) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                try {
                    sum += Integer.parseInt(myArray[i][j]);
                } catch (NumberFormatException e) {
                    System.err.println("Неудовлетворяющий элемент находится в ячейке [" + i +"][" + j + "]" );
                    throw new MyArrayDataException("В массиве содержится элемент другого формата в ячейке № ", e);
                }
            }
        } return sum;
    }
}
