package bank_application;

public class CheckingAccount extends Account{
    private double overdraftLimit;
    public CheckingAccount(int a, double overdraftLimit) {
        super(a);
        this.overdraftLimit=overdraftLimit;
    }


    public void withdraw(double sum){
        if (sum>0){
            if (getBalance()-sum>=-overdraftLimit){
                super.withdraw(sum);
            }
            else {
                System.err.println("CheckingAccount.withdraw(...): insufficient funds for withdraw.");
            }
        }
        else {
            System.err.println("CheckingAccount.withdraw(...): cannot withdraw negative amount.");
        }
    }
    public String toString(){
        return "Current "+getAccountNumber()+": "+"balance = "+getBalance()+", overdraft limit = "+overdraftLimit;
    }

}
