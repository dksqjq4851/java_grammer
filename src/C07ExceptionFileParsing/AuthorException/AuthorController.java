package C07ExceptionFileParsing.AuthorException;

import java.util.NoSuchElementException;
import java.util.Scanner;

//사용자의 입출력을 받아 처리하는 계층(Controller)
public class AuthorController {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorService();
        while(true){
            System.out.println("회원가입 1번, 로그인 2번, 회원목록조회3번");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if(input.equals("1")){
                System.out.println("이름을 입력해주세요.");
                String name = sc.nextLine();
                System.out.println("email을 입력해주세요.");
                String email = sc.nextLine();
                System.out.println("password을 입력해주세요.");
                String password = sc.nextLine();
//                email중복방지, password길이 8자리 이상이어야함
                try{
                    authorService.register(name, email, password);
                }catch (IllegalArgumentException i){
                    System.out.println(i.getMessage());
                }
            }else if(input.equals("2")){
                System.out.println("email을 입력해주세요.");
                String email = sc.nextLine();
                System.out.println("password을 입력해주세요.");
                String password = sc.nextLine();
//                email과 password가 맞는지 검증.
                try{
                    authorService.login(email, password);
                }catch (NoSuchElementException n){
                    System.out.println(n.getMessage());
                }
            }else if(input.equals("3")){
                authorService.findAll();
//                전체목록을 서비스로부터 받아와서 출력.
            }
        }
    }
}
