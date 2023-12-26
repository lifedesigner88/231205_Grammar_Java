package A07_ExceptionParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;

class AuthorRepository {
    List<Author> authors ;

    AuthorRepository(){
        authors = new ArrayList<>();
    }

    void register(Author author){
        this.authors.add(author);
    }

    Author getAuthorByEmail(String email) {
        for (Author a : this.authors)
            if(a.getEmail().equals(email))
                return a;
        return null;
    }
}
