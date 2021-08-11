package school.lesson4.task5;

import school.lesson2.Utils;

public class FeedCats {
    private static int generalAppetit;
    //Если в тарелке больше еды чем аппетит кота, то он поест;
    //Реализована опция добавления еды в тарелку, если коту не хватило еды.
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
                    while (!cat.isSatiety()) {
                        System.out.println("У этого кота аппетит - " + cat.getAppetite());
                        System.out.println("Сколько еды добавить в тарелку?");
                        System.out.println("Еда = " + p.getFood());
                        p.increaseFood(Utils.numReader());
                        feedCat(p, cat);
                        if (cat.isSatiety()) break;
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

    //Кормим всех котов из листа, если кот покушал - true;
    //Реализована опция добавления еды в тарелку, если котам не хватило еды.
    public static void feedAllCats(Plate p) {
        for( ; ; ) {
            if (CatRepository.getCatList().isEmpty()) {
                System.out.println("Все коты сыты");
                System.exit(0);
            } else
                if (CatRepository.getCatList().get(0).isSatiety()) {
                    CatRepository.getCatList().remove(0);
                } else
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
                            System.out.println("У этого кота аппетит - " + cat.getAppetite());
                            System.out.println("Сколько еды добавить в тарелку?");
                            System.out.println("Еда = " + p.getFood());
                            try {
                                p.increaseFood(Utils.numReader());
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            if(p.getFood() >= getGeneralAppetit()) {
                                System.out.println("Все коты сыты");
                                System.exit(0);
                            }
                            if (p.getFood() >= (getGeneralAppetit() - CatRepository.getCatList().get(2).getAppetite())) {
                                CatRepository.getCatList().remove(0);
                                CatRepository.getCatList().remove(1);
                            }
                            try {
                                feedAllCats(p);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        case 2: {
                            System.exit(0);
                            break;
                        }
                        default: {
                            System.out.println("Нет такой опции.");
                        }

                    }
                }
            });
        }
    }

    public static int getGeneralAppetit() {
        generalAppetit = CatRepository.getCatList().stream().mapToInt(Cat::getAppetite).sum();
        return generalAppetit;
    }

    public static void satietyToConsole() {
        CatRepository.getCatList().forEach(cat -> System.out.println(cat.getName() + " покушал? - " + cat.isSatiety()));
    }
}
