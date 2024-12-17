package C04Interface.BankService;

public class BankCardService implements BankService{
    @Override
    public void deposit(int money, BankAccount ba) {
        if (ba.getBalance()==0){
            ba.updateBalance(money);
            System.out.println(money + "원 카드로 입금 되었습니다.");
            System.out.println("현재 잔액은 "+ba.getBalance()+"원 입니다.");
        }else{
            ba.updateBalance(ba.getBalance()+money);
            System.out.println(money + "원 카드로 입금 되었습니다.");
            System.out.println("현재 잔액은 "+ba.getBalance()+"원 입니다.");
        }
    }

    @Override
    public void withdraw(int money, BankAccount ba) {
        if(ba.getBalance()<money){
            System.out.println("잔액부족");
        }else {
            ba.updateBalance(ba.getBalance()-money);
            System.out.println(money + "원 카드로 출금 되었습니다.");
            System.out.println("현재 잔액은 "+ba.getBalance()+"원 입니다.");
        }

    }
//    입금시 : xx원 카드로 입금되었습니다.
//    현재 잔액은 yy원 입니다.

//    출금시
//    xx원 카드로 출금되었습니다.
//    현재 잔액은 yy원입니다.
}
