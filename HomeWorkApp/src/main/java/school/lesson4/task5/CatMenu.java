package school.lesson4.task5;

import school.lesson2.Utils;
import java.util.Random;

public class CatMenu {
    public static void menu() throws Exception {
        for ( ; ; ) {
            System.out.println("Кого Вы хотите покормить?");
            System.out.println("1. Уличного кота.");
            System.out.println("2. Домашних котов.");
            System.out.println("3. Никого не буду кормить.");
             int i = Utils.numScanner();
            switch (i) {
                case 1: {
                    System.out.println("Сколько еды положить коту?");
                    Random random = new Random();
                    int r = random.nextInt(100)+1;
                    MainClass.feedCat(new Plate(Utils.numReader()), new Cat("Бродячий", r));
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("1. Покормить всех котов.");
                    for (int n = 0; n < CatRepository.getCatList().size(); n++) {
                        System.out.println((n + 2) + ". Покормить " + CatRepository.getCatList().get(n).getName());
                    }
                    System.out.println("Никого не буду кормить.");
                    int v = Utils.numScanner();
                    switch (v) {
                        case 1 -> {
                            System.out.println("Сколько еды положить?");
                            MainClass.feedAllCats(new Plate(Utils.numReader()));
                            MainClass.satietyToConsole();

                        }
                        case 2 -> {
                            System.out.println("Сколько еды положить коту?");
                            MainClass.feedCat(new Plate(Utils.numReader()), CatRepository.getCatList().get(0));
                            System.out.println();

                        }
                        case 3 -> {
                            System.out.println("Сколько еды положить коту?");
                            MainClass.feedCat(new Plate(Utils.numReader()), CatRepository.getCatList().get(1));
                            System.out.println();

                        }
                        case 4 -> {
                            System.out.println("Сколько еды положить коту?");
                            MainClass.feedCat(new Plate(Utils.numReader()), CatRepository.getCatList().get(2));
                            System.out.println();
                        }
                        case 5 ->
                            System.exit(0);
                        default ->
                            System.out.println("Нет такой опции.");
                    }
                }
                case 3: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Нет такой опции.");
                }
            }
        }
    }
}
