package school.lesson2.ticTacToeGame;

public class Checker {
    public static boolean isCellFull(int y, int x) {
        if (x < 0 || y < 0 || x > Main.SIZE - 1 || y > Main.SIZE - 1) {
            return false;
        }
        return Main.board[y][x] != Main.EMPTY_MARK;
    }

    public static boolean checkLines(int start_y, int start_x, int dy, int dx, String mark) {
        for (int i = 0; i < Main.SIZE; i++) {
            if (Main.board[start_y + i * dy][start_x + i * dx] != mark)
                return false;
        }
        return true;
    }

    public static boolean checkWin(String mark) {
        for (int i = 0; i < Main.SIZE; i++) {
            if (checkLines(i, 0, 0, 1, mark)) return true;
            if (checkLines(0, i, 1, 0, mark)) return true;
        }
        if (checkLines(0, 0, 1, 1, mark)) return true;
        if (checkLines(0, Main.SIZE - 1, 1, -1, mark)) return true;
        return false;
    }
}
