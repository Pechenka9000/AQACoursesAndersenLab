package school.lesson7;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CRUD {

    public List<String[]> listIntWriter(int[][] myData) {
        List<String[]> stringDataList = new ArrayList<>();
        //String[] myHeader = ("Value1;Value2;Value3".split(";"));
        for (int i = 0; i < MainClass.HEADER_SIZE; i++) {
            String[] array = new String[MainClass.HEADER_SIZE];
            for (int j = 0; j < 3; j++) {
                array[j] = String.valueOf(myData[i][j]);
            } stringDataList.add(array);
        }
        return stringDataList;
    }

    public void listOuter(List<String[]> list) {
        for (String[] strings : list) {
            System.out.println(Arrays.deepToString(strings));
        }
    }

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
    public void csvWriterSpecialSeparators(List<String[]> dataList, String path, Boolean reWrite) {
        CSVWriter writer1 = null;
        CSVWriter writer2 = null;
        CSVWriter writer3 = null;
        try {
            writer1 = new CSVWriter(new FileWriter(path, reWrite), ';', CSVWriter.NO_QUOTE_CHARACTER);
            writer2 = new CSVWriter(new FileWriter(path, reWrite), ',', CSVWriter.NO_QUOTE_CHARACTER);
            writer3 = new CSVWriter(new FileWriter(path, reWrite), '|', CSVWriter.NO_QUOTE_CHARACTER);

        } catch (IOException e) {
            e.printStackTrace();
        }
        assert writer1 != null;
        writer1.writeNext(dataList.get(0));
        assert writer2 != null;
        writer2.writeNext(dataList.get(1));
        assert writer3 != null;
        writer3.writeNext(dataList.get(2));
        try {
            writer1.close();
            writer2.close();
            writer3.close();
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
