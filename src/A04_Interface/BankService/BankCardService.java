package A04_Interface.BankService;

public class BankCardService implements BankService {
    BankAccount Account;
    BankCardService(int Account){this.Account= new BankAccount(Account);}

    @Override
    public void deposit(int balance) {
        Account.setBalance(balance);
        print("[Card]" + balance +"원이 입금되었습니다.");
        print("[Card] 잔액은" + Account.getBalance() +"원 입니다");}

    @Override
    public void withdraw(int balance) {
        if (Account.getBalance() < balance)
            print("[Card] : 잔액부족입니다.");
        else {
            print("[Card] 잔고가 " + Account.getBalance());
            Account.setBalance(Account.getBalance() - balance);
            print("에서 "+Account.getBalance()+"으로 변경되었습니다.");}}

    private void print(String a) {System.out.println(a);}}
