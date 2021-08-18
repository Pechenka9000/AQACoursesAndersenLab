package school.lesson7;

import java.io.*;
import java.util.List;

public class Serializator {

    public boolean serialization (List<Integer> dataList) {
        boolean flag = false;
        File file = new File("D:/JAVA study/AQACoursesAndersenLab/HomeWorkApp/src/main/java/school/lesson7/dataFile.csv");
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            if(fos != null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(dataList);
                flag = true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }

    public DataObject deserialization() throws InvalidObjectException {
        File file = new File("D:/JAVA study/AQACoursesAndersenLab/HomeWorkApp/src/main/java/school/lesson7/dataFile.csv");
        ObjectInputStream ois = null;

        try {
            FileInputStream fis = new FileInputStream(file);
            if (fis != null) {
                ois = new ObjectInputStream(fis);
                DataObject dataObject = (DataObject) ois.readObject();
                return  dataObject;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        throw new InvalidObjectException("Объект ошибка");


    }
}
