package school.lesson8.task1;

import java.util.ArrayList;
import java.util.List;

public class WordsRepository {
    private static List<String> tasteWordsList = new ArrayList<>();
    static {
        tasteWordsList.add(0, "Котлетка");
        tasteWordsList.add(1, "Пюре");
        tasteWordsList.add(2, "Биточек");
        tasteWordsList.add(3, "Борщец");
        tasteWordsList.add(4, "Драники");
        tasteWordsList.add(5, "Пельмеши");
        tasteWordsList.add(6, "Рулька");
        tasteWordsList.add(7, "Щи");
        tasteWordsList.add(8, "Крутон");
        tasteWordsList.add(9, "Дифлопе");
        tasteWordsList.add(10,"Драники");
        tasteWordsList.add(11,"Котлетка");
        tasteWordsList.add(12,"Омлет");
        tasteWordsList.add(13,"Ризотто");
        tasteWordsList.add(14,"Эклер");
        tasteWordsList.add(15,"Карбонара");
        tasteWordsList.add(16,"Биточек");
        tasteWordsList.add(17,"Солянка");
        tasteWordsList.add(18,"Эклер");
        tasteWordsList.add(19,"Блинчики");
    }

    public static List<String> getTasteWordsList() {
        return tasteWordsList;
    }
}
