package A07_ExceptionParsing.AuthorException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

class AuthorService {

    AuthorRepository authorRepository;

    AuthorService(){
        authorRepository = new AuthorRepository();
    }



    void register(Author author){

        Author dbAuthor = authorRepository.getAuthorByEmail(author.getEmail());

        if (dbAuthor != null)
            throw new IllegalArgumentException("중복된 이메일이 있습니다 " + dbAuthor.getEmail());

        else
            if (author.getPassword().length() <= 5)
               throw new IllegalArgumentException("비밀번호가 짧습니다");
            else
               authorRepository.register(author);

        print("성공적으로 가입되었습니다. " + author.toString());

    }


    Optional<Author> login(){

//        email이 존재하지 않으면 예외 발생(NosuchElementException)

        List<Author> authorRepository.getAuthors(author);


        Optional<Author> author1 = Optional.empty();
        author1.Optional.of(author)
//        비밀번호가 틀리면 예외 발생 (illegalArgumentException);

        return null;
    }

    static void print(String a) {
        System.out.println(a);
    }
}
