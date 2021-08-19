package school.lesson7;

import au.com.bytecode.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InvalidObjectException;

/**
 * 1. Реализовать сохранение данных в csv файл;
 * 2. Реализовать загрузку данных из csv файла. Файл читается целиком.
 */

public class MainClass {
    public static final String PATH = "C:/Studying_JAVA/AQACoursesAndersenLab/HomeWorkApp/src/main/java/school/lesson7/dataFile.txt";
    public static void main(String[] args) {
        /*
        File file = new File(PATH);
        System.out.println(file.exists());
        CRUD crud = new CRUD();
        crud.bufferedWriter();
        crud.bufferedWriter3(3);
        crud.bufferedReader();
        crud.randomAccessFile();
        file = new File("C:/Studying_JAVA/AQACoursesAndersenLab/HomeWorkApp/src/main/java/school/lesson7/dataFile2.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
         */
        CRUD crud = new CRUD();
        crud.CSVWriter();



    }

}
