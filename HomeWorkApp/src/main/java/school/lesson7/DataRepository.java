package school.lesson7;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {
    private static List<Integer> dataList = new ArrayList<>();
    static {
        dataList.add(0, 780);
        dataList.add(1, 954);
        dataList.add(2, 1042);
        dataList.add(3, 800);
        dataList.add(4, 967);
        dataList.add(5, 970);
        dataList.add(6, 1525);
        dataList.add(7, 1420);
        dataList.add(8, 1100);
    }

    public static List<Integer> getDataList() {
        return dataList;
    }
}
