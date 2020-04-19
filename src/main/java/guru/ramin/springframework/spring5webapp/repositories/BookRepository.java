package guru.ramin.springframework.spring5webapp.repositories;

import guru.ramin.springframework.spring5webapp.domain_model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
