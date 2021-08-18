package school.lesson7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Headers implements Serializable {
    private static List<String> headerList = new ArrayList<>();
    static {
        headerList.add("Value1");
        headerList.add("Value2");
        headerList.add("Value3");
    }

    public static List<String> getHeaderList() {
        return headerList;
    }
}
