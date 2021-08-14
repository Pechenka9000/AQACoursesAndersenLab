package school.lesson6;

import school.lesson2.Utils;

public class MainClass {

    public static void main(String[] args) throws Exception {
        ArrayCreator array = new ArrayCreator(4);
        String[][] stringArray = array.getMyArray();
        array.setMistake(stringArray, 2, 2, "pz");
        Utils.stringArrayOut2(stringArray);
        try {
            System.out.println(array.summer(stringArray));
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}