package school.lesson8.task2FileVersion;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Phonebook {
    private List<Person> persons = new ArrayList<>();
    private List<Person> phonebook = new ArrayList<>();
     {
        phonebook.add(new Person("Котлетов", "+375(33)0123456"));
        phonebook.add(new Person("Пюрешкина", "+375(29)1234567"));
        phonebook.add(new Person("Биточкина", "+375(33)2345678"));
        phonebook.add(new Person("Борщецов", "+375(33)3456789"));
        phonebook.add(new Person("Дранишев", "+375(44)4567890"));
        phonebook.add(new Person("Пельмешкина", "+375(29)5678901"));
        phonebook.add(new Person("Рулькашов", "+375(33)6789012"));
        phonebook.add(new Person("Щи", "+375(29)7890123"));
        phonebook.add(new Person("Крутонас", "+375(29)8901234"));
        phonebook.add(new Person("Дифлопетко", "+375(29)9012345"));
        phonebook.add(new Person("Драникич", "+375(44)1012345"));
        phonebook.add(new Person("Котлетов", "+375(25)1123456"));
        phonebook.add(new Person("Омлетко", "+375(25)1234567"));
        phonebook.add(new Person("Ризоттуа", "+375(33)1345678"));
        phonebook.add(new Person("Эклер", "+375(33)1456789"));
        phonebook.add(new Person("Карбонаркина", "+375(33)1567890"));
        phonebook.add(new Person("Биточкин", "+375(44)1678901"));
        phonebook.add(new Person("Солянка", "+375(29)1789012"));
        phonebook.add(new Person("Эклер", "+375(29)1890123"));
        phonebook.add(new Person("Блинчишов", "+375(29)1901234"));
    }

    public List<Person> getPhonebook() {
        return phonebook;
    }

    public void sort(List<Person> list) {
        Collections.sort(list);
    }

    public void add(Person person, Boolean sortMarker) {
        phonebook.add(person);
        if(sortMarker) {
            sort(phonebook);
        }
    }

    public List<Person> getPersons() {
        return persons;
    }

    public List<Person> getPersons(String request) {
        phonebook.forEach(person -> {
            if ((StringUtils.containsIgnoreCase(person.getLastName(), request)) | (StringUtils.containsIgnoreCase(person.getPhone(), request))) {
                persons.add(person);
            }
        }); return persons;
    }

    public void phonebookWriter(String path, Boolean reWrite) {
        try (FileWriter fileWriter = new FileWriter(path, reWrite)) {
            getPhonebook().forEach(data -> {
                try {
                    fileWriter.write(data + System.lineSeparator());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void phonebookReader(String path) {
        String s;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
