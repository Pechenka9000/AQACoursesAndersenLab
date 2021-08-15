package school.lesson6.basicProgramVersion;

public class ArrayCreator {
    private int sizeX;
    private int sizeY;

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public ArrayCreator(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public String[][] setMistake(String[][] myArray ,int coordinateX, int coordinateY, String mistake) {
        myArray[coordinateX][coordinateY] = mistake;
        return myArray;
    }

    public String[][] getMyArray() {
        String [][] myArray = new String[sizeX][sizeY];
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
            myArray[i][j] = "45";
            }
        }
        return myArray;
    }

    public void setMyException() throws MyArraySizeException {
        if(sizeX != 4 & sizeY != 4) {
            throw new MyArraySizeException("Параметры 'sizeX' и 'sizeY' для задания размера массива не соответствуют условию ");
        }
        if (sizeX != 4) {
            throw new MyArraySizeException("Параметр 'sizeX' для задания размера массива не соответствует условию ");
        } else {
            if (sizeY != 4) {
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
                    throw new MyArrayDataException((String.format("Элемент '%s' в ячейке [%s][%s] не может быть преобразован в целое число", myArray[i][j], i, j)), e);
                }
            }
        } return sum;
    }
}
