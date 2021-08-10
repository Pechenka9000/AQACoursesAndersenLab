package school.lesson4.task7;

import school.lesson2.Utils;

public class AttractionMenu {
    public static void menu() {
        for ( ; ; ) {
            System.out.println("Выберите аттракцион по которому хотите узнать информацию: ");
            for (int i = 0; i < AttractionRepository.getAttractionList().size(); i++) {
                System.out.println((i + 1) + " " + AttractionRepository.getAttractionList().get(i).getTitle());
            }
            System.out.println("Нажмите '0' для выхода.");
            int i = Utils.numScanner();
            switch (i) {
                case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> {
                    System.out.println("======================================");
                    System.out.println(AttractionRepository.getAttractionList().get(i - 1));
                    System.out.println("======================================");
                    break;
                }
                case 0 -> {
                    System.out.println("Приятного отдыха в нашем парке развлечений!");
                    System.exit(0);
                    break;
                }
                default -> System.out.println("Такой аттракцион отсутствует");
            }
        }
    }
}
