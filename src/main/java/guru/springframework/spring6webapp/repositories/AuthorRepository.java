package guru.springframework.spring6webapp.repositories;

import guru.springframework.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

// Para devolver List<Author> [ListCrudRepository] en vez de Iterable<Author> [CrudRepository]
// public interface AuthorRepository extends CrudRepository<Author, Long> {
// Hay que modificar ser service y serviceImpl así como el controller
public interface AuthorRepository extends ListCrudRepository<Author, Long> {

}
