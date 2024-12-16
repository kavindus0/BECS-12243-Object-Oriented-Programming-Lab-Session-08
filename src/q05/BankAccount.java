package q05;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount() {
        this.name = null;
        this.balance = 0;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }


    public void displayInfo() {
        System.out.println(this.name+", Rs."+this.balance);
    }


    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

}
