import java.util.ArrayList;

public class ViewingEmployee {
    private final ArrayList<Employee> data;

    public ViewingEmployee(ArrayList<Employee> data) {
        this.data = data;
    }
    public String viewEmployee(){
        String res = "";
        for (int i = 0; i < data.size(); i++) {
            res += i+ ". " + data.get(i).toString() + "\n";
        }
        return res;
    }
}
