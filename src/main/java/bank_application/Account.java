package bank_application;

public class Account {

    /*
    Using the Account class as a base class, write two derived classes called SavingsAccount and CurrentAccount. A SavingsAccount object,
    in addition to the attributes of an Account object, should have an interest variable and a method which adds interest to the account.
    A CurrentAccount object, in addition to the attributes of an Account object, should have an overdraft limit variable. Ensure that you
    have overridden methods of the Account class as necessary in both derived classes.
     */


    private double bal; //the current balance
    private int accNum; //the account number

    public Account(int a) {
        bal = 0.00;
        accNum = a;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            bal += sum;
        } else {
            System.err.println("Account.deposit(...): " + "cannot deposit negative amount.");
        }
    }

    public void withdraw(double sum) {
        if (sum > 0) {
            bal -= sum;
        } else {
            System.err.println("Account.withdraw(...): " + "cannot withdraw negative amount.");
        }
    }

    public double getBalance() {
        return bal;
    }

    public double getAccountNumber() {
        return accNum;
    }

    public String toString() {
        return "Acc " + accNum + ": " + "balance = " + bal;
    }

    public final void print() {
        System.out.println(toString());
        // Don't override this, override the toString method.
    }


}
