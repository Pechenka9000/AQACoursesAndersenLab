package school.lesson4.task5;

public class Plate {
    private static int food;
    public Plate(int food) {
        Plate.food = food;
    }

    public void increaseFood(int n) {
        food += n;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public int getFood() {
        return food;
    }
}
