package school.lesson7;

import java.io.IOException;

/**
 * 1. Реализовать сохранение данных в csv файл;
 * 2. Реализовать загрузку данных из csv файла. Файл читается целиком.
 */

public class MainClass {
    public static final String PATH2 = "D:/JAVA study/AQACoursesAndersenLab/HomeWorkApp/src/main/java/school/lesson7/dataFile2.csv";

    public static void main(String[] args) throws IOException {
        CRUD crud = new CRUD();
        crud.CSVWriter(Headers.getHeaderList(), PATH2, false);
        crud.CSVWriter2(DataRepository.getDataList2(), PATH2, true);
    }
}
