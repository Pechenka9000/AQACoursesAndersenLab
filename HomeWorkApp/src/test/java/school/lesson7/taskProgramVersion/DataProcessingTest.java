package school.lesson7.taskProgramVersion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataProcessingTest {
    private static final DataProcessing DATA_PROCESSING = new DataProcessing();
    private static final AppData APP_DATA = new AppData();
    private static final List<String[]> validStringDataList = new ArrayList<>();
        static {
            validStringDataList.add(0, new String[]{"150", "200", "250"});
            validStringDataList.add(1, new String[]{"300", "350", "400"});
        }
    private static final List<String[]> invalidStringDataList = new ArrayList<>();
        static {
            invalidStringDataList.add(0, new String[]{"633", "fff", "-6gf"});
            invalidStringDataList.add(1, new String[]{"1000", ",hh", "=jb"});
    }
    private static final int[][] validExpectedValues = new int[][] {
        new int[] {150, 200, 250},
        new int[] {300, 350, 400},
    };
    private static final int[][] invalidExpectedValues = new int[][] {
        new int[] {110, 201, 0},
        new int[] {200, 0, 202},
    };
    private static final String[] validExpectedHeaders = new String[] {"Value1", "Value2", "Value3"};
    private static final String[] invalidExpectedHeaders = new String[] {"Value6", "Label", "Value3"};

    @AfterEach
    void tearDown() {
    }


    @Test
    void arrayToList() {
        for(int i = 0; i < APP_DATA.getData().length; i++) {
            Assertions.assertArrayEquals(validStringDataList.get(i), DATA_PROCESSING.arrayToList(APP_DATA.getData()).get(i));
            Assertions.assertArrayEquals(validStringDataList.get(i), DATA_PROCESSING.arrayToList(APP_DATA.getData()).get(i));
        }
    }

    @Test
    void save() {

    }

    @Test
    void csvWriterSpecialSeparators() {
    }

    @Test
    void testCsvWriterSpecialSeparators() {
    }

    @Test
    void reader() {
    }
}