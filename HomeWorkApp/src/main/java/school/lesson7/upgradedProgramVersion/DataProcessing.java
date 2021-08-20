package school.lesson7.upgradedProgramVersion;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class DataProcessing {

    public void csvWriter(List<String[]> dataList, String path, Boolean reWrite) {
        CSVWriter writer = null;
        try {
            writer = new CSVWriter(new FileWriter(path, reWrite), ';', CSVWriter.NO_QUOTE_CHARACTER);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert writer != null;
        writer.writeAll(dataList);
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void csvWriter(String[] dataList, String path, Boolean reWrite) {
        CSVWriter writer = null;
        try {
            writer = new CSVWriter(new FileWriter(path, reWrite), ';', CSVWriter.NO_QUOTE_CHARACTER);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert writer != null;
        writer.writeNext(dataList);
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

    public void csvReader(String path) {
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(path), CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, 0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String[]> allRows = null;
        try {
            assert reader != null;
            allRows = reader.readAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert allRows != null;
        for (String[] row : allRows) {
            System.out.println(Arrays.toString(row));
        }
    }
}
