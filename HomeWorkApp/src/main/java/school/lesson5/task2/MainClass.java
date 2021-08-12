package school.lesson5.task2;

/**
 * 1. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 * 2. Класс Box, в который можно складывать фрукты. Коробки условно сортируются
 * по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 * 3. Для хранения фруктов внутри коробки можно использовать ArrayList;
 * 4. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного
 * фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы
 * измерения не важны);
 * (Решил немного усложнить и добавил опцию задания веса яблока и 'f' (fruitConst);
 * 5. Внутри класса Box сделать метод compare(), который позволяет сравнить
 * текущую коробку с той, которую подадут в compare() в качестве параметра.
 * true – если их массы равны, false в противоположном случае. Можно
 * сравнивать коробки с яблоками и апельсинами;
 * 6. Написать метод, который позволяет пересыпать фрукты из текущей коробки в
 * другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с
 * апельсинами. Соответственно, в текущей коробке фруктов не остается, а в
 * другую перекидываются объекты, которые были в первой;
 * 7. Не забываем про метод добавления фрукта в коробку.
 */
public class MainClass {
    public static void main(String[] args) throws Exception {
        double fruitConst = 23.34;
        Box<Apple> appleBox1 = new Box(new Apple(1.0, fruitConst), 10);
        Box<Apple> appleBox2 = new Box(new Apple(1.0, fruitConst), 10);
        Box<Orange> orangeBox1 = new Box(new Orange(1.5, fruitConst), 7);
        Box<Orange> orangeBox2 = new Box(new Orange(1.5, fruitConst), 7);
        appleBox1.addMoreFruits(2);
        orangeBox1.addMoreFruits(1);
        System.out.println(appleBox1.getBoxWeight());
        System.out.println(orangeBox1.getBoxWeight());
        appleBox1.compare(orangeBox1);

    }

}
