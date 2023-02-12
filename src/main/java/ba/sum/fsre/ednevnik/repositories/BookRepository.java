package ba.sum.fsre.ednevnik.repositories;

import ba.sum.fsre.ednevnik.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}