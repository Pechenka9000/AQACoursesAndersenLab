package school.lesson8.task2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PhonebookTest {
    private final List<Person> validPhonebook = new ArrayList<>();
    {
        validPhonebook.add(new Person("Котлетов", "+375(33)0123456"));
        validPhonebook.add(new Person("Пюрешкина", "+375(29)1234567"));
        validPhonebook.add(new Person("Биточкина", "+375(33)2345678"));
        validPhonebook.add(new Person("Борщецов", "+375(33)3456789"));
        validPhonebook.add(new Person("Дранишев", "+375(44)4567890"));
        validPhonebook.add(new Person("Пельмешкина", "+375(29)5678901"));
        validPhonebook.add(new Person("Рулькашов", "+375(33)6789012"));
        validPhonebook.add(new Person("Щи", "+375(29)7890123"));
        validPhonebook.add(new Person("Крутонас", "+375(29)8901234"));
        validPhonebook.add(new Person("Дифлопетко", "+375(29)9012345"));
        validPhonebook.add(new Person("Драникич", "+375(44)1012345"));
        validPhonebook.add(new Person("Котлетов", "+375(25)1123456"));
        validPhonebook.add(new Person("Омлетко", "+375(25)1234567"));
        validPhonebook.add(new Person("Ризоттуа", "+375(33)1345678"));
        validPhonebook.add(new Person("Эклер", "+375(33)1456789"));
        validPhonebook.add(new Person("Карбонаркина", "+375(33)1567890"));
        validPhonebook.add(new Person("Биточкин", "+375(44)1678901"));
        validPhonebook.add(new Person("Солянка", "+375(29)1789012"));
        validPhonebook.add(new Person("Эклер", "+375(29)1890123"));
        validPhonebook.add(new Person("Блинчишов", "+375(29)1901234"));
    }

    private final List<Person> validSortedPhonebook = new ArrayList<>();
    {
        validSortedPhonebook.add(new Person("Биточкин", "+375(44)1678901"));
        validSortedPhonebook.add(new Person("Биточкина", "+375(33)2345678"));
        validSortedPhonebook.add(new Person("Блинчишов", "+375(29)1901234"));
        validSortedPhonebook.add(new Person("Борщецов", "+375(33)3456789"));
        validSortedPhonebook.add(new Person("Дифлопетко", "+375(29)9012345"));
        validSortedPhonebook.add(new Person("Драникич", "+375(44)1012345"));
        validSortedPhonebook.add(new Person("Дранишев", "+375(44)4567890"));
        validSortedPhonebook.add(new Person("Карбонаркина", "+375(33)1567890"));
        validSortedPhonebook.add(new Person("Котлетов", "+375(33)0123456"));
        validSortedPhonebook.add(new Person("Котлетов", "+375(25)1123456"));
        validSortedPhonebook.add(new Person("Крутонас", "+375(29)8901234"));
        validSortedPhonebook.add(new Person("Омлетко", "+375(25)1234567"));
        validSortedPhonebook.add(new Person("Пельмешкина", "+375(29)5678901"));
        validSortedPhonebook.add(new Person("Пюрешкина", "+375(29)1234567"));
        validSortedPhonebook.add(new Person("Ризоттуа", "+375(33)1345678"));
        validSortedPhonebook.add(new Person("Рулькашов", "+375(33)6789012"));
        validSortedPhonebook.add(new Person("Солянка", "+375(29)1789012"));
        validSortedPhonebook.add(new Person("Щи", "+375(29)7890123"));
        validSortedPhonebook.add(new Person("Эклер", "+375(33)1456789"));
        validSortedPhonebook.add(new Person("Эклер", "+375(29)1890123"));
    }

    private List<Person> validPersons = new ArrayList<>();
    {
        validPersons.add(new Person("Дранишев", "+375(44)4567890"));
        validPersons.add(new Person("Драникич", "+375(44)1012345"));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPhonebook() {
        Assertions.assertEquals(validPhonebook.toString(), Phonebook.getPhonebook().toString());
    }

    @Test
    void sort() {
        Assertions.assertEquals(validSortedPhonebook.toString(), Phonebook.sort(Phonebook.getPhonebook()).toString());
    }

    @Test
    void add() {
        Person PERSON = new Person("Пирожокскапустин", "+375(29)9876543");
        validPhonebook.add(PERSON);
        Assertions.assertEquals(validPhonebook.toString(), Phonebook.add(new Person("Пирожокскапустин", "+375(29)9876543"), false).toString());
    }

    @Test
    void getPersons() {
        Assertions.assertEquals(validPersons.toString(), Phonebook.getPersons("дран").toString());
    }

    @Test
    void testGetPersons() {
        Phonebook.getPersons("дран").toString();
        Assertions.assertEquals(validPersons.toString(), Phonebook.getPersons().toString());
    }
}