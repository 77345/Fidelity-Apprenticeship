import java.util.Scanner;

class BankAccount{
    private String accountNo;
    private int balance;
    public BankAccount(String accountNo, int balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }
    public void performTransaction(int amount) {
        balance += amount;
        System.out.println("Transaction Successful");
        printAccountDetails();
    }
    public void performTransaction(int amount, boolean isWithdrawl) {
        if(isWithdrawl && balance>=amount) {
            balance -= amount;
            System.out.println("Transaction Successful");
        }
        else if(isWithdrawl) {
            System.out.println(("insufficient for Withdrawl"));
        }
        printAccountDetails();
    }
    public void performTransaction(String fromAccount,String toAccount,int amount) {
        if(balance>=amount) {
            balance -= amount;
            System.out.println("Transaction Successful");
        }else {
            System.out.println("Insufficient Balance");
        }
        printAccountDetails();
    }

    public void printAccountDetails(){
        System.out.println("Account No: "+accountNo);
        System.out.println("Balance: "+balance);
        System.out.println("-------------------");
    }
}



public class BankingApplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Account No: ");
        String accountnumber = sc.next();
        BankAccount bankaccount = new BankAccount(accountnumber,5000);

        System.out.println("select Transaction type: 1.Deposit,2.Withdrawl,3.Transfer");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter deposit amount:");
                int depositamount = sc.nextInt();
                bankaccount.performTransaction(depositamount);
                break;
            case 2:
                System.out.println("Enter withdrawal amount: ");
                int withdrawlamount = sc.nextInt();
                bankaccount.performTransaction(withdrawlamount,true);
                break;
            case 3:
                System.out.println("Enter the From Account No: ");
                String fromAccount = sc.next();
                System.out.println("Enter the To Account No: ");
                String toAccount = sc.next();
                System.out.println("Enter the Amount to Transfer: ");
                int transferAmount= sc.nextInt();
                bankaccount.performTransaction(fromAccount,toAccount,transferAmount);
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
