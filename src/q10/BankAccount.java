package q10;

public class BankAccount {
     private double initial_amount = 0;

    public BankAccount(double initial_amount) {
        this.initial_amount = initial_amount;
    }

    public BankAccount() {
    }

    public double getInitial_amount() {
        return initial_amount;
    }
}
