package school.lesson2.ticTacToeGame;

public class Board {
    public static void initialBoard() {
        for (int i = 0; i < Main.SIZE; i++) {
            for (int j = 0; j < Main.SIZE; j++) {
                Main.board[i][j] = Main.EMPTY_MARK;
            }
        }
    }

    public static void showBoard() {
        for (int i = 0; i <= Main.SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < Main.SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < Main.SIZE; j++) {
                System.out.print(Main.board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
