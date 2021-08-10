package school.lesson4.task1_4;

public class Cat extends Animal {
    private static int count;
    private String className = "кошки";
    public Cat(String name) {
        super(name);
        setCount(count);
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
        if(x <= 200) {
            super.run(x);
        } else {
            System.out.println("Коты столько не бегают, тем более " + getName() + ".");
        }
    }

    @Override
    public void swim(int x) {
        if(x != 0) {
            System.out.println("Кот не умеет плавать, а " + " и подавно.");
        }
    }
}
