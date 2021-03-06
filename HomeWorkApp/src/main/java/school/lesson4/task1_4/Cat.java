package school.lesson4.task1_4;

public class Cat extends Animal {
    private static int count;
    private int runCatLimit = 200;
    private int swimCatLimit = 0;
    private String className = "кошки";
    public Cat(String name) {
        super(name);
        setCount(count);
    }

    public int getRunCatLimit() {
        return runCatLimit;
    }

    public int getSwimCatLimit() {
        return swimCatLimit;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {

        count++;
        Cat.count = count;
        Animal.setCount(count);
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public void run(int x) {
        if(x <= getRunCatLimit()) {
            super.run(x);
        } else {
            System.out.println("Коты столько не бегают, тем более " + getName() + ".");
        }
    }

    @Override
    public void swim(int x) {
        if(x != getSwimCatLimit()) {
            System.out.println("Кот не умеет плавать, а " + " и подавно.");
        }
    }
}
