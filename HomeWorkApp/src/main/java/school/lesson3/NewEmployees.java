package school.lesson3;

import java.util.ArrayList;
import java.util.List;

public class NewEmployees {
    static List<Employee> list = new ArrayList<>();
    public static void newEmployees() {
        Employee employee1 = new Employee("employee1", "worker1", "worker@1", "1111", 1111, 20);
        Employee employee2 = new Employee("employee2", "worker2", "worker@2", "2222", 2222, 30);
        Employee employee3 = new Employee("employee3", "worker3", "worker@3", "3333", 3333, 40);
        Employee employee4 = new Employee("employee4", "worker4", "worker@4", "4444", 4444, 50);
        Employee employee5 = new Employee("employee5", "worker5", "worker@5", "5555", 5555, 60);
        list.add(0, employee1);
        list.add(1, employee2);
        list.add(2, employee3);
        list.add(3, employee4);
        list.add(4, employee5);
    }
}
