import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account id: ");
        int id = sc.nextInt();
        System.out.println("Enter the account type: ");
        String accounttype= sc.next();
        System.out.println("Enter the account balance: ");
        double balance = sc.nextDouble();
        Account_5 account = new Account_5(id, accounttype, balance);
        System.out.println(account.GetDetails());
        System.out.println("Enter the amount to withdraw:");
        double amounttoWithdraw = sc.nextDouble();
        if(account.withdraw(amounttoWithdraw)) {
            System.out.println("new balance:"+account.getBalance());
        }else{
            System.out.println("Not enough balance");
        }
    }
}
