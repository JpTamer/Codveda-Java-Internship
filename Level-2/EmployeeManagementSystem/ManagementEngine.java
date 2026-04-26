import java.util.ArrayList;
import java.util.Scanner;

public class ManagementEngine {
    private final ArrayList<Employee> data = new ArrayList<>();
    private int id = 0;

    public void run() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a number to proceed");
        while (true) {
            System.out.println("""
                    1. Create new Employee
                    2. View Employee
                    3. Update Employee
                    4. Delete Employee
                    0. Exit""");
            while (!scan.hasNextInt()) {
                System.out.println("Enter a valid number");
                scan.next();
            }
            int input1 = scan.nextInt();
            if (input1 == 1) {
                System.out.println("Enter the Name of the Employee: ");
                scan.nextLine();
                String name = scan.nextLine();
                System.out.println("Enter the Age of the Employee: ");
                while (!scan.hasNextInt()) {
                    System.out.println("Enter a valid age");
                    scan.next();
                }
                int age = scan.nextInt();
                System.out.println("Enter the Salary of the Employee: ");
                while (!scan.hasNextInt()) {
                    System.out.println("Enter a valid salary");
                    scan.next();
                }
                int salary = scan.nextInt();
                new AddingEmployee(data).addEmployee(age, id++, name, salary);
                System.out.println("Employee added successfully");
            } else if (input1 == 2) {
                if (data.isEmpty()) {
                    System.out.println("No Employees found");
                } else {
                    System.out.println(new ViewingEmployee(data).viewEmployee());
                }
            } else if (input1 == 3) {
                if (!data.isEmpty()) {
                    System.out.println(new ViewingEmployee(data).viewEmployee());
                    System.out.println("Choose the number of the employee to edit");
                    while (!scan.hasNextInt()) {
                        System.out.println("Enter a valid number");
                        scan.next();
                    }
                    int input2 = scan.nextInt();
                    if (input2 < data.size()) {
                        System.out.println("""
                                1. Name
                                2. Age
                                3. Salary
                                """);
                        while (!scan.hasNextInt()) {
                            System.out.println("Enter a valid number");
                            scan.next();
                        }
                        int input3 = scan.nextInt();
                        if (input3 == 1) {
                            System.out.println("Enter new name");
                            scan.nextLine();
                            String name = scan.nextLine();
                            Employee e = new Employee(data.get(input2).getAge(), data.get(input2).getId(), name, data.get(input2).getSalary());
                            new UpdatingEmployee(data).updateEmployee(input2, e);
                            System.out.println("Updated Successfully");
                        } else if (input3 == 2) {
                            System.out.println("Enter new age");
                            int age = scan.nextInt();
                            Employee e = new Employee(age, data.get(input2).getId(), data.get(input2).getName(), data.get(input2).getSalary());
                            new UpdatingEmployee(data).updateEmployee(input2, e);
                            System.out.println("Updated Successfully");
                        } else if (input3 == 3) {
                            System.out.println("Enter new salary");
                            int salary = scan.nextInt();
                            Employee e = new Employee(data.get(input2).getAge(), data.get(input2).getId(), data.get(input2).getName(), salary);
                            new UpdatingEmployee(data).updateEmployee(input2, e);
                            System.out.println("Updated Successfully");
                        } else {
                            System.out.println("Invalid number");
                        }

                    } else {
                        System.out.println("Number chosen is not available");
                    }
                } else {
                    System.out.println("No Employees Found");
                }
            } else if (input1 == 4) {
                if (!data.isEmpty()) {
                    System.out.println(new ViewingEmployee(data).viewEmployee());
                    System.out.println("Choose the number of the employee to delete");
                    while (!scan.hasNextInt()) {
                        System.out.println("Enter a valid number");
                        scan.next();
                    }
                    int input2 = scan.nextInt();
                    if (input2 < data.size()) {
                        Employee deletedEmployee = new DeletingEmployee(data).deleteEmployee(input2);
                        System.out.println("Deleted: " + deletedEmployee + " successfully");
                    } else {
                        System.out.println("Number chosen is not available");
                    }
                } else {
                    System.out.println("No Employees Found");
                }
            } else if (input1 == 0) {
                System.out.println("System exited successfully");
                return;
            } else {
                System.out.println("Enter a valid number");
            }
        }

    }
}
