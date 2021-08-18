package school.lesson7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataObject implements Serializable {
    private List<String> headerList = new ArrayList<>();
    private HashMap<Integer, List<AppData>> dataMap = new HashMap<Integer, List<AppData>>();

    public DataObject(List<String> headerList, HashMap<Integer, List<AppData>> dataMap) {
        this.headerList = headerList;
        this.dataMap = dataMap;
    }

    public List<String> getHeaderList() {
        return headerList;
    }

    public void setHeaderList(List<String> headerList) {
        this.headerList = headerList;
    }

    public HashMap<Integer, List<AppData>> getDataMap() {
        return dataMap;
    }

    public void setDataMap(HashMap<Integer, List<AppData>> dataMap) {
        this.dataMap = dataMap;
    }

    @Override
    public String toString() {
        return "DataObject{" +
                "headerList=" + headerList +
                ", dataMap=" + dataMap +
                '}';
    }
}
