public class Account_5 {
    private int id;
    private String accounttype;
    private double balance;

    public Account_5(){
    }
    public Account_5(int id, String accounttype, double balance){
        this.id = id;
        this.accounttype = accounttype;
        this.balance = balance;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String geAccounttype(){
        return accounttype;
    }
    public void setAccounttype(String accounttype){
        this.accounttype=accounttype;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public boolean withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            return true;
        }
        return false;
    }

    public String GetDetails(){
        return "Account ID:"+id+"\nAccount Type:"+accounttype+"\nBalance:"+balance;
    }
}




