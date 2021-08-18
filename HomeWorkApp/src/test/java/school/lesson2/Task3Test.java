package school.lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void positiveOrNegativeNum() {
        assertFalse(Task3.positiveOrNegativeNum(-2));
        assertTrue(Task3.positiveOrNegativeNum(5));
    }
}