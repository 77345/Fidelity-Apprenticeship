import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee Type(1 for permanent,2 for Temporary");
        int employeeType = sc.nextInt();

        if(employeeType == 1) {
            System.out.println("Enter Permanent Employee details:");

            System.out.println("Enter employee ID: ");
            int id = sc.nextInt();
            System.out.println("Enter employee Name: ");
            String name = sc.next();
            System.out.println("Enter Basic Salary: ");
            float basicSalary = sc.nextFloat();
            System.out.println("Provident Fund ");
            int pf = sc.nextInt();

            PermanentEmployee permEmp= new PermanentEmployee(id, name, basicSalary, pf);
            permEmp.calculateBonus();
            permEmp.calculateNetSalary();
            System.out.println("Below is the permanent Employee details;");
            permEmp.display();
        }
        else if(employeeType == 2) {
            System.out.println("Enter Temporary Employee details:");

            System.out.println("Enter employee ID: ");
            int id = sc.nextInt();
            System.out.println("Enter employee Name: ");
            String name = sc.next();
            System.out.println("Enter daily Wages: ");
            float dailyWages = sc.nextFloat();
            System.out.println("No of Days Worked ");
            int noofDays = sc.nextInt();

            TemporaryEmployee temEmp = new TemporaryEmployee(id, name, dailyWages , noofDays);
            temEmp.calculateBonus();
            temEmp.calculateNetSalary();
            System.out.println("Below is the temporary Employee details;");
            temEmp.display();
        }
        else {
            System.out.println("Invalid employee ID");
        }
    }
}
