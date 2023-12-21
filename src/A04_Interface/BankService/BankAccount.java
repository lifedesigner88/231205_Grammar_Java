package A04_Interface.BankService;

public class BankAccount {

    private int balance;
    private final int account_number;

    BankAccount(int Account) {account_number = Account;}

    int getBalance(){return balance;}
    int getAccount_number() {return account_number;}

    public void setBalance(int balance) {this.balance = balance;}}


