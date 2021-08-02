package school.lesson2.ticTacToeGame;

public class Main {
    public static final String PLAYER_MARK = "X";
    public static final String AI_MARK = "O";
    public static final String EMPTY_MARK = "*";
    public static final int SIZE = 3;                            //Хотел реализовать эту опцию через меню, но уже не хватило времени)
    public static String[][] board = new String[SIZE][SIZE];
    public static int aiLevel;

    public static void main(String[] args) {
        Menu.menu();
    }
}
