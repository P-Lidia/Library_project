package ru.itgirl.libraryProject.model.service;

import ru.itgirl.libraryProject.model.dto.AuthorDto;


public interface AuthorService {
    AuthorDto getAuthorById(Long id);
}
