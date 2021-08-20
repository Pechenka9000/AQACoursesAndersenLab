package school.lesson7.taskProgramVersion;

import school.lesson2.Utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Реализовать сохранение данных в csv файл;
 * Реализовать загрузку данных из csv файла. Файл читается целиком.
 * (Версия программы, удовлетворяющая условию задания).
 */
public class MainClass {
    public static final String PATH = "C:/Studying_JAVA/AQACoursesAndersenLab/HomeWorkApp/src/main/java/school/lesson7/files/dataFileBasic.csv";
    public static final int HEADER_SIZE = 3;
    public static final int X_TASK_CONDITION = 3;
    public static final int Y_TASK_CONDITION = 2;
    public static final int INITIAL_VALUE = 100;

    public static void main(String[] args) {
        DataProcessing processing = new DataProcessing();
        AppData appData = new AppData();
        processing.save(appData, false);
        processing.reader(PATH);
        processing.csvWriterSpecialSeparators(processing.arrayToList(appData.getData()), 0, ';', PATH, true);

    }
}
