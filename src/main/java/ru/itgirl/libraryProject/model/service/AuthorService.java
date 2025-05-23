package ru.itgirl.libraryProject.model.service;

import ru.itgirl.libraryProject.model.dto.AuthorCreateDto;
import ru.itgirl.libraryProject.model.dto.AuthorDto;
import ru.itgirl.libraryProject.model.dto.AuthorUpdateDto;


public interface AuthorService {
    AuthorDto getAuthorById(Long id);

    AuthorDto getAuthorByNameV1(String name);

    AuthorDto getAuthorByNameV2(String name);

    AuthorDto getAuthorByNameV3(String name);

    AuthorDto createAuthor(AuthorCreateDto authorCreateDto);

    AuthorDto updateAuthor(AuthorUpdateDto authorUpdateDto);

    void deleteAuthor(Long id);
}
