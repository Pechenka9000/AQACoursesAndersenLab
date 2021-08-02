package school.lesson2;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * Полностью разобраться с кодом(пример игры крестики-нолики),
 * попробовать переписать с нуля, стараясь не подглядывать в методичку.
 */
public class Task11 {
    public static class MainClass {
        public static int SIZE = 3;
        public static final char DOT_EMPTY = '•';
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';
        public static char[][] board;
        public static Scanner scanner = new Scanner(System.in);
        public static Random random = new Random();

        public static void main(String[] args) throws IOException {
            initialBoard();
            printBoard();
            for( ; ; ) {
                humanTurn();
                printBoard();
                if (checkWin(DOT_X)) {
                    System.out.println("Победил игрок");
                    break;
                }
                if (isBoardFull()) {
                    System.out.println("Ничья");
                    break;
                }
                aiTurn();
                printBoard();
                if (checkWin(DOT_O)) {
                    System.out.println("Победил Искуственный Интеллект");
                    break;
                }
                if (isBoardFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("Игра закончена");
        }

        public static boolean checkWin(char symb) {
            if(board[0][0] == symb && board[0][1] == symb && board[0][2] ==
                    symb)
                return true;
            if(board[1][0] == symb && board[1][1] == symb && board[1][2] ==
                    symb) return true;
            if (board[2][0] == symb && board[2][1] == symb && board[2][2] ==
                    symb) return true;
            if (board[0][0] == symb && board[1][0] == symb && board[2][0] ==
                    symb) return true;
            if (board[0][1] == symb && board[1][1] == symb && board[2][1] ==
                    symb) return true;
            if (board[0][2] == symb && board[1][2] == symb && board[2][2] ==
                    symb) return true;
            if (board[0][0] == symb && board[1][1] == symb && board[2][2] ==
                    symb) return true;
            if (board[2][0] == symb && board[1][1] == symb && board[0][2] ==
                    symb) return true;
            return false;
        }

        public static boolean isBoardFull() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (board[i][j] == DOT_EMPTY) return false;
                }
            }
            return true;
        }

        public static void aiTurn() {
            int x, y;
            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            } while (!isCellValid(x, y));
            System.out.println("Компьютер походил в точку " + (x + 1) +
                    " " + (y + 1));
            board[y][x] = DOT_O;
        }

        public static void humanTurn() {
            int x, y;
            do {
                System.out.println("Введите координату в формате X Y (1 - 3):");
                x = scanner.nextInt() -1;
                y = scanner.nextInt() -1;
            } while (!isCellValid(x, y));
            board[y][x] = DOT_X;
        }

        public static boolean isCellValid(int x, int y) {
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
            if (board[y][x] == DOT_EMPTY) return true;
            return false;
        }

        public static void initialBoard() {
            board = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    board[i][j] = DOT_EMPTY;
                }
            }
        }

        public static void printBoard() {
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
            System.out.println();
        }
    }
}
