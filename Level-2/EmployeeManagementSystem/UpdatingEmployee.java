import java.util.ArrayList;

public class UpdatingEmployee {
    ArrayList<Employee> data;

    public UpdatingEmployee(ArrayList<Employee> data) {
        this.data = data;
    }
    public void updateEmployee(int index,Employee e){
        data.set(index,e);
    }
}
