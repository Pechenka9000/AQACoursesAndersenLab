package school.lesson3;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private static List<Employee> list = new ArrayList<>();
    static {
        list.add(0, new Employee("employee1", "worker1", "worker@1", "1111", 1111, 20));
        list.add(1, new Employee("employee2", "worker2", "worker@2", "2222", 2222, 30));
        list.add(2, new Employee("employee3", "worker3", "worker@3", "3333", 3333, -40));
        list.add(3, new Employee("employee4", "worker4", "worker@4", "4444", 4444, 50));
        list.add(4, new Employee("employee5", "worker5", "worker@5", "5555", 5555, 60)) ;
    }

    public static List<Employee> getList() {
        return list;
    }
}
