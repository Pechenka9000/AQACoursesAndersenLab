package school.lesson7.taskProgramVersion;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataProcessing {

    public List<String[]> arrayToList(int[][] myData) {
        List<String[]> stringDataList = new ArrayList<>();
        for (int i = 0; i < MainClass.Y_TASK_CONDITION; i++) {
            String[] array = new String[MainClass.HEADER_SIZE];
            for (int j = 0; j < MainClass.X_TASK_CONDITION; j++) {
                array[j] = String.valueOf(myData[i][j]);
            } stringDataList.add(array);
        }
        return stringDataList;
    }

    public void save(AppData appData, Boolean reWrite) {
        CSVWriter writer = null;
        try {
            writer = new CSVWriter(new FileWriter(MainClass.PATH, reWrite), ';', CSVWriter.NO_QUOTE_CHARACTER);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert writer != null;
        writer.writeNext(appData.getHeader());
        writer.writeAll(arrayToList(appData.getData()));
        //csvWriterSpecialSeparators(arrayToList(appData.getData()), 0, ';', MainClass.PATH, true);
        //csvWriterSpecialSeparators(arrayToList(appData.getData()), 1, ',', MainClass.PATH, true);
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Добавил такой вариант записи в файл согласно примеру из домашнего задания (во второй строке данные разделены символом ',').
    public void csvWriterSpecialSeparators(List<String[]> dataList, int rawNum, char separator, String path, Boolean reWrite) {
        CSVWriter writer = null;
        try {
            writer = new CSVWriter(new FileWriter(path, reWrite), separator, CSVWriter.NO_QUOTE_CHARACTER);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert writer != null;
        writer.writeNext(dataList.get(rawNum));
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reader(String path) {
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(path), CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, 0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String[]> fullData = null;
        try {
            assert reader != null;
            fullData = reader.readAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert fullData != null;
        for (String[] row : fullData) {
            System.out.println(Arrays.toString(row));
        }
    }
}
