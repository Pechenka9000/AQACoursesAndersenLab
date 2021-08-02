package school.lesson2.ticTacToeGame;

import school.lesson2.Utils;

public class Menu {
    public static void menu() {
        System.out.println("Выберите уровень ИИ: ");
        System.out.println("1. Обычный");
        System.out.println("2. Сложный");
        System.out.println("3. Выход");
        int i = Utils.numScanner();
        switch (i) {
            case 1: {
                Main.aiLevel = 1;
                Logic.aiBattle();
                break;
            }
            case 2: {
                Main.aiLevel = 2;
                Logic.aiBattle();
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
}
