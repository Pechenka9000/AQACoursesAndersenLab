package school.lesson7;

import java.util.ArrayList;
import java.util.List;

public class AppData {
    private static List<String[]> dataList2 = new ArrayList<>();
    static {
        dataList2.add("780;954;1042".split(";"));
        dataList2.add("800,967;970".split(";"));
        dataList2.add("1525;1420;1100".split(";"));
    }

    public static List<String[]> getDataList2() {
        return dataList2;
    }

}



