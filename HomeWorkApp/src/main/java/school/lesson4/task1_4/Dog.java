package school.lesson4.task1_4;

public class Dog extends Animal {
    private static int count;
    private int runDogLimit = 500;
    private int swimDogLimit = 10;
    private String className = "собаки";
    public Dog(String name) {
        super(name);
        setCount(count);
    }

    public int getRunDogLimit() {
        return runDogLimit;
    }

    public int getSwimDogLimit() {
        return swimDogLimit;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {

        count++;
        Dog.count = count;
        Animal.setCount(count);
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public void run(int x) {
        if(x <= getRunDogLimit()) {
            super.run(x);
        } else {
            System.out.println("Даже для такой собаки как " + getName() +" такая дистанция великовата.");
        }
    }


    @Override
    public void swim(int x) {
        if(x <= getSwimDogLimit()) {
            super.swim(x);
        } else {
            System.out.println(getName() + " не поплывёт, это слишком далеко.");
        }
    }
}
