package school.lesson7;

import java.io.InvalidObjectException;

public class MainClass {
    public static void main(String[] args) {
        Serializator serializator = new Serializator();
        DataObject dataObject = new DataObject(Headers.getHeaderList(), AppData.setHashMap());

        try {
            DataObject dataObject1 = serializator.deserialization();
            System.out.println(dataObject1.getHeaderList());
            System.out.println(dataObject1.getDataMap());
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
    }
}
