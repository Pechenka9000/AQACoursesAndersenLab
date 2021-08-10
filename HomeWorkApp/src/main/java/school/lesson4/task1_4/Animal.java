package school.lesson4.task1_4;

public class Animal {
    private String name;
    private String className;
    private static int count;
    public Animal(String name) {
        this.name = name;
        this.className = getClassName();

    }
    public void run(int x) {
        System.out.println(getName() + " пробежал " + x + " м.");
    }

    public String getClassName() {
        return className;
    }

    public void swim(int x) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Animal.count = Cat.getCount() + Dog.getCount();
    }

    @Override
    public String toString() {
        return "Вид животного: " +getClassName() +
                ", кличка - '" + name + '\'';
    }
}
