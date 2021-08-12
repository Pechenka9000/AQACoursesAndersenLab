package school.lesson5.task2;

public class Box<T extends Fruit> {
    private int boxAmount = 0;
    private final T fruit;

    public Box(T fruit, int boxAmount) {
        this.fruit = fruit;
        this.boxAmount = boxAmount;
    }

    public double getBoxWeight() {
        return fruit.getWeight() * fruit.getFruitConst() * boxAmount;
    }

    public void addMoreFruits(int addAmount) {
        this.boxAmount += addAmount;
    }

    public void compare(Box <? extends Fruit> anotherBox) {
        double deltaWeight= getBoxWeight() - anotherBox.getBoxWeight();
        if (deltaWeight < -0.001) {
            System.out.println("Вторая коробка с фруктами тяжелее.");
        } else {
            if (deltaWeight > 0.001) {
                System.out.println("Первая коробка с фруктами тяжелее.");
            } else {
                if(deltaWeight > -0.001 & deltaWeight <0.001) System.out.println("Коробки весят одинаково.");
            }
        }
    }



}
