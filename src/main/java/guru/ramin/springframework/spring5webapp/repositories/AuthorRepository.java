package guru.ramin.springframework.spring5webapp.repositories;

import guru.ramin.springframework.spring5webapp.domain_model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
