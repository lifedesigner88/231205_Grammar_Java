package A04_Interface.BankService;

public class BankController {
    public static void main(String[] args) {

        BankService sejongBank = new BankKapayService(2023001);
        BankService sejongKakao = new BankCardService(2023002);

        print("");
        sejongBank.deposit(2000);
        sejongBank.withdraw(1000);

        print("");
        sejongKakao.deposit(2000);
        sejongKakao.withdraw(1000);

    }

    static private void print(String a) {
        System.out.println(a);
    }
}
