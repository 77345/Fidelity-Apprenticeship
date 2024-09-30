import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class EmployeeNotFoundException extends Exception {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
class EmployeeManagement{
    private List<Employee> employees;

    public  EmployeeManagement (){
        employees =new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public Employee findEmployeeById(int id) throws EmployeeNotFoundException {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        throw new EmployeeNotFoundException("Employee with ID" + id + " not found");

    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        EmployeeManagement emp = new EmployeeManagement();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees to add: ");
        int numberOfEmployees = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter the employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the employee name: ");
            String name = sc.nextLine();
            emp.addEmployee(new Employee(id, name));
        }

        System.out.println("Enter the employee ID: ");
        int searchId = sc.nextInt();

        try {
            Employee employee = emp.findEmployeeById(searchId);
            System.out.println("Found employee"+employee.getName());
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
