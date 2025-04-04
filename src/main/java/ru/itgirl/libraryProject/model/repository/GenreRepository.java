package ru.itgirl.libraryProject.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itgirl.libraryProject.model.entity.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
