package guru.ramin.springframework.spring5webapp.repositories;

import guru.ramin.springframework.spring5webapp.domain_model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
