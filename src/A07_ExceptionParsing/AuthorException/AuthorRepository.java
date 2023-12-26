package A07_ExceptionParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class AuthorRepository {
    List<Author> authors = new ArrayList<>() ;


    Author register(Author author){
        this.authors.add(author);
        return this.authors.get(authors.size() - 1);
    }

    Optional<Author> getAuthorByEmail(String email) {
        for (Author a : this.authors)
            if(a.getEmail().equals(email))
                return Optional.of(a);
        return Optional.empty();
    }
}
