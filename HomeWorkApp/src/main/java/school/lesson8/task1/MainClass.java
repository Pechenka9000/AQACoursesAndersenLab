package school.lesson8.task1;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
 * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не
 * считаем). Посчитать, сколько раз встречается каждое слово.
 */
public class MainClass {

    public static void main(String[] args) {
        HashMap<String, Long> wordsMap = new HashMap<>();
        WordsRepository.getTasteWordsList().forEach(word ->
                wordsMap.put(word, WordsRepository.getTasteWordsList().stream().filter(word::equals).count()));
        // Решил добавить сортировку слов по возрастающему количеству их упоминания и вывести для наглядности на экран.
        HashMap<String, Long> sortedWordsMap = wordsMap.entrySet().stream().sorted(HashMap.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (value1, value2) -> value1, LinkedHashMap::new));
        sortedWordsMap.forEach((word, key) -> System.out.println("Слово '" + word + "' встречается "+ key + " раз"));
    }
}
