package A01_Basic;

public class BankService {



    public static void main(String[] args) {



        BankAccount woori001 = new BankAccount(1234);

        woori001.deposit(4500);
        woori001.withdraw(23480);
        print("우리은행" + woori001.getBalance());

        BankAccount woori002 = new BankAccount(12344);

        woori002.deposit(4510);
        woori002.withdraw(2348011);
        print("우리은행" + woori001.getBalance());


    }

    static private void print(String a){
        System.out.println(a);


    }

}


class BankAccount {
    private final int account_number;
    private int balance;

//    별도의 생성자를 만들지 앟으면 매개변수 없는 기본 생성자가 숨겨져 있다.


    BankAccount(int Account){
        account_number = Account;
    }

    void deposit(int balance){
        this.balance += balance;
    }

    void withdraw(int balance){
        if (this.balance < balance)
            print("잔액이 부족합니다");
        else
            this.balance -= balance;
    }

    int getBalance(){
        return balance;
    }

    int getAccount_number(){
        return account_number;
    }

    private void print(String a) {
        System.out.println(a);
    }
}



// BankController 클래스
// BankService 인터페이스
// BankService 구현체
// 엔티티