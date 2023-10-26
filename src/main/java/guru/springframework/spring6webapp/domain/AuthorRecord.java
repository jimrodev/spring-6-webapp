package guru.springframework.spring6webapp.domain;

import java.util.Set;

public record AuthorRecord(
        Long id,
        String firstName,
        String lastName,
        Set<Book> books
) {
    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", books=" + books +
                '}';
    }
}
