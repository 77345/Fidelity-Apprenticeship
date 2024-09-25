public class Employee {
        int id;
        String name;
        float basicSalary;
        float bonus;
        float netSalary;


        public Employee(int id, String name) {
                this.id = id;
                this.name = name;
        }
        public void display() {
                System.out.println("Employee ID: " + id);
                System.out.println("Employee Name: " + name);
        }


}