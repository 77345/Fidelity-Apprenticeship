import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class FindAge {
    private String firstName;
    private String lastName;
    private LocalDate dob;

    public FindAge(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public int getAge() {
        LocalDate today = LocalDate.now();
        return Period.between(dob, today).getYears();
    }
    public String getAdult(){
        if(getAge() >= 18){
            return "Adult";
        }else {
            return "Child";
        }

    }
    public void displayDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("DOB: " + dob);
        System.out.println("Age: "+getAge());
        System.out.println("Adult/Child: "+getAdult());
    }

}
public class Person {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First name:");
        String firstName = sc.nextLine();
        System.out.println("Enter Last name:");
        String lastName = sc.nextLine();
        System.out.println("Enter DOB:(yyyy-mm-dd)");
        String dob = sc.nextLine();
        LocalDate dobInput =LocalDate.parse(dob);
        FindAge age = new FindAge(firstName, lastName, dobInput);
        age.displayDetails();

    }
}
