package school.lesson4.task5;

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
    public static void feedCat(Plate p, Cat cat) {
        if (p.getFood() > cat.getAppetite()) {
            p.decreaseFood(cat.getAppetite());
            cat.setSatiety(true);
            System.out.println(cat);
        } else {
            System.out.println("Коту не хватило еды утолить голод.");
        }
    }

    // Кормим всех котов из листа, если кот покушал - true
    public static void feedAllCats(Plate p) {
        CatRepository.getCatList().forEach(cat -> {
            if (p.getFood() > cat.getAppetite()) {
                p.decreaseFood(cat.getAppetite());
                cat.setSatiety(true);
            }
        });
    }

    public static void satietyToConsole() {
        CatRepository.getCatList().forEach(cat -> System.out.println(cat.getName() + " покушал? - " + cat.isSatiety()));
    }
}