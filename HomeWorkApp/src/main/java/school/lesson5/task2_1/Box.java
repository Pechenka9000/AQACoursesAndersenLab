package school.lesson5.task2_1;

import java.util.*;

public class Box<T extends Fruit> {
    private final List<T> fruits = new ArrayList<>();

    // Добавляет коллекцию фруктов типа T в коробку.
    public void addAll(List<T> fruits) {
        this.fruits.addAll(fruits);
    }

    // Добавить несколько фруктов в корзину.
    public void addFew(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            fruits.add(fruit);
        }
    }

    // Взять 1 фрукт из корзины
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

    // Взять несколько фруктов из корзины
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
            return List.of();
        }
    }

    // Забрать все фрукты из коробки
    public List<T> takeAll() {
        List<T> fruits = this.fruits;
        this.fruits.clear();
        return fruits;
    }

    public double getWeight() {
        return fruits.stream().mapToDouble(Fruit::getWeight).sum();
    }

    // Сравнение веса двух коробок (true - коробки примерно равны по весу | false - не равны).
    public boolean compare(Box<? extends Fruit> anotherBox) {
        double deltaWeight = this.getWeight() - anotherBox.getWeight();
        return deltaWeight > -0.5f & deltaWeight < 0.5f;
    }

    // Пересыпаем фрукты из текущей коробки в указанную.
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