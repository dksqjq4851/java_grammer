package C02ClassBasic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankService2 {
    public static void main(String[] args) {
        Map<String, BankAccount2> map = new HashMap<>();
        while(true){
            System.out.println("이용하실 서비스 번호를 입력해주세요.");
            System.out.println("1.개설 2.조회 3.입금 4.출금 5.송금 \n종료하시려면 0번을 입력해주세요.");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input==1){
                System.out.println("개설 서비스입니다. \n사용하실 계좌번호를 4자로 입력해주세요.");
                Scanner sc1 = new Scanner(System.in);
                String input1 = sc1.nextLine();
                if(input1.length()!=4){
                    System.out.println("잘못된 번호입니다.");
                }else if(map.containsKey(input1)){
                    System.out.println("이미 있는 계좌번호입니다. 다른 번호를 입력해주세요.");
                }
                else {
                    System.out.println("개설할 계좌에 넣을 금액을 말씀해주세요");
                    Scanner sc2 = new Scanner(System.in);
                    int input2 = sc2.nextInt();
                    if(input2<0){
                        System.out.println("잘못된 금액입니다.");
                    }else {
                        map.put(input1, new BankAccount2(input1, input2));
                        System.out.println("계좌가 개설되었습니다.");
                    }
                }
            }
            else if(input==2){
                System.out.println("조회서비스입니다. \n조회할 계좌번호를 입력하세요.");
                Scanner sc1 = new Scanner(System.in);
                String input1 = sc1.nextLine();
                if(!map.containsKey(input1)){
                    System.out.println("없는계좌입니다.");
                }else {
                    System.out.println(input1 + " 계좌의 남은 금액은" + map.get(input1).getBalance() +"원 입니다.");
                }
            }
            else if(input==3){
                System.out.println("입금서비스입니다. \n입금할 계좌번호를 입력하세요");
                Scanner sc1 = new Scanner(System.in);
                String input1 = sc1.nextLine();
                if(!map.containsKey(input1)){
                    System.out.println("없는계좌입니다.");
                }else{
                    System.out.println("입금할금액을 입력해주세요.");
                    Scanner sc2 = new Scanner(System.in);
                    int input2 = sc2.nextInt();
                    BankAccount2 ba = map.get(input1);
                    ba.insertMoney(input2);
                }
            }
            else if(input==4){
                System.out.println("출금서비스입니다. \n출금할 계좌번호를 입력하세요");
                Scanner sc1 = new Scanner(System.in);
                String input1 = sc1.nextLine();
                if(!map.containsKey(input1)){
                    System.out.println("없는계좌입니다.");
                }else {
                    System.out.println("출금할금액을 입력해주세요");
                    Scanner sc2 = new Scanner(System.in);
                    int money = sc2.nextInt();
                    BankAccount2 ba = map.get(input1);
                    ba.outMoney(money);
                }
            }
            else if(input==5){
                System.out.println("송금서비스입니다. \n송금할 계좌번호를 입력하세요");
                Scanner sc1 = new Scanner(System.in);
                String input1 = sc1.nextLine();
                if(!map.containsKey(input1)){
                    System.out.println("없는 계좌입니다.");
                }else {
                    System.out.println("송금받을 계좌번호를 입력하세요");
                    Scanner sc2 = new Scanner(System.in);
                    String input2 = sc2.nextLine();

                    if(!map.containsKey(input2)){
                        System.out.println("없는 계좌입니다.");
                    }else {
                        System.out.println("송금할 금액을 입력해주세요");
                        Scanner sc3 = new Scanner(System.in);
                        int money = sc3.nextInt();
                        BankAccount2 b1 = map.get(input1);
                        BankAccount2 b2 = map.get(input2);
                        b1.transfer(b2, money);
                    }
                }

            }
            else if(input==0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else {
                System.out.println("잘못 입력하였습니다.");
            }
        }


    }
    public static boolean isAccountNumber(){
        return false;
    }
}


class BankAccount2{
    static long id;
    private long user_id;
    private String account;
    private int balance;

    public BankAccount2(String account, int balance){
        id++;
        this.account = account;
        this.balance = balance;
        this.user_id = id;

    }


    public static long getId() {
        return id;
    }

    public long getUser_id() {
        return user_id;
    }

    public String getAccount() {
        return account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void insertMoney(int money){
        if(money<0){
            System.out.println("잘못된금액입니다.");
            return;
        }
        this.balance += money;
    }
    public void outMoney(int money){
        if(money<0){
            System.out.println("잘못된금액입니다.");
            return;
        }else if(this.balance<money){
            System.out.println("계좌에 잔액이 모자릅니다.");
            return;
        }else{
            this.balance -= money;
        }
    }
    public void transfer(BankAccount2 b, int money){
        this.outMoney(money);
        b.insertMoney(money);
        System.out.println("송금되었습니다.");
    }

}