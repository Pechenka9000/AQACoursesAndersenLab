package school.lesson4.task1_4;

public class Dog extends Animal {
    private static int count;
    private String className = "собаки";
    public Dog(String name) {
        super(name);
        setCount(count);
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
        if(x <= 500) {
            super.run(x);
        } else {
            System.out.println("Даже для такой собаки как " + getName() +" такая дистанция великовата.");
        }
    }


    @Override
    public void swim(int x) {
        if(x <= 10) {
            super.swim(x);
        } else {
            System.out.println(getName() + " не поплывёт, это слишком далеко.");
        }
    }
}
