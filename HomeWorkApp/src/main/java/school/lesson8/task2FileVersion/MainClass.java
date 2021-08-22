package school.lesson8.task2FileVersion;

import java.io.File;
import java.io.IOException;

/**
 * Написать простой класс Телефонный Справочник, который хранит в себе список
 * фамилий и телефонных номеров. В этот телефонный справочник с помощью метода
 * add() можно добавлять записи, а с помощью метода get() искать номер телефона по
 * фамилии. Следует учесть, что под одной фамилией может быть несколько
 * телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
 * выводиться все телефоны.
 * (В данной версии проекта добавлены методы записи в файл.txt и чтения полученной телефонной книги.
 * Так же в данной версии не использовал 'static').
 */
public class MainClass {
    public static final String PATH = new File("Phonebook.cvs").getAbsolutePath();

    public static void main(String[] args) throws IOException {
        Phonebook phonebook = new Phonebook();
        System.out.println(phonebook.getPhonebook());
        // Внёс "sortMarker" в конструктор методу "add". Если true - сортирует список после добавления нового человека,
        // false - добавляет в конец списка без упорядочивания элементов.
        phonebook.add(new Person("Пирожокскапустин", "+375(29)9876543"), true);
        System.out.println(phonebook.getPhonebook());
        // Реализована функция поиска в книге по фамилии или номеру телефона(даже частично и игнорируя регистр - для
        // телефонного справочника очень удобный поиск, т.к. не всегда точно помнишь фамилию или номер)
        phonebook.getPersons("котл");
        System.out.println(phonebook.getPersons());
        phonebook.phonebookWriter(PATH, false);
        phonebook.phonebookReader(PATH);
    }
}