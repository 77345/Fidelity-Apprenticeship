import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insurance Number: ");
        String number = sc.nextLine();
        System.out.println("Insurance Name: ");
        String name = sc.nextLine();
        System.out.println("Amount Covered: ");
        Double amountcovered = sc.nextDouble();
        System.out.println("Select");
        System.out.println("1.Life Insurance");
        System.out.println("2.motor Insurance");

        int option = sc.nextInt();

        if (option == 1) {
            LifeInsurance lifeInsurance = new LifeInsurance();
            lifeInsurance.setInsuranceNo(number);
            lifeInsurance.setInsuranceName(name);
            lifeInsurance.setAmountcover(amountcovered);
            System.out.println("Policy Term: ");
            lifeInsurance.setPolicyterm(sc.nextInt());
            System.out.println("Benifit percent:");
            lifeInsurance.setBenifitpercent(sc.nextFloat());
            addPolicy(lifeInsurance,option);
        }else if (option == 2) {
            MotorInsurance motorInsurance = new MotorInsurance();
            motorInsurance.setInsuranceNo(number);
            motorInsurance.setInsuranceName(name);
            motorInsurance.setAmountcover(amountcovered);
            System.out.println("Depriciation percent: ");
            motorInsurance.setDepPercent(sc.nextFloat());
            addPolicy(motorInsurance,option);
        }else {
            System.out.println("Invalid Option");
        }
        sc.close();
    }
    public static void addPolicy(Insurance ins, int option) {
        double premium;
        if (option==1){
            LifeInsurance lifeins=( LifeInsurance) ins;
            premium=lifeins.calculatePremium();

        }else{
            MotorInsurance motorins=(MotorInsurance) ins;
            premium=motorins.calculatePremium();
        }
        System.out.println("calculated Premium: " + premium);
    }
}
