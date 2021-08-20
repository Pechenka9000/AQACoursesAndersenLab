package school.lesson7.upgradedProgramVersion;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {
    private static List<String[]> dataList = new ArrayList<>();
    static {
        dataList.add("780;954;1042".split(";"));
        dataList.add("800;967;970".split(";"));
        dataList.add("1525;1420;1100".split(";"));
    }

    public static List<String[]> getDataList() {
        return dataList;
    }
}
