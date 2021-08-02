package school.lesson2.ticTacToeGame;

import java.util.Random;
import java.util.Scanner;

public class Logic {
    public static void aiBattle() {
        int count = 0;
        Board.initialBoard();
        while (true) {
            Board.showBoard();
            playerTurn(Main.PLAYER_MARK);
            count++;
            if (Checker.checkWin(Main.PLAYER_MARK)) {
                Board.showBoard();
                System.out.println("Player win");
                break;
            }
            aiTurn();
            count++;
            if (Checker.checkWin(Main.AI_MARK)) {
                Board.showBoard();
                System.out.println("Ai win");
                break;
            }
            //Останавливает игру, если достигнут последний ход и нет победителя(для доски любого размера).
            if (count == Math.pow(Main.SIZE, 2) - 1) {
                Board.showBoard();
                System.out.println("Turns are over");
                break;
            }
        }
    }

    public static void playerTurn(String mark) {
        int x, y;
        do {
            System.out.println("Введите координаты X Y");
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }
        while (Checker.isCellFull(y, x));
        Main.board[y][x] = mark;
    }

    public static void aiTurn() {
        int x = -1;
        int y = -1;
        boolean aiWin = false;
        boolean playerWin = false;
        // ИИ ищет выигрышные ходы
        if (Main.aiLevel == 2) {
            for (int i = 0; i < Main.SIZE; i++) {
                for (int j = 0; j < Main.SIZE; j++) {
                    if (!Checker.isCellFull(i, j)) {
                        Main.board[i][j] = Main.AI_MARK;
                        if (Checker.checkWin(Main.AI_MARK)) {
                            y = i;
                            x = j;
                            aiWin = true;
                        }
                        Main.board[i][j] = Main.EMPTY_MARK;
                    }
                }
            }
        }
        // ИИ блокирует победных ход игрока
        if (Main.aiLevel > 0) {
            if (!aiWin) {
                for (int i = 0; i < Main.SIZE; i++) {
                    for (int j = 0; j < Main.SIZE; j++) {
                        if (!Checker.isCellFull(i, j)) {
                            Main.board[i][j] = Main.PLAYER_MARK;
                            if (Checker.checkWin(Main.PLAYER_MARK)) {
                                y = i;
                                x = j;
                                playerWin = true;
                            }
                            Main.board[i][j] = Main.EMPTY_MARK;
                        }
                    }
                }
            }
        }
        if (!aiWin && !playerWin) {
            do {
                Random random = new Random();
                x = random.nextInt(Main.SIZE);
                y = random.nextInt(Main.SIZE);
            }
            while (Checker.isCellFull(y, x));
        }
        Main.board[y][x] = Main.AI_MARK;
    }
}
