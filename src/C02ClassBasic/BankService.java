package C02ClassBasic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankService {
    public static void main(String[] args) {

        Map<String, BankAccount> map = new HashMap<>();
        while (true){
            System.out.println("이용하실 서비스 번호를 입력해주세요.");
            System.out.println("1.개설 2.조회 3.입금 4.출금 5.송금  \n종료하시려면 0번을 눌러주세요");
            Scanner sc1 = new Scanner(System.in);
            String input1 = sc1.nextLine();
//        1.개설 : 계좌번호와 현재 가지고 계신돈을 입력하세요.
            if(input1.equals("1")){
                System.out.println("개설 서비스입니다.");
                System.out.println("개설할 계좌번호(6자)를 입력하세요.");
                Scanner sc2 = new Scanner(System.in);
                String newAccount = sc2.nextLine();
                if(newAccount.length()!=6){
                    System.out.println("잘못된 계좌번호입니다.");
                }else if(map.containsKey(newAccount)){
                    System.out.println("이미 개설된 계좌번호입니다.");
                }else {
                    System.out.println("현재 가지고 있는 잔액을 입력하세요");
                    Scanner sc3 = new Scanner(System.in);
                    int balance = sc3.nextInt();
                    if (balance<0){
                        System.out.println("잘못된 입력입니다.");
                    }else{
                        map.put(newAccount, new BankAccount(newAccount, balance));
                        System.out.println("계좌번호 " + newAccount + "로 계좌가 개설되었습니다.");
                    }

                }


            }
//        2.조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요. -> 잔고출력
            else if (input1.equals("2")){
                System.out.println("조회서비스입니다.");
                System.out.println("조회할 계좌번호를 입력하세요");
                Scanner sc4 = new Scanner(System.in);
                String checkNum = sc4.nextLine();
                if(!map.containsKey(checkNum)){
                    System.out.println("없는 계좌번호입니다.");
                }else {
                    System.out.println(checkNum + " 계좌의 잔액은" + map.get(checkNum).getBalance() + "입니다.");
                }
            }
//        3.입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요.
            else if (input1.equals("3")){
                System.out.println("입금서비스입니다.");
                System.out.println("입금할 계좌번호를 입력하세요");
                Scanner sc5 = new Scanner(System.in);
                String insertNum = sc5.nextLine();
                if(!map.containsKey(insertNum)){
                    System.out.println("없는 계좌번호입니다.");
                }else {
                    System.out.println("입금할 금액을 입력해주세요.");
                    Scanner sc6 = new Scanner(System.in);
                    int insertMoney = sc6.nextInt();
                    if(insertMoney<0){
                        System.out.println("잘못된 금액입니다.");
                    }else {
                        BankAccount account = map.get(insertNum);
                        account.insertBalance(insertMoney);
                    }
                }
            }
            else if (input1.equals("4")){
                System.out.println("출금서비스입니다.");
                System.out.println("출금할 계좌번호를 입력하세요");
                Scanner sc5 = new Scanner(System.in);
                String outNum = sc5.nextLine();
                if(!map.containsKey(outNum)){
                    System.out.println("없는 계좌번호입니다.");
                }else {
                    System.out.println("출금할 금액을 입력해주세요.");
                    Scanner sc7 = new Scanner(System.in);
                    int outMoney = sc7.nextInt();
                    if(outMoney <0){
                        System.out.println("잘못된 금액입니다.");
                    }else if(map.get(outNum).getBalance()<outMoney){
                        System.out.println("잔액이 부족합니다.");
                    }
                    else {
                        BankAccount account = map.get(outNum);
                        account.insertBalance(outMoney);
                    }
                }
            }
            else if (input1.equals("5")){
                System.out.println("송금서비스입니다.");
                System.out.println("보낼 계좌번호를 입력하세요.");
                Scanner sc7 = new Scanner(System.in);
                String sendNum = sc7.nextLine();
                if(!map.containsKey(sendNum)){
                    System.out.println("틀린 계좌번호입니다.");
                }else {
                    System.out.println("받을 계좌번호를 입력하세요");
                    Scanner sc8 = new Scanner(System.in);
                    String receiveNum = sc8.nextLine();
                    if(!map.containsKey(receiveNum)){
                        System.out.println("틀린 계좌번호입니다.");
                    }else{
                        System.out.println("보낼 금액을 입력하세요");
                        Scanner sc9 = new Scanner(System.in);
                        int money = sc9.nextInt();
                        if(map.get(sendNum).getBalance()<money){
                            System.out.println("잔액이 부족합니다.");
                        }else {
                            BankAccount account1 = map.get(sendNum);
                            BankAccount account2 = map.get(receiveNum);
                            account1.outBalance(money);
                            account2.insertBalance(money);
                        }
                    }
                }

            }else if(input1.equals("0")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else if(input1.equals("8877")){
                System.out.println("관리자 모드입니다. user_id를 검색하고싶은 계좌번호를 입력하세요.");
                Scanner sc10 = new Scanner(System.in);
                String searchNum = sc10.nextLine();
                if(!map.containsKey(searchNum)){
                    System.out.println("없는계좌번호입니다.");
                }else {
                    System.out.println(searchNum + "의 user_id는 " + map.get(searchNum).getUser_id()+"입니다.");
                }
            }
            else {
                System.out.println("잘못된 번호입니다.");
            }





        }
//        프로그램은 항상 실행될수 있도록 전체코드를 while(true)처리
//        서비서 번호를 입력하세요. 1. 개설 2.조회 3.입금 4. 출금 5. 송금
//        2.조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요. -> 잔고출력

//        3.입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요.

//        4.출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.

//        5.송금 : 계좌송금서비스입니다. 내계좌번호, 상대계좌번호와 송금금액을 입력해주세요.


    }
}
//Account객체 : 자체ID값(자동 icrement), 계좌번호, 잔액 변수로 구성
class BankAccount{
    static long user_id = 1;
    private String acnumber;
    private int balance;

    public BankAccount(String acnumber, int balance){
        this.acnumber = acnumber;
        this.balance = balance;
        this.user_id = user_id;
        user_id++;
    }
    public long getUser_id() {
        return user_id;
    }
    public String getAcnumber() {
        return acnumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public int insertBalance(int balance) {
        this.balance += balance;
        return this.balance;
    }
    public int outBalance(int balance) {
        this.balance -= balance;
        return this.balance;
    }

}
