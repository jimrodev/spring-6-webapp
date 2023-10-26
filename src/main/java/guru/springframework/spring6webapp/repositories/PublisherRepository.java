package guru.springframework.spring6webapp.repositories;

import guru.springframework.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

// Para devolver List<Publisher> [ListCrudRepository] en vez de Iterable<Publisher> [CrudRepository]
// public interface PublisherRepository extends CrudRepository<Publisher, Long> {
public interface PublisherRepository extends ListCrudRepository<Publisher, Long> {
}
