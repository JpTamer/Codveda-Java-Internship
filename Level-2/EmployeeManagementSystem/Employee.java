public class Employee {
    private final int id;
    private final int age;
    private final String name;
    private final int salary;

    public Employee(int age, int id, String name, int salary) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name=" + name +
                ", age='" + age + '\'' +
                ", salary=" + salary + "$" +
                '}';
    }
}
