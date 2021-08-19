package school.lesson7;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData() {
    }

    public String[] getHeader(int headerSize) {
        String[] header = new String[headerSize];
        for(int i = 1; i <= headerSize; i++) {
            header[i-1] = "Value".concat(String.valueOf(i));
        }
        //String[] header1 = ("Value1;Value2;Value3".split(";"));
        return header;
    }

    public int[][] getData(int sizeX, int sizeY) {
        int a = 100;
        int [][] data = new int[sizeX][sizeY];
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                data[i][j] = a++;   //new Random().nextInt(1000);
            }
        }
        return data;
    }
}



