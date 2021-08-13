package school.lesson5.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Harvest {
    private static final double APPLE_MIN_WEIGHT = 1F;
    private static final double APPLE_MAX_WEIGHT = 3F;
    private static final double ORANGE_MIN_WEIGHT = 1.5F;
    private static final double ORANGE_MAX_WEIGHT = 4F;

    public static List<Apple> applesHarvest (int appleHarvest) {
        List<Apple> apples1 = new ArrayList<>();
        for (int i = 0; i < appleHarvest; i++) {
            double weight = APPLE_MIN_WEIGHT + new Random().nextFloat() * (APPLE_MAX_WEIGHT - APPLE_MIN_WEIGHT);
            apples1.add(new Apple(weight));
        } return apples1;
    }

    public static List<Orange> orangeHarvest (int orangeHarvest) {
        List<Orange> orange1 = new ArrayList<>();
        for (int i = 0; i < orangeHarvest; i++) {
            double weight = APPLE_MIN_WEIGHT + new Random().nextFloat() * (ORANGE_MAX_WEIGHT - ORANGE_MIN_WEIGHT);
            orange1.add(new Orange(weight));
        } return orange1;
    }
}
