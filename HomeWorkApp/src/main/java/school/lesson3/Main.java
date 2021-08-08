package school.lesson3;

/**
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 * 2. Конструктор класса должен заполнять эти поля при создании объекта;
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль
 *    (согласно POJO решил не добавлять его в класс 'Employee' а добавил в класс Main сразу в метод
 *    main для улучшения code style);
 * 4. Создать массив из 5 сотрудников
 *    (Решил использовать 'ArrayList' т.к. для базы данных работников это логичнее,
 *    ведь количество сотрудников всегда меняется и каждый раз изменять величину массива неудобно.
 *    Так же создал отдельный класс 'NewEmployees', чтобы было проще найти нужного сотрудника и отредактировать);
 * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */
public class Main {
    public static void main(String[] args) {
        employeeToConsole("employee1");  // Выводит информацию сотрудника 's' в консоль
        employeeAgeToConsole(40); // Выводит информацию сотрудников старше 'z' лет.
    }

    public static void employeeToConsole(String s) {
        EmployeeRepository.getList().forEach(employee -> {
            if(employee.getFullName().equals(s)) {
                System.out.println(employee);
            }
        });
    }

    public static void employeeAgeToConsole(int z) {
        EmployeeRepository.getList().forEach(employee -> {
            if (employee.getAge() > z) {
                System.out.println(employee);
            }
        });
    }
}
