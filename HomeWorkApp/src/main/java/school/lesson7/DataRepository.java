package school.lesson7;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {
    private static List<AppData> dataList = new ArrayList<>();
    static {
        dataList.add(0, new AppData(780));
        dataList.add(1, new AppData(954));
        dataList.add(2, new AppData(1042));
        dataList.add(3, new AppData(800));
        dataList.add(4, new AppData(967));
        dataList.add(5, new AppData(970));
        dataList.add(6, new AppData(1525));
        dataList.add(7, new AppData(1420));
        dataList.add(8, new AppData(1100));
    }

    public static List<AppData> getDataList() {
        return dataList;
    }
}
