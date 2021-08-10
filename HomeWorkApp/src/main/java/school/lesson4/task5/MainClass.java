package school.lesson4.task5;

import school.lesson2.Utils;
import school.lesson4.task6.Goods;
import school.lesson4.task6.GoodsRepository;

import java.util.ArrayList;
import java.util.List;

/**
 *    Расширить задачу про котов и тарелки с едой, выполнив следующие пункты:
 *    -Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
 *    -Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
 *    -Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
 *    -Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
 *    (решил использовать ArrayList, мало ли придут ещё коты).
 *    -Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */
public class MainClass {
    public static void main(String[] args) throws Exception {
        CatMenu.menu();
    }

    // Если в тарелке больше еды чем аппетит кота, то он поест.
    public static void feedCat(Plate p, Cat cat) throws Exception {
        if (p.getFood() >= cat.getAppetite()) {
            p.decreaseFood(cat.getAppetite());
            cat.setSatiety(true);
            System.out.println(cat);
        } else {
            System.out.println("Коту не хватило еды утолить голод, хотите добавить в тарелку еды?");
            System.out.println("1. Да, конечно. \n2. Не хочу никого кормить.");
            int i = Utils.numScanner();
            switch (i) {
                case 1: {
                    while (cat.isSatiety() == false) {
                        one:
                        {
                            System.out.println("У этого кота аппетит - " + cat.getAppetite());
                            System.out.println("Сколько еды добавить в тарелку?");
                            System.out.println("Еда = " + p.getFood());
                            p.increaseFood(Utils.numReader());
                            feedCat(p, cat);
                            if (cat.isSatiety() == true) {
                                break;
                            } else break one;
                        }
                    }
                }
                case 2: {
                    System.exit(0);
                    break;
                } default: {
                    System.out.println("Нет такой опции.");
                }
            }
        }
    }

    // Кормим всех котов из листа, если кот покушал - true
    public static void feedAllCats(Plate p) {
        CatRepository.getCatList().forEach(cat -> {
            if (p.getFood() >= cat.getAppetite()) {
                p.decreaseFood(cat.getAppetite());
                cat.setSatiety(true);
            } else {
                System.out.println("Всем котам не хватило еды утолить голод, хотите добавить в тарелку еды?");
                System.out.println("1. Да, конечно. \n2. Не хочу никого кормить.");
                int f = Utils.numScanner();
                switch (f) {
                    case 1: {
                        while (!CatRepository.getCatList().isEmpty()) {
                            one:
                            {
                                System.out.println("У этого кота аппетит - " + cat.getAppetite());
                                System.out.println("Сколько еды добавить в тарелку?");
                                System.out.println("Еда = " + p.getFood());
                                try {
                                    p.increaseFood(Utils.numReader());
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                feedAllCats(p);
                                if (cat.isSatiety() == true & CatRepository.getCatList().isEmpty()) {
                                    break;
                                } else
                                    CatRepository.getCatList().remove(0);
                                    break one;
                                }
                            }
                        }
                    case 2: {
                        System.exit(0);
                        break;
                    } default: {
                        System.out.println("Нет такой опции.");
                    }
                }
            }
        });
    }

    public static void satietyToConsole() {
        CatRepository.getCatList().forEach(cat -> System.out.println(cat.getName() + " покушал? - " + cat.isSatiety()));
    }
}