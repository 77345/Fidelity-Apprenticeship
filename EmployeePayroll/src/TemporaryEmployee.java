public class TemporaryEmployee extends Employee {
     int dailyWages;
     int noofDays;

    public TemporaryEmployee(int id,String name,int dailyWages,int noofDays) {
        super(id,name);
        this.dailyWages = dailyWages;
        this.noofDays = noofDays;
    }
    public void calculateBonus() {
        if (dailyWages< 1000) {
            bonus = 0.15f * netSalary;
        } else if (dailyWages >= 1000 && dailyWages < 1500) {
            bonus = 0.12f * netSalary;
        } else if (dailyWages >= 1500 && dailyWages < 1750) {
            bonus = 0.11f * netSalary;
        } else {
            bonus = 0.08f * netSalary;
        }
    }
    public void calculateNetSalary() {
        netSalary= dailyWages * noofDays;
    }
    public void display() {
        super.display();
        System.out.println("Daily Wages: " + dailyWages);
        System.out.println("No of Days Worked: " + noofDays);
        System.out.println("Bonus: " + bonus);
        System.out.println("Net Salary: " + netSalary);
    }
}
