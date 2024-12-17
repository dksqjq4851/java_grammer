package C04Interface.BankService;

public class BankKakaoService implements BankService{
    @Override
    public void deposit(int money, BankAccount ba) {
        if (ba.getBalance()==0){
            ba.updateBalance(money);
            System.out.println(money + "원 카카오페이로 입금 되었습니다.");
            System.out.println("현재 잔액은 "+ba.getBalance()+"원 입니다.");
        }else{
            ba.updateBalance(ba.getBalance()+money);
            System.out.println(money + "원 카카오페이로 입금 되었습니다.");
            System.out.println("현재 잔액은 "+ba.getBalance()+"원 입니다.");
        }
    }

    @Override
    public void withdraw(int money, BankAccount ba) {
        if(ba.getBalance()<money){
            System.out.println("잔액부족");
        }else {
            ba.updateBalance(ba.getBalance()-money);
            System.out.println(money + "원 카카오페이로 출금 되었습니다.");
            System.out.println("현재 잔액은 "+ba.getBalance()+"원 입니다.");
        }
    }
}
