package school.lesson7.upgradedProgramVersion;

import java.io.File;
import java.util.List;

/**
 * Реализовать сохранение данных в csv файл;
 * Реализовать загрузку данных из csv файла. Файл читается целиком.
 * Данная версия проекта реализована максимально гибкими конструкторами записи
 * и чтения данных. В 2 хранилища (Headers, DataRepository) можно занести любмые
 * данные формата "String[]" и записать их в любом порядке и любой форме в файл.
 */
public class MainClass {
    public static final String PATH = new File("dataFileUpgraded.csv").getAbsolutePath();

    public static void main(String[] args) {
        DataProcessing dataProcessing = new DataProcessing();
        List<String[]> headers = Headers.getHeaderList();
        List<String[]> data = DataRepository.getDataList();
        dataProcessing.csvWriterSpecialSeparators(headers, 0, ';', PATH, false);
        dataProcessing.csvWriterSpecialSeparators(data, 0, ',', PATH, true);
        dataProcessing.csvWriterSpecialSeparators(data, 1, '|', PATH, true);
        dataProcessing.csvWriterSpecialSeparators(data, 2, '_', PATH, true);
        dataProcessing.csvReader(PATH);
    }
}
