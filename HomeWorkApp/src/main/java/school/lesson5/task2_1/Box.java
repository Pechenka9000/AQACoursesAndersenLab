package school.lesson5.task2_1;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> fruits = new ArrayList<>();

    /**
     * Добаляет коллекцию фруктов типа T в коробку
     *
     * @param fruits коллекция фруктов типа T, которая добавляется в коробку
     */
    public void addAll(List<T> fruits) {
        this.fruits.addAll(fruits);
    }

    public void addFew(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            fruits.add(fruit);
        }
    }

    //Добавил опцию "взять 1 врукт из корзины"
    public T takeOne(int index) {
        if(index < fruits.size()) {
            T fruit = fruits.get(index);
            fruits.remove(index);
            return fruit;
        } else {
            System.out.println("В корзине нет такого фрукта");
        }
        return null;
    }

    public List<T> takeFew(int amount) {
        if(amount < fruits.size()) {
            List<T> newBox = new ArrayList<>();
            for(int i = 0; i < amount; i++) {
                newBox.add(fruits.get(i));
                fruits.remove(i);
            }
            return newBox;
        } else {
            System.out.println("В корзине нет столько фруктов.");
            return null;
        }
    }

    /**
     * Забрать все фрукты из коробки
     *
     * @return {@link List<T>} содержащий фрукты из коробки
     */
    public List<T> takeAll() {
        List<T> fruits = this.fruits;
        this.fruits.clear();
        return fruits;
    }

    /**
     * Возвращает все фрукты, содержащиеся в кообке
     *
     * @return {@link List<T>} содержащий фрукты из коробки
     */
    public List<T> getFruits() {
        return fruits;
    }

    public double getWeight() {
        return fruits.stream().mapToDouble(Fruit::getWeight).sum();
    }

    public void compare(Box<? extends Fruit> anotherBox) {
        double deltaWeight = this.getWeight() - anotherBox.getWeight();
        if (deltaWeight < -0.001f) {
            System.out.println("Вторая коробка с фруктами тяжелее.");
        } else {
            if (deltaWeight > 0.001f) {
                System.out.println("Первая коробка с фруктами тяжелее.");
            } else {
                if(deltaWeight > -0.5f & deltaWeight <0.5f) System.out.println("Коробки весят примерно одинаково.");
            }
        }
        System.out.println("Разница в весе коробок " + deltaWeight);
    }

    //Пересыпаем врукты из текущей коробки в указаную.
    public void replace(Box<T> box) {
        box.addAll(this.takeAll());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        fruits.forEach(e -> builder.append(e.toString()).append("\n"));
        return builder.toString();
    }
}