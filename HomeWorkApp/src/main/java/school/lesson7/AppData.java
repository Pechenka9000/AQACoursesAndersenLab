package school.lesson7;

import school.lesson4.task6.Goods;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppData implements Serializable {
    private List<String> headerList = new ArrayList<>();
    private List<Integer> dataList = new ArrayList<>();
    private static HashMap<Integer, List<Integer>> dataHashMap = new HashMap<Integer, List<Integer>>();

    public AppData(List<String> headerList, List<Integer> dataList) {
        this.headerList = headerList;
        this.dataList = dataList;
    }

    public static HashMap <Integer, List<Integer>> setHashMap() {
        int a = 0;
        int b = 2;

        for(int index = 1; index < 3; index ++) {
            dataHashMap.put(index, DataRepository.getDataList().subList(a, b));
            a += 3;
            b += 3;
        }

        return dataHashMap;
    }

    public List<String> getHeaderList() {
        return headerList;
    }

    public void setHeaderList(List<String> headerList) {
        this.headerList = headerList;
    }

    public List<Integer> getDataList() {
        return dataList;
    }

    public void setDataList(List<Integer> dataList) {
        this.dataList = dataList;
    }
}



