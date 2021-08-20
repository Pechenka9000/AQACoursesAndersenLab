package school.lesson7.taskProgramVersion;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData() {
    }

    public String[] getHeader() {
        String[] header = new String[MainClass.HEADER_SIZE];
        for(int i = 1; i <= MainClass.HEADER_SIZE; i++) {
            header[i-1] = "Value".concat(String.valueOf(i));
        }
        return header;
    }

    public int[][] getData() {
        int value = MainClass.INITIAL_VALUE;
        int [][] data = new int[MainClass.Y_TASK_CONDITION][MainClass.X_TASK_CONDITION];
        for (int i = 0; i < MainClass.Y_TASK_CONDITION; i++) {
            for (int j = 0; j < MainClass.X_TASK_CONDITION; j++) {
                data[i][j] = value += 50;
            }
        }
        return data;
    }
}



