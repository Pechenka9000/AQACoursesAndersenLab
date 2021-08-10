package school.lesson4.task5;

import java.util.ArrayList;
import java.util.List;

public class CatRepository {
    private static List <Cat> catList = new ArrayList<>();
    static {
        catList.add(0, new Cat("Бургер", 80));
        catList.add(1, new Cat("Сервелат", 30));
        catList.add(2, new Cat("Сырник", 40));
    }

    public static List<Cat> getCatList() {
        return catList;
    }
}
