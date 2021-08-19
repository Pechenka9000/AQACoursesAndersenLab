package school.lesson7;

import au.com.bytecode.opencsv.CSVWriter;
import school.lesson3.Main;

import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CRUD {

    public void createFile() {
        File file = new File(MainClass.PATH);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Чтение с клавиатуры и запись в файл
    public void fromConsoleBufferedWriter() {
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (FileWriter fileWriter = new FileWriter(MainClass.PATH))
        {
            s = reader.readLine();
            fileWriter.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void CSVWriter() {
        for (int i = 0; i < Headers.getHeaderList().size(); i++) {
            CSVWriter writer = null;
            try {
                writer = new CSVWriter(new FileWriter("C:/Studying_JAVA/AQACoursesAndersenLab/HomeWorkApp/src/main/java/school/lesson7/dataFile3.csv"), ';');
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (writer != null) {
                String[] abc = {"a", "b", "c"};
                writer.writeNext(abc);
            }
        }
    }


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



}
