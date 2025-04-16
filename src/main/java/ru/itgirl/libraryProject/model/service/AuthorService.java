package ru.itgirl.libraryProject.model.service;

import ru.itgirl.libraryProject.model.dto.AuthorDto;


public interface AuthorService {
    AuthorDto getAuthorById(Long id);

    AuthorDto getAuthorByNameV1(String name);

    AuthorDto getAuthorByNameV2(String name);

    AuthorDto getAuthorByNameV3(String name);
}
