package school.lesson7;

import school.lesson4.task6.Goods;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppData implements Serializable {
    private String header;
    private int data;
    private static HashMap<Integer, List<AppData>> dataMap = new HashMap<Integer, List<AppData>>();


    public AppData(int data) {
        this.data = data;
    }

    public static HashMap<Integer, List<AppData>> setHashMap() {
        for(int index = 0; index < DataRepository.getDataList().size(); index++) {
            dataMap.put(index, DataRepository.getDataList().subList(0, 2));
        } return dataMap;
    }

    public String getHeader() {
        return header;
    }

    public int getData() {
        return data;
    }

    @Override
    public String toString() {
        return "AppData{" +
                "header='" + header + '\'' +
                ", data=" + data +
                '}';
    }
}
