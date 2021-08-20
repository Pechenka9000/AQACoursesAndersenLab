package school.lesson7.taskProgramVersion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppDataTest {
    private static final AppData APP_DATA = new AppData();
    private static final String[] validExpectedHeaders = new String[] {"Value1", "Value2", "Value3"};
    private static final String[] invalidExpectedHeaders = new String[] {"Value6", "Label", "Value3"};
    private static final int[][] validExpectedValues = new int[][] {
            new int[] {150, 200, 250},
            new int[] {300, 350, 400},
    };
    private static final int[][] invalidExpectedValues = new int[][] {
            new int[] {110, 201, 0},
            new int[] {200, 0, 202},
    };

    @AfterEach
    void tearDown() {
    }
    @Test
    void getHeader() {
        Assertions.assertArrayEquals(validExpectedHeaders, APP_DATA.getHeader());
    }

    @Test
    void getData() {
        Assertions.assertArrayEquals(validExpectedValues, APP_DATA.getData());
    }
}