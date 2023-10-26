package guru.springframework.spring6webapp.repositories;

import guru.springframework.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

// Para devolver List<Book> [ListCrudRepository] en vez de Iterable<Book> [CrudRepository]
// public interface BookRepository extends CrudRepository<Book,Long> {
public interface BookRepository extends ListCrudRepository<Book,Long> {
}
