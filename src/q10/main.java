package q10;

public class main {
    public static void main(String[] args) {
        BankAccount bankAccObj = new BankAccount();
        BankAccount bankAccOObj = new BankAccount(10000);

        System.out.println(bankAccObj.getInitial_amount());
        System.out.println(bankAccOObj.getInitial_amount());
    }


}