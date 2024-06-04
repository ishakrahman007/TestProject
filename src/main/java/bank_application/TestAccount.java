package bank_application;

public class TestAccount {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(1001,5.8);
        savingsAccount.deposit(500);
        System.out.println(savingsAccount);

        CheckingAccount checkingAccount = new CheckingAccount(400,500);
        checkingAccount.deposit(1000);
        System.out.println(checkingAccount);

    }
}
