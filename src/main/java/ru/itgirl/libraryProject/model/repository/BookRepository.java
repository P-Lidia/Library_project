package ru.itgirl.libraryProject.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itgirl.libraryProject.model.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
