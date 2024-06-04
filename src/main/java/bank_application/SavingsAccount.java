package bank_application;

public class SavingsAccount extends Account{

    private double interestRate;

    public SavingsAccount(int a, double interestRate){
        super(a);
        this.interestRate=interestRate;
    }


    public void addInterest(double sum){
        double interest = getBalance()*interestRate/100;
        deposit(interest);
    }

    public String toString(){
        return "Savings "+getAccountNumber()+": "+"balance = "+getBalance()+", interest rate = "+interestRate+"%";
    }

}
