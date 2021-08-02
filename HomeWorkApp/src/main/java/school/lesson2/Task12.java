package school.lesson2;

import java.util.Random;
import java.util.Scanner;

/**
 * Переделать проверку победы задания 11, чтобы она не была реализована просто набором
 * условий, например, с использованием циклов.
 * - Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5
 * и количества фишек 4. Очень желательно не делать это просто набором условий для
 * каждой из возможных ситуаций;
 * - Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
 * P.s. решил написать задание с ноля полностью под своё понимание. Так проще,
 * нежели изменять существующее.
 * P.s.s. Данный код так же находится в папке school.lesson2.ticTacToeGame разбитый по
 * классам для удобства восприятия блоков (логики, создания доски и т.д.).
 */
public class Task12 {
    public static final String PLAYER_MARK = "X";
    public static final String AI_MARK = "O";
    public static final String EMPTY_MARK = "*";
    public static final int SIZE = 3;                            //Хотел реализовать эту опцию через меню, но уже не хватило времени)
    public static String[][] board = new String[SIZE][SIZE];
    public static int aiLevel;

    public static void main(String[] args) {
        menu();
    }

    public static void aiBattle() {
        int count = 0;
        initialBoard();
        while (true) {
            showBoard();
            playerTurn(PLAYER_MARK);
            count++;
            if (checkWin(PLAYER_MARK)) {
                showBoard();
                System.out.println("Player win");
                break;
            }
            aiTurn();
            count++;
            if (checkWin(AI_MARK)) {
                showBoard();
                System.out.println("Ai win");
                break;
            }
            //Останавливает игру, если достигнут последний ход и нет победителя(для доски любого размера).
            if (count == Math.pow(SIZE, 2)-1) {
                showBoard();
                System.out.println("Turns are over");
                break;
            }
        }
    }

    public static void menu() {
        System.out.println("Выберите уровень ИИ: ");
        System.out.println("1. Обычный");
        System.out.println("2. Сложный");
        System.out.println("3. Выход");
        int i = Utils.numScanner();
        switch (i) {
            case 1: {
                aiLevel = 1;
                aiBattle();
                break;
            }
            case 2: {
                aiLevel = 2;
                aiBattle();
                break;
            }
            case 3: {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Неверное значение");
            }
        }
    }

    public static void initialBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY_MARK;
            }
        }
    }

    public static void showBoard() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
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
        while (isCellFull(y, x));
        board[y][x] = mark;
    }

    public static void aiTurn() {
        int x = -1;
        int y = -1;
        boolean aiWin = false;
        boolean playerWin = false;
        // ИИ ищет выигрышные ходы
        if (aiLevel == 2) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (!isCellFull(i, j)) {
                        board[i][j] = AI_MARK;
                        if (checkWin(AI_MARK)) {
                            y = i;
                            x = j;
                            aiWin = true;
                        }
                        board[i][j] = EMPTY_MARK;
                    }
                }
            }
        }
        // ИИ блокирует победных ход игрока
        if (aiLevel > 0) {
            if (!aiWin) {
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        if (!isCellFull(i, j)) {
                            board[i][j] = PLAYER_MARK;
                            if (checkWin(PLAYER_MARK)) {
                                y = i;
                                x = j;
                                playerWin = true;
                            }
                            board[i][j] = EMPTY_MARK;
                        }
                    }
                }
            }
        }
        if (!aiWin && !playerWin) {
            do {
                Random random = new Random();
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            }
            while (isCellFull(y, x));
        }
        board[y][x] = AI_MARK;
    }

    public static boolean isCellFull(int y, int x) {
        if (x < 0 || y < 0 || x > SIZE - 1 || y > SIZE - 1) {
            return false;
        }
        return board[y][x] != EMPTY_MARK;
    }

    public static boolean checkLines(int start_y, int start_x, int dy, int dx, String mark) {
        for (int i = 0; i < SIZE; i++) {
            if (board[start_y + i * dy][start_x + i * dx] != mark)
                return false;
        }
        return true;
    }

    public static boolean checkWin(String mark) {
        for (int i = 0; i < SIZE; i++) {
            if (checkLines(i, 0, 0, 1, mark)) return true;
            if (checkLines(0, i, 1, 0, mark)) return true;
        }
        if (checkLines(0, 0, 1, 1, mark)) return true;
        if (checkLines(0, SIZE - 1, 1, -1, mark)) return true;
        return false;
    }
}
