package ru.itgirl.libraryProject.model.service;

import ru.itgirl.libraryProject.model.dto.GenreDto;

public interface GenreService {
    GenreDto getGenreById(Long id);
}
