package q05;

public class BankAccountClient {
    public static void main(String[] args) {
        BankAccount B1 = new BankAccount("Peter",10000);
        B1.deposit(8000);
        B1.getBalance();
        B1.withdraw(3000);
        System.out.println(B1);
        B1.displayInfo();

        BankAccount B2 = new BankAccount();
        B2.displayInfo();



    }
}
