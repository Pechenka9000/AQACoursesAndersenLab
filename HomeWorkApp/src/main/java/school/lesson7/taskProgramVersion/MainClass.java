package school.lesson7.taskProgramVersion;

import java.io.File;

/**
 * Реализовать сохранение данных в csv файл;
 * Реализовать загрузку данных из csv файла. Файл читается целиком.
 * (Версия программы, удовлетворяющая условию задания).
 */
public class MainClass {
    public static final String PATH = new File("dataFileBasic.csv").getAbsolutePath();
    public static final int HEADER_SIZE = 3;
    public static final int X_TASK_CONDITION = 3;
    public static final int Y_TASK_CONDITION = 2;
    public static final int INITIAL_VALUE = 100;

    public static void main(String[] args) {
        DataProcessing processing = new DataProcessing();
        AppData appData = new AppData();
        processing.save(appData, false);
        processing.reader(PATH);
    }
}
