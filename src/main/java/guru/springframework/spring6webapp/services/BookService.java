package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
}
