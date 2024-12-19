package C07ExceptionFileParsing.AuthorException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

//핵심 로직을 구현하는 계층
public class AuthorService {
    private AuthorRepository authorRepository;
    public AuthorService(){
        authorRepository = new AuthorRepository();
    }
    public void register(String name, String email, String password){
        Optional<Author> checkEmail = this.authorRepository.findByEmail(email);
        if(password.length()<8){
            throw new IllegalArgumentException("비밀번호 오류");
        }else if(checkEmail.isPresent()){
            if(checkEmail.get().getEmail().equals(email)) {
                throw new IllegalArgumentException("중복 이메일 오류");
            }
        }
        Author author = new Author(name, email, password);
        this.authorRepository.register(author);
        System.out.println("회원가입에 성공하였습니다.");
    }
    public void login(String email, String password){
        Optional<Author> author = this.authorRepository.findByEmail(email);
        if (author.isEmpty()){
            throw new NoSuchElementException("없는 이메일 입력 오류");
        }
        if (author.get().getPassword().equals(password)){
        }else {
            throw new NoSuchElementException("틀린 비밀번호 입력 오류");
        }
        System.out.println("로그인에 성공하였습니다!");

    }
    public void findAll() {
        StringBuilder sb = new StringBuilder();
        for (Author a : this.authorRepository.findAll()) {
            System.out.println(a.toString());
        }
    }
}
