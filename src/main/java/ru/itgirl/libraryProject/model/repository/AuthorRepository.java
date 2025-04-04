package ru.itgirl.libraryProject.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itgirl.libraryProject.model.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
