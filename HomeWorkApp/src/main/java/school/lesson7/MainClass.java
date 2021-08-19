package school.lesson7;

import school.lesson2.Utils;

import java.io.IOException;
import java.util.Arrays;

/**
 * 1. Реализовать сохранение данных в csv файл;
 * 2. Реализовать загрузку данных из csv файла. Файл читается целиком.
 */
//НЕ ЗАБЫТЬ!!! НЕ ЗАБЫТЬ!!! НЕ ЗАБЫТЬ!!! ПРО СОХРАНЕНИЕ С ПЕРЕЗАПИСЬЮ!!!!
public class MainClass {
    public static final String PATH = "D:/JAVA study/AQACoursesAndersenLab/HomeWorkApp/src/main/java/school/lesson7/dataFile2.csv";
    public static final int HEADER_SIZE = 3;
    public static final int X_TASK_CONDITION = 3;
    public static final int Y_TASK_CONDITION = 3;
    public static void main(String[] args) throws IOException {
        CRUD crud = new CRUD();
        AppData appData = new AppData();
        String[] header = appData.getHeader(HEADER_SIZE);
        int[][] data = appData.getData(X_TASK_CONDITION,Y_TASK_CONDITION);
        System.out.println(Arrays.deepToString(appData.getHeader(HEADER_SIZE)));
        //crud.csvWriter1(Headers.getHeaderList(), PATH, false);
        //crud.CSVWriter2(DataRepository.getDataList2(), PATH2, true);
        //crud.csvWriter2(DataRepository.getDataList2(), PATH, true);
        //crud.csvReader(PATH);
        crud.csvWriter(header, PATH, false);
        Utils.arrayOut2(data);
        //Utils.stringArrayOut2(crud.bufferedIntWriter(AppData.getMyData(), PATH, true));
        //System.out.println(Arrays.deepToString(crud.bufferedIntWriter(AppData.getMyData(), PATH, true)));
        crud.listOuter(crud.listIntWriter(data));
        crud.csvWriterSpecialSeparators(crud.listIntWriter(data),PATH,true);
    }
}
