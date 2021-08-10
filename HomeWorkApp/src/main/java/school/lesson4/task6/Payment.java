package school.lesson4.task6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Payment {
    public static List<Goods> basket = new ArrayList<>();
    private static double basketPrice;
    private static int basketNum = 1;
    private static HashMap<Integer, List<Goods>> checkAndBasket = new HashMap<Integer, List<Goods>>();



    static class Basket {
        public static List<Goods> getBasket(String s) {
            GoodsRepository.getGoodsList().forEach(product -> {
                if (product.getProductName().equals(s)) {
                    basket.add(product);
                }
            });
            return basket;
        }

        public static HashMap <Integer, List<Goods>> setHashMap() {
            checkAndBasket.put(basketNum, basket);
            return checkAndBasket;
        }

        public static int getBasketNum() {
            return basketNum;
        }

        public static int setBasketNum() {
            return basketNum++;
        }

        public static HashMap<Integer, List<Goods>> getCheckAndBasket() {
            return checkAndBasket;
        }

        public static double result() {
            basketPrice = basket.stream().mapToDouble(Goods::getProductPrice).sum();
            return basketPrice;
        }
    }
}
