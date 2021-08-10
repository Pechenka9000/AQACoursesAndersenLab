package school.lesson4.task7;

import java.util.ArrayList;
import java.util.List;

public class AttractionRepository {
    private static List<Park.Builder> attractionList = new ArrayList<>();
    static {
        attractionList.add(0, new Park.Builder("Вертуха", 10, "Вт-Вс | 10:00-20:00"));
        attractionList.add(1, new Park.Builder("Кукуха", 10, "Вт-Вс | 10:00-20:00"));
        attractionList.add(2, new Park.Builder("Лебеди", 7, "Вт-Вс | 10:00-20:00"));
        attractionList.add(3, new Park.Builder("Поровозик", 5, "Вт-Вс | 10:00-20:00"));
        attractionList.add(4, new Park.Builder("Сюрприз", 8, "Вт-Вс | 10:00-20:00"));
        attractionList.add(5, new Park.Builder("Катапульта", 15, "Вт-Вс | 10:00-20:00"));
        attractionList.add(6, new Park.Builder("Аннигилятор9000", 99, "Вс | 23:50-23:59"));
        attractionList.add(7, new Park.Builder("Картинг", 20, "Пн-Вс | 09:00-19:00"));
        attractionList.add(8, new Park.Builder("Дом ужасов", 10, "Сб-Вс | 12:00-22:00"));
        attractionList.add(9, new Park.Builder("Дом смеха", 10, "Сб-Вс | 12:00-22:00"));
    }

    public static List<Park.Builder> getAttractionList() {
        return attractionList;
    }
}
