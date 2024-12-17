package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    public static void main(String[] args) {
//        1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
//        2.회원 전체 목록 조회 : id, email
//        3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수
//        4.게시글 작성 : 제목, 내용, 작성자Email -> author_id를 찾아서 author_id로 변경 입력, id값(auto_increment)
//        5.게시물 목록 조회 : id(post), title
//        6.게시물 상세 조회 : id(post), title, contents, 작성자email
//        7.서비스 종료
        List<Author> authors = new ArrayList<>();
        List<Post> posts = new ArrayList<>();


        while (true){
            System.out.println("안녕하세요 원하시는 서비스를 선택하세요.\n1.회원가입" +
                    " 2.회원 전체 목록 조회 3.회원 상세 조회 4.게시글 작성 5.게시물 목록 조회 6.게시물 상세 조회 7.서비스종료");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if(input==1){
                System.out.println("회원가입 서비스입니다.");
                System.out.println("회원가입하시는 분의 이름을 입력해주세요.");
                Scanner sc1 = new Scanner(System.in);
                String name = sc1.nextLine();
                System.out.println("이메일을 입력해주세요");
                Scanner sc2 = new Scanner(System.in);
                String email = sc2.nextLine();

                if(authors.size()==0){
                    System.out.println("비밀번호를 입력해주세요");
                    Scanner sc3 = new Scanner(System.in);
                    String password = sc3.nextLine();
                    authors.add(new Author(name, email, password));
                    System.out.println("회원가입이 완료되었습니다.");
                }else {
                    for (Author a : authors){
                        if (a.getEmail().equals(email)){
                            System.out.println("이미 존재하는 이메일 입니다.");
                        }
                    }
                }
            }else if(input==2){
                System.out.println("회원전체목록조회 서비스입니다.");
                for (Author a : authors){
                    System.out.println(a.getUser_id() +"  "+ a.getEmail());
                }
            }else if(input==3){
                System.out.println("회원상세조회 서비스입니다.");
                for (Author a : authors){
                    System.out.println(a.getUser_id()+" "+a.getEmail()+" "+a.getName()+" "+a.getPassword()+" "+a.getCount());
                }
            }else if(input==4){
                System.out.println("게시글 작성 서비스입니다.");
                System.out.println("제목을 입력하세요");
                Scanner sc1 = new Scanner(System.in);
                if(sc1==null){
                    System.out.println("제목을 작성하지 않았습니다. 게시글작성에 실패하였습니다.");
                }else{
                    String title = sc1.nextLine();
                    System.out.println("내용을 입력하세요");
                    Scanner sc2 = new Scanner(System.in);
                    if(sc2 == null){
                        System.out.println("내용이 없습니다. 게시글작성에 실패하였습니다.");
                    }else{
                        String contents = sc2.nextLine();
                        System.out.println("작성자의 이메일을 입력하세요.");
                        Scanner sc3 = new Scanner(System.in);
                        String email = sc3.nextLine();
                        for(Author a : authors){
                            if(!a.getEmail().equals(email)){
                                System.out.println("회원가입하신 이메일이 아닙니다. 게시글작성에 실패하였습니다.");
                            }else {
                                int id = a.getUser_id();
                                posts.add(new Post(title, contents, id));
                                a.setCount(1);
                                System.out.println("게시글 작성이 완료되었습니다.");

                            }
                        }
                    }
                }


            }else if(input==5){
                System.out.println("게시글 목록 조회 서비스입니다.");
                if(posts.size()==0) {
                    System.out.println("아직 작성된 게시글이 없습니다.");
                }
                    else{
                        for (Post p : posts) {
                            System.out.println(p.getPost_id() + "  " + p.getTitle());
                        }
                    }

            }else if(input==6){
                System.out.println("게시글 상세 조회 서비스입니다.");
                if(posts.size()==0){
                    System.out.println("아직 작성된 게시글이 없습니다.");
                }else {
                    for (Post p : posts) {
                        System.out.println(p.getPost_id() + "  " + p.getTitle() + "  " + p.getContents());
                        int id = p.getUser_id();
                        for (Author a : authors) {
                            if (a.getUser_id() == id) {
                                System.out.println(a.getEmail());
                            }
                        }
                    }
                }

            }else if(input==7){
                System.out.println("서비스를 종료합니다.");
                break;

            }else{
                System.out.println("잘못된 번호입니다.");

            }
        }
    }
}

class Author{
    private static int id = 0;
    private  String name;
    private String email;
    private String password;
    private int user_id;
    private int count;
    public Author(String name, String email, String password) {
        id++;
        this.name = name;
        this.email = email;
        this.password = password;
        this.user_id = id;
        this.count = 0;
    }


//    public int idEmail(String email){
//        Author.
//
//
//    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getUser_id() {
        return user_id;
    }

    public static int getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }
}
class Post{
    static private int id = 0;
    private String title;
    private String contents;
    private int user_id;
    private int post_id;

    public Post(String title, String contents, int user_id){
        id++;
        this.title = title;
        this.contents = contents;
        this.user_id = user_id;
        this.post_id = id;
    }

    public static int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getPost_id() {
        return post_id;
    }
}
