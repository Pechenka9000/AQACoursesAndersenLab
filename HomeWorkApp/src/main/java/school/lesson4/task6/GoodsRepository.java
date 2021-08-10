package school.lesson4.task6;

import java.util.ArrayList;
import java.util.List;

public class GoodsRepository {
    private static List<Goods> goodsList = new ArrayList<>();
    static {
        goodsList.add(0, new Goods("Картоха", 3.5));
        goodsList.add(1, new Goods("Морковь", 2.4));
        goodsList.add(2, new Goods("Мясцо куриное", 6.5));
        goodsList.add(3, new Goods("Свининка", 8.8));
        goodsList.add(4, new Goods("Макарохи", 3.4));
        goodsList.add(5, new Goods("Рис", 4.8));
        goodsList.add(6, new Goods("Греча", 3.0));
        goodsList.add(7, new Goods("Сыр", 15.0));
        goodsList.add(8, new Goods("Сметанка", 2.9));
        goodsList.add(9, new Goods("Кефир", 1.5));
    }

    public static List<Goods> getGoodsList() {
        return goodsList;
    }
}
