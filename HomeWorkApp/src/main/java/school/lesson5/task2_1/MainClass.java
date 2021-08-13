package school.lesson5.task2_1;

import java.util.List;

/**
 * 1. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 * 2. Класс Box, в который можно складывать фрукты. Коробки условно сортируются
 * по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 * 3. Для хранения фруктов внутри коробки можно использовать ArrayList;
 * 4. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного
 * фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы
 * измерения не важны);
 * - (Решил немного усложнить и добавил класс "Harvest", в котором указывается максимальный и минимальный
 * вес фруктов собранного урожая);
 * 5. Внутри класса Box сделать метод compare(), который позволяет сравнить
 * текущую коробку с той, которую подадут в compare() в качестве параметра.
 * true – если их массы равны, false в противоположном случае. Можно
 * сравнивать коробки с яблоками и апельсинами;
 * - (Реализовал вывод в консоль какая именно коробка тяжелее либо они равны);
 * 6. Написать метод, который позволяет пересыпать фрукты из текущей коробки в
 * другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с
 * апельсинами. Соответственно, в текущей коробке фруктов не остается, а в
 * другую перекидываются объекты, которые были в первой;
 * 7. Не забываем про метод добавления фрукта в коробку.
 */
public class MainClass {

    public static void main(String[] args) {
        // Собираем урожай фруктов и подсчитываем общее количество яблок и апельсинов.
        List<Apple> apples = Harvest.applesHarvest(12);
        List<Orange> oranges = Harvest.orangeHarvest(15);
        // Пересыпаем фрукты в разные корзины.
        Box<Apple> appleBox = new Box<>();
        appleBox.addAll(apples);
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addAll(oranges);
        // Сравниваем вес корзин. Выводим какая из них тяжелее и на сколько.
        System.out.println(appleBox.compare(orangeBox));
        // Добавляем несколько фруктов в коробку, а из другой заберем.
        appleBox.addFew(new Apple(4f), 3);
        Box<Orange> newOrangeBox = new Box<>();
        List<Orange> newOrangeList = orangeBox.takeFew(5);
        System.out.println(newOrangeList);
        newOrangeBox.addAll(newOrangeList);
        // Пересыпем все яблоки в новую коробку.
        Box<Apple> newAppleBox = new Box<>();
        newAppleBox.replace(appleBox);
        // Можно добавить ещё несколько фруктов в коробку с яблоками.
        newAppleBox.addFew(new Apple(2.5f), 2);
    }
}