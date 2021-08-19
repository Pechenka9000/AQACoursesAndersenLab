package school.lesson7;

import au.com.bytecode.opencsv.CSVWriter;
import java.io.*;
import java.util.List;

public class CRUD {

    public void CSVWriter(List<String[]> dataList, String path, Boolean reWrite) {
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

    public void CSVWriter2(List<String[]> dataList, String path, Boolean reWrite) {
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

    public void CSVWriter3(List<String[]> dataList, String path, Boolean reWrite) {
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
}

/*
    public void bufferedWriter() {
        try (FileWriter fileWriter = new FileWriter(MainClass.PATH)) {
            Headers.getHeaderList().forEach(head -> {
                try {
                    fileWriter.write(head + ";");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            fileWriter.write(System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void bufferedWriter2() {
        try (FileWriter fileWriter = new FileWriter(MainClass.PATH, true)){
            DataRepository.getDataList().forEach(data -> {
                try {
                    fileWriter.write(data+";");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void bufferedWriter3(int lineSize) {
        int a = 0;
        AtomicInteger j = new AtomicInteger();
        try (FileWriter fileWriter = new FileWriter(MainClass.PATH, true)){
            for(int i = 0; i < DataRepository.getDataList().size(); i+=lineSize, a+=3) {
                DataRepository.getDataList().subList(a, a+lineSize).forEach(data2 -> {
                        try {
                            fileWriter.write(data2 + ";");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        j.getAndIncrement();

                });
                try {
                    fileWriter.write(System.lineSeparator());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void bufferedReader() {
        String s;
        try (BufferedReader reader = new BufferedReader(new FileReader(MainClass.PATH))){
            while ((s = reader.readLine()) != null) {
                System.out.print(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void randomAccessFile() {
            try (RandomAccessFile randomAccessFile = new RandomAccessFile(MainClass.PATH, "r")) {
                randomAccessFile.seek(2);
                System.out.println((char) randomAccessFile.read());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
     */

