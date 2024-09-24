public class Employee {
    private int Empid;
    private String Empname;
    private String Dept;
    static String Orgname="fidelity";


    Employee()
    {
        System.out.println("Default constructor");
    }
    Employee(int Empid,String name,String dept) {
        this.Empid = Empid;
        Empname = name;
        Dept = dept;
    }
    public void Display(){
        System.out.println("Employee ID:"+Empid+"\nEmployee Name:"+Empname+"\nEmployee Dept:"+Dept);
    }
    public static void Show()
    {
        System.out.println("Organization Name:"+Orgname);
    }
}

