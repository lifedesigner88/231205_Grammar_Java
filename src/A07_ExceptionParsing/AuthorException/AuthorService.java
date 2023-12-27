package A07_ExceptionParsing.AuthorException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

class AuthorService {

    AuthorRepository authorRepository = new AuthorRepository();

//
//    AuthorService(){
//        authorRepository = new AuthorRepository();
//    }


    Author register(Author author) throws IllegalArgumentException{

        Optional<Author> dbAuthor = authorRepository.getAuthorByEmail(author.getEmail());

        if (dbAuthor.isPresent())           // 독립사건.
           throw new IllegalArgumentException("중복된 이메일이 있습니다 " + dbAuthor.get().getEmail());
        else if (author.getPassword().length() <= 5)
           throw new IllegalArgumentException("비밀번호가 짧습니다");
        else
           return authorRepository.register(author);
    }


//    예외처리를 이미 거쳤기 때문에 Author로 받아도 될 것 같다.
    Author login(String email, String password) throws NoSuchElementException, IllegalArgumentException {

//        email이 존재하지 않으면 예외 발생(NosuchElementException)

        Optional<Author> dbAuthor = authorRepository.getAuthorByEmail(email);
        if (dbAuthor.isEmpty())             // 2중 이프 안쓰고
            throw new NoSuchElementException("이메일이 없습니다.");
        else if (!dbAuthor.get().getPassword().equals(password))
            throw new IllegalArgumentException("비밀번호가 틀립니다.");
        else
            return dbAuthor.get();
    }

    static void print(String a) {
        System.out.println(a);
    }
}
