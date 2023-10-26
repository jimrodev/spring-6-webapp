package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Author;

import java.util.List;

public interface AuthorService {
    List<Author> findAll();
}
