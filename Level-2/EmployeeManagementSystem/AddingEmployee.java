import java.util.ArrayList;

public class AddingEmployee {
    ArrayList<Employee> data;

    public AddingEmployee(ArrayList<Employee> data) {
        this.data = data;
    }

    public void addEmployee(int age, int id, String name, int salary) {
        data.add(new Employee(age, id, name, salary));

    }
}
