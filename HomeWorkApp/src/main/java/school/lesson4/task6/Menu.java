package school.lesson4.task6;

import school.lesson2.Utils;

public class Menu {
    public static void menu() {
        for ( ; ; ) {
            System.out.println("Выберите товары для покупки: ");
            for (int i = 0; i < GoodsRepository.getGoodsList().size(); i++) {
                System.out.println((i + 1) + " " + GoodsRepository.getGoodsList().get(i).getProductName());
            }
            System.out.println("Нажмите '0' для завершения покупок.");
            int i = Utils.numScanner();
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10: {
                    Payment.Basket.getBasket(GoodsRepository.getGoodsList().get(i - 1).getProductName());
                    break;
                }
                case 0: {
                    System.out.println("==================================");
                    System.out.println("Чек № " + Payment.Basket.getBasketNum());
                    Payment.Basket.setHashMap();
                    Payment.Basket.setBasketNum();
                    System.out.println("==============Товары==============");
                    for (int z = 0; z < Payment.basket.size(); z++) {
                        System.out.println(Payment.basket.get(z));
                    }
                    System.out.println("==================================");
                    System.out.println("К оплате: " + Payment.Basket.result() + "р.");
                    System.out.println("Нажмите '1' для пповторной закупки. | Нажмите '0' для выхода");
                    int z = Utils.numScanner();
                    switch (z) {
                        case 1: {
                            Payment.basket.clear();
                            break;
                        }
                        case 0: {
                            // Можно добавить вывод номера чека и его содержимого как опцию.
                            // System.out.println(Payment.Basket.getCheckAndBasket());
                            System.exit(0);
                            break;
                        }
                        default: {
                            System.out.println("Нажмите '1' либо '0'");
                        }
                    }
                }
                default: {
                    System.out.println("Такого товара нет");
                }
            }
        }
    }
}
