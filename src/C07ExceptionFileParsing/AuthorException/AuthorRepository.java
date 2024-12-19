package C07ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

//저장소 역할을 하는 계층
public class AuthorRepository {
    private static List<Author> authorList = new ArrayList<>();
    public void register(Author author){
        authorList.add(author);
    }
    public Optional<Author> findByEmail(String email){
//        email로 Author를 찾는 로직
        Optional<Author> opt_author = Optional.empty();
                for (int i = 0; i< authorList.size();i++){
                    if(authorList.get(i).getEmail().equals(email)){
                        opt_author = Optional.ofNullable(authorList.get(i));
                    }
                }
//        Optional.ofNullable(opt_author.orElseThrow(() -> new NoSuchElementException("해당 이메일은 존재하지않습니다.")));
                return opt_author;

        }

    public List<Author> findAll(){
        return this.authorList;
    }

}
