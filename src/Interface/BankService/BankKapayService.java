package Interface.BankService;

public class BankKapayService implements BankService {
    BankAccount Account;
    BankKapayService(int Account){this.Account= new BankAccount(Account);}

    @Override
    public void deposit(int balance) {
        Account.setBalance(balance);
        print("[KaKao]" + balance +"원이 입금되었습니다.");
        print("[KaKao] 잔액은" + Account.getBalance() +"원 입니다");}

    @Override
    public void withdraw(int balance) {
        if (Account.getBalance() < balance)
            print("[KaKao] : 잔액부족입니다.");
        else {
            print("[KaKao] 잔고가 " + Account.getBalance());
            Account.setBalance(Account.getBalance() - balance);
            print("에서 "+Account.getBalance()+"으로 변경되었습니다.");}}

    private void print(String a) {System.out.println(a);}}

