import java.util.ArrayList;

public class DeletingEmployee {
    ArrayList<Employee> data;

    public DeletingEmployee(ArrayList<Employee> data) {
        this.data = data;
    }
    public Employee deleteEmployee(int index){
        if(data.get(index) == null)return null;
        Employee e = data.get(index);
        data.remove(index);
        return e;
    }
}
