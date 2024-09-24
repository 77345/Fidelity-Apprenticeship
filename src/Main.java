import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee emp=new Employee();
//        emp.Empid=121;
//        emp.Empname="prajwal";
//        emp.Dept="Developer";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee ID");
        int id=sc.nextInt();
        System.out.println("Enter Employee Name");
        String name=sc.next();
        System.out.println("Enter Employee Department");
        String dept=sc.next();
        Employee emp1=new Employee(id,name,dept);
        emp1.Display();
        Employee.Show();
        System.out.println("Enter Employee ID");
        int eid=sc.nextInt();
        System.out.println("Enter Employee Name");
        String ename=sc.next();
        System.out.println("Enter Employee Department");
        String dept1=sc.next();
        Employee emp2=new Employee(eid,ename,dept1);
        emp2.Display();
        Employee.Show();
    }
}