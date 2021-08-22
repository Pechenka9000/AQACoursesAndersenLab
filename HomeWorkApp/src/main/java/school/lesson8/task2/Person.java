package school.lesson8.task2;

public class Person implements Comparable{
    private String lastName;
    private String phone;

    public Person(String lastName, String phone) {
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return lastName + ", phone - " + phone;
    }

    @Override
    public int compareTo(Object o) {
        Person another = (Person) o;
        return this.lastName.compareToIgnoreCase(((Person) o).lastName);
    }
}
