package school.lesson7;

import java.util.ArrayList;
import java.util.List;

public class Headers {
    private static List<String[]> headerList = new ArrayList<>();
    static {
        headerList.add("Value1;Value2;Value3".split(";"));
    }

    public static List<String[]> getHeaderList() {
        return headerList;
    }
}
