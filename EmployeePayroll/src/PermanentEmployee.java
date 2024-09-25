public class PermanentEmployee extends Employee {
    int pf;

    public PermanentEmployee(int id, String name, float basicSalary, int pf) {
        super(id, name);
        this.basicSalary = basicSalary;
        this.pf = pf;

    }

    public void calculateBonus() {
        if (pf < 1000) {
            bonus = 0.10f * basicSalary;
        } else if (pf >= 1000 && pf < 1500) {
            bonus = 0.115f * basicSalary;

        } else if (pf >= 1500 && pf < 1800) {
            bonus = 0.12f * basicSalary;
        } else {
            bonus = 0.15f * basicSalary;
        }
    }
    public void calculateNetSalary(){
        netSalary = basicSalary - pf;
    }

    public void display() {
        super.display();
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("PF: " + pf);
        System.out.println("Bonus: " + bonus);
        System.out.println("Net Salary: " + netSalary);
    }
}
